package edu.sms.service;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.BeanUtils;

import edu.sms.dao.SectionDAO;
import edu.sms.entity.SectionEntity;
import edu.sms.model.ClassForm;
import edu.sms.model.SectionForm;

public class SectionServiceImpl implements SectionService  {



	private SectionDAO sectionDAO;
	
	public SectionForm getSection(SectionForm form) {
		SectionEntity sectionEntity =sectionDAO.get(form.getId());
		SectionForm sectionfrm =new SectionForm();
		BeanUtils.copyProperties(sectionEntity, sectionfrm);
		return sectionfrm;
	}

	public SectionForm saveSection(SectionForm form) {
		SectionEntity sectionEntity = new SectionEntity();
		BeanUtils.copyProperties(form, sectionEntity);
		SectionEntity sectionEntty=sectionDAO.saveSection(sectionEntity);
		SectionForm sectionfrm =new SectionForm();
		BeanUtils.copyProperties(sectionEntty, sectionfrm);
		return sectionfrm;
	}

	public void delete(SectionForm form) {
		SectionEntity sectionEntity = new SectionEntity();
		BeanUtils.copyProperties(form, sectionEntity);
		sectionDAO.delete(sectionEntity);
	}

	public List<SectionForm> list(SectionForm form) {
		SectionEntity sectionEntity = new SectionEntity();
		BeanUtils.copyProperties(form, sectionEntity);
		//List list = sectionDAO.getListByCriteria(sectionEntity.getFilter());
		List<SectionForm> sectionLst = sectionDAO.getSectionList();
		return sectionLst;
	}

	public SectionEntity getById(Long id) {
		return sectionDAO.get(id);
	}

	public void saveById(Integer id) {
		SectionForm form  = new SectionForm();
		form.setId(id.longValue());
		save(form);
	}

	public List<SectionEntity> listByForeignId(Long parentId) {
		DetachedCriteria detachedCriteria = DetachedCriteria.forClass(SectionEntity.class);
		if (parentId != 0) {
			detachedCriteria.add(Restrictions.eq("schoolId", parentId)).addOrder(Order.asc("id"));
		}
		List list = sectionDAO.getListByCriteria(detachedCriteria);
		return list;
	}
	
	public void deleteById(Integer id) {
		SectionForm form  = new SectionForm();
		form.setId(id.longValue());
		delete(form);	
	}

	public void setSectionDAO(SectionDAO sectionDAO) {
		this.sectionDAO = sectionDAO;
	}

	public SectionEntity get(SectionForm form) {
		// TODO Auto-generated method stub
		return null;
	}

	public void save(SectionForm form) {
		// TODO Auto-generated method stub
		
	}

		

}
