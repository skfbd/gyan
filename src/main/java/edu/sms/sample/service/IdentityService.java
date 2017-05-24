package edu.sms.sample.service;

import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.Sha512Hash;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.sms.sample.domain.Identity;
import edu.sms.sample.form.RegistrationForm;
import edu.sms.sample.persistence.IdentityMapper;


@Service
public class IdentityService {

  @Autowired(required = true)
  private IdentityMapper identityMapper;

  private static final Logger logger = LoggerFactory.getLogger(IdentityService.class);

  public IdentityMapper getIdentityMapper() {
    return identityMapper;
  }

  public Identity registerIdentity(RegistrationForm registration) {

    registration.setSalt(getSalt());
    registration.setPassphrase(encodePassphrase(registration.getPassphrase(), registration.getSalt()));

    // Insert the Identity
    identityMapper.registerIdentity(registration);

    logger.trace("INSERTED ID = (" + registration.getId() + ")");
    // Get a new Identity object, fully populated from the DB
    return this.getIdentity(registration.getId());

  }

  public static String getSalt() {
    return new SecureRandomNumberGenerator().nextBytes().toBase64();
  }

  public String getApplicationSalt() {
    return "some salty value for this application";//env.getProperty("shiro.applicationSalt");
  }

  public String getCombinedSalt(String salt) {
    return "some salty value for this application"+ ":" + salt;//env.getProperty("shiro.applicationSalt") + ":" + salt;
  }

  public String encodePassphrase(String rawPassphrase, String salt) {
    return new Sha512Hash(rawPassphrase, getCombinedSalt(salt), getIterations()).toBase64();
  }

  public Integer getIterations() {
    return new Integer(1024);//Integer.parseInt(env.getProperty("shiro.hashIterations"));
  }

  public Identity getIdentity(int id) {
    logger.trace("Entering getIdentity(" + id + ")");
    if (identityMapper == null) {
      logger.debug("identityMapper didn't get autowired!");
    }
    return identityMapper.getIdentityById(id);
  }

  public Identity getIdentity(String userId) {
    logger.trace("Entering getIdentity(" + userId + ")");
    if (identityMapper == null) {
      logger.debug("identityMapper didn't get autowired!");
    }
    return identityMapper.getIdentityByUserId(userId);
  }

  public void setIdentityMapper(IdentityMapper identityMapper) {
    this.identityMapper = identityMapper;
  }
}