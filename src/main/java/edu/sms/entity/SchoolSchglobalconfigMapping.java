package edu.sms.entity;
import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the school_schglobalconfig_mapping database table.
 * 
 */
@Entity
@Table(name="school_schglobalconfig_mapping")
public class SchoolSchglobalconfigMapping implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private Long id;

	@Column(nullable=false)
	private Long schoolGlobalConfig;

	@Column(nullable=false)
	private Long schoolId;

    public SchoolSchglobalconfigMapping() {
    }

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getSchoolGlobalConfig() {
		return this.schoolGlobalConfig;
	}

	public void setSchoolGlobalConfig(Long schoolGlobalConfig) {
		this.schoolGlobalConfig = schoolGlobalConfig;
	}

	public Long getSchoolId() {
		return this.schoolId;
	}

	public void setSchoolId(Long schoolId) {
		this.schoolId = schoolId;
	}

}