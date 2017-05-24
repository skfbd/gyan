package edu.sms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "City")
public class CityEntity extends DropDownEntity implements LOVEntity {

	private Integer parentId;
	
	public CityEntity() {}
	
	public CityEntity(Integer id, String name) {
		super(id, name);
	}

	@Column(name = "state_id")
	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}
	
}
