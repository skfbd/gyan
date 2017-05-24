package edu.sms.service;

import java.util.List;

import edu.sms.entity.SectionEntity;
import edu.sms.model.ClassForm;
import edu.sms.model.SectionForm;

public interface SectionService extends CRUDInjectService<SectionEntity, SectionForm>{
	public SectionForm saveSection(SectionForm form);
	public SectionForm getSection(SectionForm form);
	public List<SectionForm> list(SectionForm form);
}
