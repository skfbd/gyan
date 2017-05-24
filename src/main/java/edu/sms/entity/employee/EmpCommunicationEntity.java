package edu.sms.entity.employee;
import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;


/**
 * The persistent class for the empcommunicationdtl database table.
 * 
 */
@Entity
@Table(name="empcommunicationdtl")
public class EmpCommunicationEntity implements Serializable,CommonEmployeeEntity {
	private static final long serialVersionUID = 1L;

	@Id  
	@Column(name = "emp_comm_id")  
	@GeneratedValue(generator = "gen")  
	@GenericGenerator(name = "gen", strategy = "foreign", parameters = @Parameter(name = "property", value = "employee"))  
	private int empCommId;
	
	

	@Column(name="Address", length=50)
	private String address;

	@Column(name="Alternative_Email", length=50)
	private String alternative_Email;

	@Column(name="Country", length=50)
	private String country;

	@Column(name="District", length=50)
	private String district;

	@Column(name="Email_Id", length=50)
	private String email_Id;

	@Column(name="Emergency_Contact_Number", length=50)
	private String emergency_Contact_Number;

	@Column(name="Mobile_No", length=50)
	private String mobile_No;

	@Column(name="Phone_No", length=50)
	private String phone_No;

	@Column(name="Pin_code", length=50)
	private String pin_code;

	@Column(name="Resident_Phone_No", length=50)
	private String resident_Phone_No;

	@Column(name="State", length=25)
	private String state;

	
	@OneToOne  
	@PrimaryKeyJoinColumn
	private EmployeeEntity employee;

    public EmpCommunicationEntity() {
    }

	public int getEmpCommId() {
		return this.empCommId;
	}

	public void setEmpCommId(int empCommId) {
		this.empCommId = empCommId;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAlternative_Email() {
		return this.alternative_Email;
	}

	public void setAlternative_Email(String alternative_Email) {
		this.alternative_Email = alternative_Email;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getDistrict() {
		return this.district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getEmail_Id() {
		return this.email_Id;
	}

	public void setEmail_Id(String email_Id) {
		this.email_Id = email_Id;
	}

	public String getEmergency_Contact_Number() {
		return this.emergency_Contact_Number;
	}

	public void setEmergency_Contact_Number(String emergency_Contact_Number) {
		this.emergency_Contact_Number = emergency_Contact_Number;
	}

	public String getMobile_No() {
		return this.mobile_No;
	}

	public void setMobile_No(String mobile_No) {
		this.mobile_No = mobile_No;
	}

	public String getPhone_No() {
		return this.phone_No;
	}

	public void setPhone_No(String phone_No) {
		this.phone_No = phone_No;
	}

	public String getPin_code() {
		return this.pin_code;
	}

	public void setPin_code(String pin_code) {
		this.pin_code = pin_code;
	}

	public String getResident_Phone_No() {
		return this.resident_Phone_No;
	}

	public void setResident_Phone_No(String resident_Phone_No) {
		this.resident_Phone_No = resident_Phone_No;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "emp_id")
	public EmployeeEntity getEmployee() {
		return employee;
	}

	public void setEmployee(EmployeeEntity employee) {
		this.employee = employee;
	}

	
}