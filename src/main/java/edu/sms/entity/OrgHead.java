package edu.sms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "organization")
public class OrgHead implements LOVEntity {

	public OrgHead() {
	}

	public OrgHead(Integer id, String name) {
		this.id=id;
		this.name=name;
	}
	
	private Integer id;
	private String name;

	@Id
	@Column(name = "org_id")
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "org_name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
