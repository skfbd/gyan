package edu.sms.service;

import java.util.List;

import edu.sms.entity.AcademicSessionEntity;
import edu.sms.model.AcademicSessionForm;

public interface AcademicSessionService extends CRUDInjectService<AcademicSessionEntity, AcademicSessionForm>{

	public List<AcademicSessionForm> getAcademicSession();
	public AcademicSessionForm saveAcademicSession(AcademicSessionForm academicSessionFrm);

}
