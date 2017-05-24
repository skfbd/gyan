package edu.sms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

@Entity
@Table(name="student_fee_category")
public class StudentFeeCategoryEntity {

	
	private String id;
	private String name;
	private String schoolId;
	private String feeCategoryType;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	@Column(name="name")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Column(name="school_id")
	public String getSchoolId() {
		return schoolId;
	}
	public void setSchoolId(String schoolId) {
		this.schoolId = schoolId;
	}
	
	@Column(name="fee_category_type")
	public String getFeeCategoryType() {
		return feeCategoryType;
	}
	public void setFeeCategoryType(String feeCategoryType) {
		this.feeCategoryType = feeCategoryType;
	}
	
	@Transient
	public DetachedCriteria getFilter(){
		DetachedCriteria detachedCriteria = DetachedCriteria.forClass(StudentFeeCategoryEntity.class);
		detachedCriteria.add(Restrictions.eq("id", id)).
		add(Restrictions.eq("name",name)).add(Restrictions.eq("schoolId", schoolId)).addOrder(Order.asc("name"));
		return detachedCriteria;
	}
	
}
