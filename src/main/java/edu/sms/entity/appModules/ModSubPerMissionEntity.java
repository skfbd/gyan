package edu.sms.entity.appModules;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;




@Entity
@Table(name = "mod_submod_permission")
public class ModSubPerMissionEntity implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer modsubperId;
	private String  userTypeId;
	private String  modVal;
	private String  subMod;
	private String  permiss;
	
 	
	
	
	public ModSubPerMissionEntity() {
	}



	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "modsubperId", unique = true, nullable = false)
	public Integer getModsubperId() {
		return modsubperId;
	}




	public void setModsubperId(Integer modsubperId) {
		this.modsubperId = modsubperId;
	}


    @Column(name = "userTypeId")
	public String getUserTypeId() {
		return userTypeId;
	}




	public void setUserTypeId(String userTypeId) {
		this.userTypeId = userTypeId;
	}



	

	@Column(name = "moduleId")
	public String getModVal() {
		return modVal;
	}




	public void setModVal(String modVal) {
		this.modVal = modVal;
	}


	
	@Column(name = "subModId")
	public String getSubMod() {
		return subMod;
	}

	public void setSubMod(String subMod) {
		this.subMod = subMod;
	}

	
	@Column(name = "permission")
	public String getPermiss() {
		return permiss;
	}


	public void setPermiss(String permiss) {
		this.permiss = permiss;
	}


	
}
