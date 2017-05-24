package edu.sms.service;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.BeanUtils;

import edu.sms.dao.AcademicSessionDAO;
import edu.sms.entity.AcademicSessionEntity;
import edu.sms.model.AcademicSessionForm;

public class AcademicSessionServiceImpl implements AcademicSessionService  {



	private AcademicSessionDAO academicSessionDAO;
	
	public AcademicSessionEntity get(AcademicSessionForm form) {
		return academicSessionDAO.get(form.getId());
	}

	public AcademicSessionForm saveAcademicSession(AcademicSessionForm form) {
		AcademicSessionEntity academicSessionEntity = new AcademicSessionEntity();
		BeanUtils.copyProperties(form, academicSessionEntity);
		AcademicSessionEntity acSessionEntity=academicSessionDAO.saveAcademicSession(academicSessionEntity);
		AcademicSessionForm acedmicFrm=new AcademicSessionForm();
		BeanUtils.copyProperties(acSessionEntity, acedmicFrm);   
		return acedmicFrm;
	}

	public void delete(AcademicSessionForm form) {
		AcademicSessionEntity academicSessionEntity = new AcademicSessionEntity();
		BeanUtils.copyProperties(form, academicSessionEntity);
		academicSessionDAO.delete(academicSessionEntity);
	}

	public List list(AcademicSessionForm form) {
		AcademicSessionEntity academicSessionEntity = new AcademicSessionEntity();
		BeanUtils.copyProperties(form, academicSessionEntity);
		List list = academicSessionDAO.getListByCriteria(academicSessionEntity.getFilter());
		return list;
	}

	public AcademicSessionEntity getById(Long id) {
		return academicSessionDAO.get(id);
	}

	public void saveById(Integer id) {
		AcademicSessionForm form  = new AcademicSessionForm();
		form.setId(id.longValue());
		save(form);
	}

	public List<AcademicSessionEntity> listByForeignId(Long parentId) {
		DetachedCriteria detachedCriteria = DetachedCriteria.forClass(AcademicSessionEntity.class);
		if (parentId != 0) {
			detachedCriteria.add(Restrictions.eq("schoolId", parentId)).addOrder(Order.asc("id"));
		}
		List list = academicSessionDAO.getListByCriteria(detachedCriteria);
		return list;
	}
	
	public void deleteById(Integer id) {
		AcademicSessionForm form  = new AcademicSessionForm();
		form.setId(id.longValue());
		delete(form);	
	}

	public List<AcademicSessionForm> getAcademicSession() {
	   return	academicSessionDAO.getAcademicSession();
	}
	
	
	
	public void setAcademicSessionDAO(AcademicSessionDAO academicSessionDAO) {
		this.academicSessionDAO = academicSessionDAO;
	}

	public void save(AcademicSessionForm form) {
		// TODO Auto-generated method stub
		
	}

	
	

}
