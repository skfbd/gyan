package edu.sms.entity.appModules;
import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the shiro_user_role database table.
 * 
 */
@Embeddable
public class ShiroUserRolePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="user_id", unique=true, nullable=false)
	private Integer userId;

	@Column(name="role_id", unique=true, nullable=false)
	private Integer roleId;

    public ShiroUserRolePK() {
    }
	public Integer getUserId() {
		return this.userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getRoleId() {
		return this.roleId;
	}
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ShiroUserRolePK)) {
			return false;
		}
		ShiroUserRolePK castOther = (ShiroUserRolePK)other;
		return 
			this.userId.equals(castOther.userId)
			&& this.roleId.equals(castOther.roleId);

    }
    
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.userId.hashCode();
		hash = hash * prime + this.roleId.hashCode();
		
		return hash;
    }
}