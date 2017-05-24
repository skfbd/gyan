package edu.sms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "state")
public class StateEntity extends DropDownEntity implements LOVEntity {
	
	private Integer parentId;

	public StateEntity() {}

	public StateEntity(Integer id, String name) {
		super(id, name);
	}

	@Column(name = "country_id")
	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

}
