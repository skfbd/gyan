package edu.sms.entity.appModules;
import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the shiro_user_role database table.
 * 
 */
@Entity
@Table(name="shiro_user_role")
public class ShiroUserRole implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ShiroUserRolePK id;

	@Column(nullable=false)
	private int entityId;

	@Column(nullable=false, length=45)
	private String entityType;

    public ShiroUserRole() {
    }

	public ShiroUserRolePK getId() {
		return this.id;
	}

	public void setId(ShiroUserRolePK id) {
		this.id = id;
	}
	
	public int getEntityId() {
		return this.entityId;
	}

	public void setEntityId(int entityId) {
		this.entityId = entityId;
	}

	public String getEntityType() {
		return this.entityType;
	}

	public void setEntityType(String entityType) {
		this.entityType = entityType;
	}

}