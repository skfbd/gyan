package edu.sms.service;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import org.springframework.beans.BeanUtils;
import org.springframework.transaction.annotation.Transactional;

import edu.sms.dao.SchoolDAO;
import edu.sms.entity.SchoolEntity;
import edu.sms.entity.SchoolSchglobalconfigMapping;
import edu.sms.entity.organization.OrganizationEntity;
import edu.sms.model.OrganizationForm;
import edu.sms.model.SchoolForm;

public class SchoolServiceImpl implements SchoolService {
	private static final Logger logger = LoggerFactory.getLogger(SchoolServiceImpl.class);
	private SchoolDAO    schoolDAO;
	

	@Transactional
	public SchoolForm saveSchool(SchoolForm schoolForm) {
		SchoolEntity schoolEntity = new SchoolEntity();
		BeanUtils.copyProperties(schoolForm, schoolEntity);
		SchoolForm schoolfrm = new SchoolForm(); 
		SchoolEntity schEnt =schoolDAO.saveUpdateSchool(schoolEntity);
		BeanUtils.copyProperties(schEnt, schoolfrm);
		return schoolfrm;
	}

	@Transactional
	public List<SchoolForm> getSchoolList() {
		DetachedCriteria detachedCriteria = DetachedCriteria.forClass(SchoolEntity.class);
		List<SchoolEntity> listschEntity = schoolDAO.getListByCriteria(detachedCriteria);
		List<SchoolForm> schoolList=new ArrayList<SchoolForm>(); 
		for (SchoolEntity schEntity : listschEntity) {
			SchoolForm schfrm = new SchoolForm();
			BeanUtils.copyProperties(schEntity, schfrm);
			schoolList.add(schfrm);
		}
		return schoolList;
	}

	
	@Transactional
	public SchoolForm getSchool(Long schoolId) {
		SchoolForm schoolFrm=new SchoolForm();
		SchoolEntity schoolEntity = schoolDAO.get(schoolId);
		BeanUtils.copyProperties(schoolEntity, schoolFrm);
		return schoolFrm;
	}
	
	
	@Transactional
	public void deleteSchool(SchoolForm schoolForm) {
		SchoolEntity schoolEntity = new SchoolEntity();
		BeanUtils.copyProperties(schoolForm, schoolEntity);
		schoolDAO.delete(schoolEntity);
		
	}

	public void setSchoolDAO(SchoolDAO schoolDAO) {
		this.schoolDAO = schoolDAO;
	}
	
}
