package edu.sms.sample.persistence;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import edu.sms.sample.domain.Identity;
import edu.sms.sample.form.RegistrationForm;

@Component
public interface IdentityMapper {

  public Identity getIdentityById(@Param("id") int id);

  public Identity getIdentityByUserId(@Param("userId") String userId);

  public Integer registerIdentity(RegistrationForm registration);
}