package edu.sms.entity.employee;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_entity_mapping")
public class UserEntityMapping  {

	private Integer 	Id;
	private String  	userId;
	private Integer 	entityId;
	private String 		entityType;
	
	
	public UserEntityMapping() {
		
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id", unique=true, nullable=false)
	public Integer getId() {
		return Id;
	}


	public void setId(Integer id) {
		Id = id;
	}

	@Column(name = "userid")
	public String getUserId() {
		return userId;
	}


	public void setUserId(String userId) {
		this.userId = userId;
	}

	@Column(name = "entityId")
	public Integer getEntityId() {
		return entityId;
	}


	public void setEntityId(Integer entityId) {
		this.entityId = entityId;
	}

	@Column(name = "entitytype")
	public String getEntityType() {
		return entityType;
	}


	public void setEntityType(String entityType) {
		this.entityType = entityType;
	}
	
}
