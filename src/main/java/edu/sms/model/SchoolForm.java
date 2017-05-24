package edu.sms.model;

import java.io.Serializable;

public class SchoolForm implements Serializable {

	private static final long serialVersionUID = 1L;

	public SchoolForm() {

	}

	Long schoolId;
	String schoolName;
	Long orgId;
	String orgName;
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

	public Long getSchoolId() {
		return schoolId;
	}

	public void setSchoolId(Long schoolId) {
		this.schoolId = schoolId;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getAddress3() {
		return address3;
	}

	public void setAddress3(String address3) {
		this.address3 = address3;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getDisplayAddress() {
		return displayAddress;
	}

	public void setDisplayAddress(String displayAddress) {
		this.displayAddress = displayAddress;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public byte[] getLogo() {
		return logo;
	}

	public void setLogo(byte[] logo) {
		this.logo = logo;
	}

	public String getAboutCompany() {
		return aboutCompany;
	}

	public void setAboutCompany(String aboutCompany) {
		this.aboutCompany = aboutCompany;
	}

	public Long getOrgId() {
		return orgId;
	}

	public void setOrgId(Long orgId) {
		this.orgId = orgId;
	}

	public String getFeeRecieptPrefix() {
		return feeRecieptPrefix;
	}

	public void setFeeRecieptPrefix(String feeRecieptPrefix) {
		this.feeRecieptPrefix = feeRecieptPrefix;
	}

	public String getStartingRecieptNo() {
		return startingRecieptNo;
	}

	public void setStartingRecieptNo(String startingRecieptNo) {
		this.startingRecieptNo = startingRecieptNo;
	}

	public String getEnableMobileApp() {
		return enableMobileApp;
	}

	public void setEnableMobileApp(String enableMobileApp) {
		this.enableMobileApp = enableMobileApp;
	}

	public String getMobilePlatform() {
		return mobilePlatform;
	}

	public void setMobilePlatform(String mobilePlatform) {
		this.mobilePlatform = mobilePlatform;
	}

	public String getParentLoginTheme() {
		return parentLoginTheme;
	}

	public void setParentLoginTheme(String parentLoginTheme) {
		this.parentLoginTheme = parentLoginTheme;
	}
	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
}
