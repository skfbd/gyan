
package edu.sms.service;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.BeanUtils;

import edu.sms.dao.ClassDAO;
import edu.sms.entity.ClassEntity;
import edu.sms.model.ClassForm;

public class ClassServiceImpl implements ClassService{

	private ClassDAO classDAO;
	
	public ClassForm getClass(ClassForm form) {
		ClassEntity classEntity = classDAO.get(form.getId());
		ClassForm classfrm =new ClassForm();
		BeanUtils.copyProperties(classEntity, classfrm);
		return classfrm;
	}

	public ClassForm saveClass(ClassForm form) {
		ClassEntity classEntity = new ClassEntity();
		BeanUtils.copyProperties(form, classEntity);
		ClassEntity clEntity =classDAO.saveClass(classEntity);
		ClassForm classFrm = new ClassForm();
		BeanUtils.copyProperties(clEntity, classFrm);
		return classFrm;
	}

	public void delete(ClassForm form) {
		ClassEntity classEntity = new ClassEntity();
		BeanUtils.copyProperties(form, classEntity);
		classDAO.delete(classEntity);
	}

	public List<ClassForm> list(ClassForm form) {
		/*ClassEntity classEntity = new ClassEntity();
		BeanUtils.copyProperties(form, classEntity);
		List<ClassEntity> listEnity = classDAO.loadAll();
		List<ClassForm> formList = new ArrayList<ClassForm>();
		for(ClassEntity classEnty :listEnity){
		   ClassForm classfrm=new  ClassForm();
		   BeanUtils.copyProperties(classEnty, classfrm);
		   formList.add(classfrm);
		}*/
		List<ClassForm> classlist=classDAO.getClassList(); 
		return classlist;
	}

	public ClassEntity getById(Long id) {
		return classDAO.get(id);
	}

	public void saveById(Integer id) {
		ClassForm form  = new ClassForm();
		form.setId(id.longValue());
		save(form);
	}

	public List<ClassEntity> listByForeignId(Long parentId) {
		DetachedCriteria detachedCriteria = DetachedCriteria.forClass(ClassEntity.class);
		if (parentId != 0) {
			detachedCriteria.add(Restrictions.eq("schoolId", parentId)).addOrder(Order.asc("id"));
		}
		List list = classDAO.getListByCriteria(detachedCriteria);
		return list;
	}
	
	public void deleteById(Integer id) {
		ClassForm form  = new ClassForm();
		form.setId(id.longValue());
		delete(form);	
	}

	public void setClassDAO(ClassDAO classDAO) {
		this.classDAO = classDAO;
	}

	public ClassEntity get(ClassForm form) {
		// TODO Auto-generated method stub
		return null;
	}

	public void save(ClassForm form) {
		// TODO Auto-generated method stub
		
	}

	
}
