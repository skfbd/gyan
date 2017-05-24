package edu.sms.dao.organization;

import edu.sms.dao.genric.IDaoBase;

import edu.sms.entity.organization.OrganizationEntity;

public interface OrganizationDAO extends IDaoBase<OrganizationEntity>{
	public void save(OrganizationEntity organizationEntity);
	public OrganizationEntity saveUpdateOrg(OrganizationEntity OrganizationEntity);
}
 