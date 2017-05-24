package edu.sms.service;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.BeanUtils;

import edu.sms.dao.SchoolOrgDAO;
import edu.sms.entity.SchoolOrgGlobalConfigEntity;
import edu.sms.model.SchoolOrgGlobalConfigForm;

public class SchoolOrgServiceImpl implements SchoolOrgService  {



	private SchoolOrgDAO schoolOrgDAO;
	
	public SchoolOrgGlobalConfigEntity get(SchoolOrgGlobalConfigForm form) {
		return schoolOrgDAO.get(form.getId());
	}

	public void save(SchoolOrgGlobalConfigForm form) {
		SchoolOrgGlobalConfigEntity SchoolOrgGlobalConfigEntity = new SchoolOrgGlobalConfigEntity();
		BeanUtils.copyProperties(form, SchoolOrgGlobalConfigEntity);
		schoolOrgDAO.save(SchoolOrgGlobalConfigEntity);
	}

	public void delete(SchoolOrgGlobalConfigForm form) {
		SchoolOrgGlobalConfigEntity SchoolOrgGlobalConfigEntity = new SchoolOrgGlobalConfigEntity();
		BeanUtils.copyProperties(form, SchoolOrgGlobalConfigEntity);
		schoolOrgDAO.delete(SchoolOrgGlobalConfigEntity);
	}

	public List list(SchoolOrgGlobalConfigForm form) {
		SchoolOrgGlobalConfigEntity SchoolOrgGlobalConfigEntity = new SchoolOrgGlobalConfigEntity();
		BeanUtils.copyProperties(form, SchoolOrgGlobalConfigEntity);
		List list = schoolOrgDAO.getListByCriteria(SchoolOrgGlobalConfigEntity.getFilter());
		return list;
	}

	public SchoolOrgGlobalConfigEntity getById(Long id) {
		return schoolOrgDAO.get(id);
	}

	public void saveById(Integer id) {
		SchoolOrgGlobalConfigForm form  = new SchoolOrgGlobalConfigForm();
		form.setId(id.longValue());
		save(form);
	}

	public List<SchoolOrgGlobalConfigEntity> listByForeignId(Long parentId) {
		DetachedCriteria detachedCriteria = DetachedCriteria.forClass(SchoolOrgGlobalConfigEntity.class);
		if (parentId != 0) {
			detachedCriteria.add(Restrictions.eq("schoolId", parentId)).addOrder(Order.asc("id"));
		}
		List list = schoolOrgDAO.getListByCriteria(detachedCriteria);
		return list;
	}
	
	public void deleteById(Integer id) {
		SchoolOrgGlobalConfigForm form  = new SchoolOrgGlobalConfigForm();
		form.setId(id.longValue());
		delete(form);	
	}
	
	
	public List<SchoolOrgGlobalConfigForm> listSchoolOrgGlobal(SchoolOrgGlobalConfigForm form) {
		List<SchoolOrgGlobalConfigEntity> listEntity = schoolOrgDAO.loadAll();
		List<SchoolOrgGlobalConfigForm> schoolGlobalLst=new ArrayList<SchoolOrgGlobalConfigForm>();
		for(SchoolOrgGlobalConfigEntity schoolOrgGlobalConfigEntity:listEntity){
			SchoolOrgGlobalConfigForm schoolOrgGlobalConfigForm = new SchoolOrgGlobalConfigForm();
			BeanUtils.copyProperties(schoolOrgGlobalConfigEntity, schoolOrgGlobalConfigForm);  
			schoolGlobalLst.add(schoolOrgGlobalConfigForm);
		}
		return schoolGlobalLst;
	}
	
	
	
	public SchoolOrgGlobalConfigForm getSchoolOrgGlobal(SchoolOrgGlobalConfigForm form) {
		SchoolOrgGlobalConfigEntity schoolOrgGlobalEntity = schoolOrgDAO.get(form.getId());
		SchoolOrgGlobalConfigForm schoolOrgGlobalConfigForm = new SchoolOrgGlobalConfigForm();
		BeanUtils.copyProperties(schoolOrgGlobalEntity, schoolOrgGlobalConfigForm);  
		return schoolOrgGlobalConfigForm;
	}
	
	public String updateGlobalConfig(SchoolOrgGlobalConfigForm form){
		SchoolOrgGlobalConfigEntity schoolOrgGlobalConfigEntity=new SchoolOrgGlobalConfigEntity();
		BeanUtils.copyProperties(form, schoolOrgGlobalConfigEntity);
		schoolOrgDAO.save(schoolOrgGlobalConfigEntity);
		return "Success";
	}
	
	
	
	public void setSchoolOrgDAO(SchoolOrgDAO schoolOrgDAO) {
		this.schoolOrgDAO = schoolOrgDAO;
	}

	

}
