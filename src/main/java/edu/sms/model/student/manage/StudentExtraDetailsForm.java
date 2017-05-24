/**
 * 
 */
package edu.sms.model.student.manage;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Kundan Suthar
 *
 */
public class StudentExtraDetailsForm implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private long id;
	private long studentId;
	private String allergicToFood = "N";
	private String allergyToFoodStr;
	private String speechDifficulty = "N";
	private String speechDifficultyStr;
	private String wearGlasses = "N";
	private String wearGlassesStr;
	private String hearDifficulty = "N";
	private String hearingDifficultyStr;
	private String regularMedicine = "N";
	private String regularMedicineStr;
	private String avoidMedicine = "N";
	private String avoidMedicineStr;
	private String historyOfConvulsions = "N";
	private String historyOfConvulsionsStr;
	private String specialCareRequired = "N";
	private String specialCareStr;
	private String bloodTranfusion = "N";
	private String bloodTranfusionStr;
	private String hospitalized = "N";
	private String historyOfHospitalization;
	private String familyDiseased = "N";
	private String familyHistory;
	private String colourVision = "N";
	private String colourVisionStr;
	private String excessSubstance = "N";
	private String excessSubstanceStr;
	private String growthDefective = "N";
	private String growthDefectiveMilestone;
	private String anyPastDisease = "N";
	private String pastDisease;
	private Date creationDate;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getStudentId() {
		return studentId;
	}
	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}
	public String getAllergicToFood() {
		return allergicToFood;
	}
	public void setAllergicToFood(String allergicToFood) {
		this.allergicToFood = allergicToFood;
	}
	public String getAllergyToFoodStr() {
		return allergyToFoodStr;
	}
	public void setAllergyToFoodStr(String allergyToFoodStr) {
		this.allergyToFoodStr = allergyToFoodStr;
	}
	public String getSpeechDifficulty() {
		return speechDifficulty;
	}
	public void setSpeechDifficulty(String speechDifficulty) {
		this.speechDifficulty = speechDifficulty;
	}
	public String getSpeechDifficultyStr() {
		return speechDifficultyStr;
	}
	public void setSpeechDifficultyStr(String speechDifficultyStr) {
		this.speechDifficultyStr = speechDifficultyStr;
	}
	public String getWearGlasses() {
		return wearGlasses;
	}
	public void setWearGlasses(String wearGlasses) {
		this.wearGlasses = wearGlasses;
	}
	public String getWearGlassesStr() {
		return wearGlassesStr;
	}
	public void setWearGlassesStr(String wearGlassesStr) {
		this.wearGlassesStr = wearGlassesStr;
	}
	public String getHearDifficulty() {
		return hearDifficulty;
	}
	public void setHearDifficulty(String hearDifficulty) {
		this.hearDifficulty = hearDifficulty;
	}
	public String getHearingDifficultyStr() {
		return hearingDifficultyStr;
	}
	public void setHearingDifficultyStr(String hearingDifficultyStr) {
		this.hearingDifficultyStr = hearingDifficultyStr;
	}
	public String getRegularMedicine() {
		return regularMedicine;
	}
	public void setRegularMedicine(String regularMedicine) {
		this.regularMedicine = regularMedicine;
	}
	public String getRegularMedicineStr() {
		return regularMedicineStr;
	}
	public void setRegularMedicineStr(String regularMedicineStr) {
		this.regularMedicineStr = regularMedicineStr;
	}
	public String getAvoidMedicine() {
		return avoidMedicine;
	}
	public void setAvoidMedicine(String avoidMedicine) {
		this.avoidMedicine = avoidMedicine;
	}
	public String getAvoidMedicineStr() {
		return avoidMedicineStr;
	}
	public void setAvoidMedicineStr(String avoidMedicineStr) {
		this.avoidMedicineStr = avoidMedicineStr;
	}
	public String getHistoryOfConvulsions() {
		return historyOfConvulsions;
	}
	public void setHistoryOfConvulsions(String historyOfConvulsions) {
		this.historyOfConvulsions = historyOfConvulsions;
	}
	public String getHistoryOfConvulsionsStr() {
		return historyOfConvulsionsStr;
	}
	public void setHistoryOfConvulsionsStr(String historyOfConvulsionsStr) {
		this.historyOfConvulsionsStr = historyOfConvulsionsStr;
	}
	public String getSpecialCareRequired() {
		return specialCareRequired;
	}
	public void setSpecialCareRequired(String specialCareRequired) {
		this.specialCareRequired = specialCareRequired;
	}
	public String getSpecialCareStr() {
		return specialCareStr;
	}
	public void setSpecialCareStr(String specialCareStr) {
		this.specialCareStr = specialCareStr;
	}
	public String getBloodTranfusion() {
		return bloodTranfusion;
	}
	public void setBloodTranfusion(String bloodTranfusion) {
		this.bloodTranfusion = bloodTranfusion;
	}
	public String getBloodTranfusionStr() {
		return bloodTranfusionStr;
	}
	public void setBloodTranfusionStr(String bloodTranfusionStr) {
		this.bloodTranfusionStr = bloodTranfusionStr;
	}
	public String getHospitalized() {
		return hospitalized;
	}
	public void setHospitalized(String hospitalized) {
		this.hospitalized = hospitalized;
	}
	public String getHistoryOfHospitalization() {
		return historyOfHospitalization;
	}
	public void setHistoryOfHospitalization(String historyOfHospitalization) {
		this.historyOfHospitalization = historyOfHospitalization;
	}
	public String getFamilyDiseased() {
		return familyDiseased;
	}
	public void setFamilyDiseased(String familyDiseased) {
		this.familyDiseased = familyDiseased;
	}
	public String getFamilyHistory() {
		return familyHistory;
	}
	public void setFamilyHistory(String familyHistory) {
		this.familyHistory = familyHistory;
	}
	public String getColourVision() {
		return colourVision;
	}
	public void setColourVision(String colourVision) {
		this.colourVision = colourVision;
	}
	public String getColourVisionStr() {
		return colourVisionStr;
	}
	public void setColourVisionStr(String colourVisionStr) {
		this.colourVisionStr = colourVisionStr;
	}
	public String getExcessSubstance() {
		return excessSubstance;
	}
	public void setExcessSubstance(String excessSubstance) {
		this.excessSubstance = excessSubstance;
	}
	public String getExcessSubstanceStr() {
		return excessSubstanceStr;
	}
	public void setExcessSubstanceStr(String excessSubstanceStr) {
		this.excessSubstanceStr = excessSubstanceStr;
	}
	public String getGrowthDefective() {
		return growthDefective;
	}
	public void setGrowthDefective(String growthDefective) {
		this.growthDefective = growthDefective;
	}
	public String getGrowthDefectiveMilestone() {
		return growthDefectiveMilestone;
	}
	public void setGrowthDefectiveMilestone(String growthDefectiveMilestone) {
		this.growthDefectiveMilestone = growthDefectiveMilestone;
	}
	public String getAnyPastDisease() {
		return anyPastDisease;
	}
	public void setAnyPastDisease(String anyPastDisease) {
		this.anyPastDisease = anyPastDisease;
	}
	public String getPastDisease() {
		return pastDisease;
	}
	public void setPastDisease(String pastDisease) {
		this.pastDisease = pastDisease;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	
	}
