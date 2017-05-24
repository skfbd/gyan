package edu.sms.entity.appModules;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "gyaan_permission")
public class PermissionEntity implements java.io.Serializable {

	private Integer            perMissionId;
	private SubModulesEntity   subStock;
	private String             perName;

	

	public PermissionEntity() {
	}

	
	public PermissionEntity(String perName) {
		this.perName  = perName;
	}
	
	public PermissionEntity(String perName,SubModulesEntity stock) {
		this.perName  = perName;
		this.subStock = stock;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "permissionId", unique = true, nullable = false)
	public Integer getPerMissionId() {
		return perMissionId;
	}

	public void setPerMissionId(Integer perMissionId) {
		this.perMissionId = perMissionId;
	}
	
		
	

	@Column(name = "permissionName", unique = true, nullable = false, length = 20)
	public String getPerName() {
		return perName;
	}

	public void setPerName(String perName) {
		this.perName = perName;
	}
	
	
	
	@ManyToOne(cascade = CascadeType.ALL ,fetch = FetchType.LAZY)
	@JoinColumn(name = "submodule_Id", nullable = false)
	public SubModulesEntity getSubStock() {
		return subStock;
	}

	

	public void setSubStock(SubModulesEntity subStock) {
		this.subStock = subStock;
	}
}

