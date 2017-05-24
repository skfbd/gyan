package edu.sms.entity.LOV;

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

import edu.sms.entity.LOVEntity;

@Entity
@Table(name="student_fee_category")
public class StudentFeeCategoryLOVEntity implements LOVEntity{

	private Integer id;
	private String name;
	private String parentId;
	
	public StudentFeeCategoryLOVEntity() {
	}

	public StudentFeeCategoryLOVEntity(Integer id, String name) {
		this.id=id;
		this.name=name;
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
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
	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}
	
}
