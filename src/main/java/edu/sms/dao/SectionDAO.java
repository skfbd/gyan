package edu.sms.dao;

import java.util.List;

import edu.sms.dao.genric.IDaoBase;
import edu.sms.entity.SectionEntity;
import edu.sms.model.SectionForm;

public interface SectionDAO extends IDaoBase<SectionEntity>{
	public List<SectionForm> getSectionList();
	public SectionEntity saveSection(SectionEntity sectionEntity);
}
