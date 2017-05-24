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
@Table(name="section")
public class SectionEntity {
	private Long 		id;
	private Long 		schoolId;
	private Long 		academicSessionId;
	private Long 		classId;
	private Long 		classTeacherId;
	private Long 		secondClassTeacherId;
	private String 		name;
	private String      description;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	@Column(name = "name")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Column(name = "school_id")
	public Long getSchoolId() {
		return schoolId;
	}
	public void setSchoolId(Long schoolId) {
		this.schoolId = schoolId;
	}
	
	@Column(name = "academic_session_id")
	public Long getAcademicSessionId() {
		return academicSessionId;
	}
	public void setAcademicSessionId(Long academicSessionId) {
		this.academicSessionId = academicSessionId;
	}
	
	@Column(name = "class_id")
	public Long getClassId() {
		return classId;
	}
	public void setClassId(Long classId) {
		this.classId = classId;
	}
	
	@Column(name = "class_teacher_id")
	public Long getClassTeacherId() {
		return classTeacherId;
	}
	public void setClassTeacherId(Long classTeacherId) {
		this.classTeacherId = classTeacherId;
	}
	
	@Column(name = "second_class_teacher_id")
	public Long getSecondClassTeacherId() {
		return secondClassTeacherId;
	}
	public void setSecondClassTeacherId(Long secondClassTeacherId) {
		this.secondClassTeacherId = secondClassTeacherId;
	}
	
	
	@Column(name = "description")
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Transient
	public DetachedCriteria getFilter(){
		DetachedCriteria detachedCriteria = DetachedCriteria.forClass(SectionEntity.class);
		detachedCriteria.add(Restrictions.eq("id", id)).
		add(Restrictions.eq("name",name)).add(Restrictions.eq("schoolId", schoolId)).addOrder(Order.asc("name"));
		return detachedCriteria;
	}

}
