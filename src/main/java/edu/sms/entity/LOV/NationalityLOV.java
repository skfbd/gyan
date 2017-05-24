package edu.sms.entity.LOV;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import edu.sms.entity.LOVEntity;


@Entity
@Table(name = "nationality")
public class NationalityLOV implements LOVEntity {
	public NationalityLOV() {
	}

	public NationalityLOV(Integer id, String name) {
		this.id=id;
		this.name=name;
	}
	
	private Integer id;
	private String name;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
