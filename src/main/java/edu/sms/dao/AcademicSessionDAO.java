package edu.sms.dao;

import java.util.List;

import edu.sms.dao.genric.IDaoBase;
import edu.sms.entity.AcademicSessionEntity;
import edu.sms.model.AcademicSessionForm;

public interface AcademicSessionDAO extends IDaoBase<AcademicSessionEntity>{
	public List<AcademicSessionForm> getAcademicSession();
    public AcademicSessionEntity saveAcademicSession(AcademicSessionEntity academicSessionEntity);
}
