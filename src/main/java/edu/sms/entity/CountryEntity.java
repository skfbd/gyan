package edu.sms.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Country")
public class CountryEntity extends DropDownEntity implements LOVEntity {

	public CountryEntity(){}
	
	public CountryEntity(Integer id, String name) {
		super(id, name);
	}
}
