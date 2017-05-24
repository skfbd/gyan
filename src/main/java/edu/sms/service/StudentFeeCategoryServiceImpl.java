package edu.sms.service;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.BeanUtils;

import edu.sms.dao.StudentFeeCategoryDAO;
import edu.sms.entity.StudentFeeCategoryEntity;
import edu.sms.model.StudentFeeCategoryForm;

public class StudentFeeCategoryServiceImpl implements StudentFeeCategoryService {
	




	private StudentFeeCategoryDAO studentFeeCategoryDAO;
	
	public StudentFeeCategoryEntity get(StudentFeeCategoryForm form) {
		return studentFeeCategoryDAO.get(form.getId());
	}

	public void save(StudentFeeCategoryForm form) {
		StudentFeeCategoryEntity studentFeeCategoryEntity = new StudentFeeCategoryEntity();
		BeanUtils.copyProperties(form, studentFeeCategoryEntity);
		studentFeeCategoryDAO.save(studentFeeCategoryEntity);
	}

	public void delete(StudentFeeCategoryForm form) {
		StudentFeeCategoryEntity studentFeeCategoryEntity = new StudentFeeCategoryEntity();
		BeanUtils.copyProperties(form, studentFeeCategoryEntity);
		studentFeeCategoryDAO.delete(studentFeeCategoryEntity);
	}

	public List list(StudentFeeCategoryForm form) {
		StudentFeeCategoryEntity studentFeeCategoryEntity = new StudentFeeCategoryEntity();
		BeanUtils.copyProperties(form, studentFeeCategoryEntity);
		List list = studentFeeCategoryDAO.getListByCriteria(studentFeeCategoryEntity.getFilter());
		return list;
	}

	public StudentFeeCategoryEntity getById(Long id) {
		return studentFeeCategoryDAO.get(id);
	}

	public void saveById(Integer id) {
		StudentFeeCategoryForm form  = new StudentFeeCategoryForm();
		form.setId(id.longValue());
		save(form);
	}

	public List<StudentFeeCategoryEntity> listByForeignId(Long parentId) {
		DetachedCriteria detachedCriteria = DetachedCriteria.forClass(StudentFeeCategoryEntity.class);
		if (parentId != 0) {
			detachedCriteria.add(Restrictions.eq("schoolId", parentId)).addOrder(Order.asc("id"));
		}
		List list = studentFeeCategoryDAO.getListByCriteria(detachedCriteria);
		return list;
	}
	
	public void deleteById(Integer id) {
		StudentFeeCategoryForm form  = new StudentFeeCategoryForm();
		form.setId(id.longValue());
		delete(form);	
	}

	public void setStudentFeeCategoryDAO(StudentFeeCategoryDAO studentFeeCategoryDAO) {
		this.studentFeeCategoryDAO = studentFeeCategoryDAO;
	}

	



}
