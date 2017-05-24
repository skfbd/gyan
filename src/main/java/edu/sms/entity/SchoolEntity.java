package edu.sms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="school")
public class SchoolEntity {
	
	private Long schoolId;
	private String schoolName;
	private Long orgId;
	String type;
	String address1;
	String address2;
	String address3;
	String pincode;
	String country;
	String state;
	String district;
	String displayAddress;
	String website;
	String emailId;
	byte[] logo;
	String aboutCompany;
	String feeRecieptPrefix;
	String startingRecieptNo;
	String enableMobileApp;
	String mobilePlatform;
	String parentLoginTheme;
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="school_id")
	public Long getSchoolId() {
		return schoolId;
	}
	public void setSchoolId(Long schoolId) {
		this.schoolId = schoolId;
	}
	
	@Column(name="school_name")
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	
	@Column(name="org_id")
	public Long getOrgId() {
		return orgId;
	}
	public void setOrgId(Long orgId) {
		this.orgId = orgId;
	}
	
	@Column(name="type")
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	@Column(name="address1")
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	
	@Column(name="address2")
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	
	@Column(name="address3")
	public String getAddress3() {
		return address3;
	}
	public void setAddress3(String address3) {
		this.address3 = address3;
	}
	
	@Column(name="pin_code")
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	
	@Column(name="country")
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	@Column(name="state")
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	@Column(name="district")
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	
	@Column(name="displayAddress")
	public String getDisplayAddress() {
		return displayAddress;
	}
	public void setDisplayAddress(String displayAddress) {
		this.displayAddress = displayAddress;
	}
	
	@Column(name="website")
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	
	@Column(name="emailId")
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	@Column(name="logo")
	public byte[] getLogo() {
		return logo;
	}
	public void setLogo(byte[] logo) {
		this.logo = logo;
	}
	
	@Column(name="about_company")
	public String getAboutCompany() {
		return aboutCompany;
	}
	public void setAboutCompany(String aboutCompany) {
		this.aboutCompany = aboutCompany;
	}
	
	@Column(name="fee_reciept_prefix")
	public String getFeeRecieptPrefix() {
		return feeRecieptPrefix;
	}
	public void setFeeRecieptPrefix(String feeRecieptPrefix) {
		this.feeRecieptPrefix = feeRecieptPrefix;
	}
	
	@Column(name="starting_reciept_no")
	public String getStartingRecieptNo() {
		return startingRecieptNo;
	}
	
	public void setStartingRecieptNo(String startingRecieptNo) {
		this.startingRecieptNo = startingRecieptNo;
	}
	
	@Column(name="enable_mobile_app")
	public String getEnableMobileApp() {
		return enableMobileApp;
	}
	public void setEnableMobileApp(String enableMobileApp) {
		this.enableMobileApp = enableMobileApp;
	}
	
	@Column(name="mobile_platform")
	public String getMobilePlatform() {
		return mobilePlatform;
	}
	public void setMobilePlatform(String mobilePlatform) {
		this.mobilePlatform = mobilePlatform;
	}
	
	@Column(name="parent_login_theme")
	public String getParentLoginTheme() {
		return parentLoginTheme;
	}
	public void setParentLoginTheme(String parentLoginTheme) {
		this.parentLoginTheme = parentLoginTheme;
	}
	
	
	
}
