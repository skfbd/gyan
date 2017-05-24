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

import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;


@Entity
@Table(name = "shiro_role")
public class RoleEntity implements java.io.Serializable {

	private Integer            rId;
	private String             roleId;
	private String             roleDesc;
	private String             perName;

	
	


	public RoleEntity() {
	}

	
	public RoleEntity(String perName) {
		this.perName  = perName;
	}
	
	public RoleEntity(String perName,SubModulesEntity stock) {
		this.perName  = perName;
		
	}
	
	
	
	
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "rId", unique = true, nullable = false)
	public Integer getrId() {
		return rId;
	}


	public void setrId(Integer rId) {
		this.rId = rId;
	}
	
	@Generated(GenerationTime.INSERT)
	@Column(name = "roleId", unique = true, nullable = false, length = 20,insertable = false)
	public String getRoleId() {
		return roleId;
	}


	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	@Column(name = "description", unique = true, nullable = false, length = 20)
	public String getRoleDesc() {
		return roleDesc;
	}


	public void setRoleDesc(String roleDesc) {
		this.roleDesc = roleDesc;
	}

	@Column(name = "name", unique = true, nullable = false, length = 20)
	public String getPerName() {
		return perName;
	}


	public void setPerName(String perName) {
		this.perName = perName;
	}
}

