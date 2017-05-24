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
@Table(name = "shiro_role_permission")
public class RolePermissionEntity implements java.io.Serializable {

	private Integer            rolePermId;
	private String             role;
	private String             perName;

	
	public RolePermissionEntity() {
	}

	
	public RolePermissionEntity(String perName) {
		this.perName  = perName;
	}
	
	public RolePermissionEntity(String perName,SubModulesEntity stock) {
		this.perName  = perName;
		
	}
	
	
	
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "rolePermissionId", unique = true, nullable = false)
	public Integer getRolePermId() {
		return rolePermId;
	}


	public void setRolePermId(Integer rolePermId) {
		this.rolePermId = rolePermId;
	}

	@Column(name = "role_id", unique = true, nullable = false, length = 20)
	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}



	@Column(name = "permission", unique = true, nullable = false, length = 20)
	public String getPerName() {
		return perName;
	}

	public void setPerName(String perName) {
		this.perName = perName;
	}
	
	
	
	
}

