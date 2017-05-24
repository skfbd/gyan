package edu.sms.dao;

import edu.sms.dao.genric.IDaoBase;

import edu.sms.entity.SchoolEntity;

public interface SchoolDAO extends IDaoBase<SchoolEntity>{
	public void save(SchoolEntity schoolEntity);
	public SchoolEntity saveUpdateSchool(SchoolEntity schoolEntity);
}
