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
@Table(name="academic_session")
public class AcademicSessionLOVEntity implements LOVEntity{

	private Integer id;
	private String name;
	private Integer parentId;
	
	public AcademicSessionLOVEntity() {
	}

	public AcademicSessionLOVEntity(Integer id, String name) {
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

	@Column(name="student_school")
	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}
	
}
