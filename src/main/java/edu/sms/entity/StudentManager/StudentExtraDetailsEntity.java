/**
 * 
 */
package edu.sms.entity.StudentManager;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Kundan Suthar
 *
 */

@Entity
@Table(name = "Student_Extra_Details")
public class StudentExtraDetailsEntity implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private long id;
	private long studentId;
	private String allergicToFood;
	private String allergyToFoodStr;
	private String speechDifficulty;
	private String speechDifficultyStr;
	private String wearGlasses;
	private String wearGlassesStr;
	private String hearDifficulty;
	private String hearingDifficultyStr;
	private String regularMedicine;
	private String regularMedicineStr;
	private String avoidMedicine;
	private String avoidMedicineStr;
	private String historyOfConvulsions;
	private String historyOfConvulsionsStr;
	private String specialCareRequired;
	private String specialCareStr;
	private String bloodTranfusion;
	private String bloodTranfusionStr;
	private String hospitalized;
	private String historyOfHospitalization;
	private String familyDiseased;
	private String familyHistory;
	private String colourVision;
	private String colourVisionStr;
	private String excessSubstance;
	private String excessSubstanceStr;
	private String growthDefective;
	private String growthDefectiveMilestone;
	private String anyPastDisease;
	private String pastDisease;
	private Date creationDate;
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	@Column(name="student_id" , nullable = false)
	public long getStudentId() {
		return studentId;
	}
	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}
	
	@Column(name="is_allergic_to_food")
	public String getAllergicToFood() {
		return allergicToFood;
	}
	public void setAllergicToFood(String allergicToFood) {
		this.allergicToFood = allergicToFood;
	}
	
	@Column(name="allergy_to_food")
	public String getAllergyToFoodStr() {
		return allergyToFoodStr;
	}
	public void setAllergyToFoodStr(String allergyToFoodStr) {
		this.allergyToFoodStr = allergyToFoodStr;
	}
	
	
	@Column(name="do_speech_difficulty")
	public String getSpeechDifficulty() {
		return speechDifficulty;
	}
	public void setSpeechDifficulty(String speechDifficulty) {
		this.speechDifficulty = speechDifficulty;
	}
	
	@Column(name="speech_difficulty")
	public String getSpeechDifficultyStr() {
		return speechDifficultyStr;
	}
	public void setSpeechDifficultyStr(String speechDifficultyStr) {
		this.speechDifficultyStr = speechDifficultyStr;
	}
	
	@Column(name="do_wear_glasses")
	public String getWearGlasses() {
		return wearGlasses;
	}
	public void setWearGlasses(String wearGlasses) {
		this.wearGlasses = wearGlasses;
	}
	
	@Column(name="wear_glasses")
	public String getWearGlassesStr() {
		return wearGlassesStr;
	}
	public void setWearGlassesStr(String wearGlassesStr) {
		this.wearGlassesStr = wearGlassesStr;
	}
	
	@Column(name="do_hear_difficulty")
	public String getHearDifficulty() {
		return hearDifficulty;
	}
	public void setHearDifficulty(String hearDifficulty) {
		this.hearDifficulty = hearDifficulty;
	}
	
	@Column(name="hearing_difficulty")
	public String getHearingDifficultyStr() {
		return hearingDifficultyStr;
	}
	public void setHearingDifficultyStr(String hearingDifficultyStr) {
		this.hearingDifficultyStr = hearingDifficultyStr;
	}
	
	@Column(name="do_regular_medicine")
	public String getRegularMedicine() {
		return regularMedicine;
	}
	public void setRegularMedicine(String regularMedicine) {
		this.regularMedicine = regularMedicine;
	}
	
	@Column(name="regular_medicine")
	public String getRegularMedicineStr() {
		return regularMedicineStr;
	}
	public void setRegularMedicineStr(String regularMedicineStr) {
		this.regularMedicineStr = regularMedicineStr;
	}
	
	@Column(name="to_avoid_medicine")
	public String getAvoidMedicine() {
		return avoidMedicine;
	}
	public void setAvoidMedicine(String avoidMedicine) {
		this.avoidMedicine = avoidMedicine;
	}
	
	@Column(name="avoid_medicine")
	public String getAvoidMedicineStr() {
		return avoidMedicineStr;
	}
	public void setAvoidMedicineStr(String avoidMedicineStr) {
		this.avoidMedicineStr = avoidMedicineStr;
	}
	
	@Column(name="is_history_of_convulsions")
	public String getHistoryOfConvulsions() {
		return historyOfConvulsions;
	}
	public void setHistoryOfConvulsions(String historyOfConvulsions) {
		this.historyOfConvulsions = historyOfConvulsions;
	}
	
	@Column(name="history_of_convulsions")
	public String getHistoryOfConvulsionsStr() {
		return historyOfConvulsionsStr;
	}
	public void setHistoryOfConvulsionsStr(String historyOfConvulsionsStr) {
		this.historyOfConvulsionsStr = historyOfConvulsionsStr;
	}
	
	@Column(name="is_special_care_required")
	public String getSpecialCareRequired() {
		return specialCareRequired;
	}
	public void setSpecialCareRequired(String specialCareRequired) {
		this.specialCareRequired = specialCareRequired;
	}
	
	@Column(name="special_care")
	public String getSpecialCareStr() {
		return specialCareStr;
	}
	public void setSpecialCareStr(String specialCareStr) {
		this.specialCareStr = specialCareStr;
	}
	
	@Column(name="do_blood_tranfusion")
	public String getBloodTranfusion() {
		return bloodTranfusion;
	}
	public void setBloodTranfusion(String bloodTranfusion) {
		this.bloodTranfusion = bloodTranfusion;
	}
	
	@Column(name="blood_transfusion")
	public String getBloodTranfusionStr() {
		return bloodTranfusionStr;
	}
	public void setBloodTranfusionStr(String bloodTranfusionStr) {
		this.bloodTranfusionStr = bloodTranfusionStr;
	}
	
	@Column(name="is_hospitalized")
	public String getHospitalized() {
		return hospitalized;
	}
	public void setHospitalized(String hospitalized) {
		this.hospitalized = hospitalized;
	}
	
	@Column(name="history_of_hospitalization")
	public String getHistoryOfHospitalization() {
		return historyOfHospitalization;
	}
	public void setHistoryOfHospitalization(String historyOfHospitalization) {
		this.historyOfHospitalization = historyOfHospitalization;
	}
	
	@Column(name="is_family_diseased")
	public String getFamilyDiseased() {
		return familyDiseased;
	}
	public void setFamilyDiseased(String familyDiseased) {
		this.familyDiseased = familyDiseased;
	}
	
	@Column(name="family_history")
	public String getFamilyHistory() {
		return familyHistory;
	}
	public void setFamilyHistory(String familyHistory) {
		this.familyHistory = familyHistory;
	}
	
	@Column(name="is_colour_vision")
	public String getColourVision() {
		return colourVision;
	}
	public void setColourVision(String colourVision) {
		this.colourVision = colourVision;
	}
	
	@Column(name="colour_vision")
	public String getColourVisionStr() {
		return colourVisionStr;
	}
	public void setColourVisionStr(String colourVisionStr) {
		this.colourVisionStr = colourVisionStr;
	}
	
	@Column(name="on_excess_substance")
	public String getExcessSubstance() {
		return excessSubstance;
	}
	public void setExcessSubstance(String excessSubstance) {
		this.excessSubstance = excessSubstance;
	}
	
	@Column(name="excess_substance")
	public String getExcessSubstanceStr() {
		return excessSubstanceStr;
	}
	public void setExcessSubstanceStr(String excessSubstanceStr) {
		this.excessSubstanceStr = excessSubstanceStr;
	}
	
	@Column(name="is_growth_defective")
	public String getGrowthDefective() {
		return growthDefective;
	}
	public void setGrowthDefective(String growthDefective) {
		this.growthDefective = growthDefective;
	}
	
	@Column(name="growth_defective_milestone")
	public String getGrowthDefectiveMilestone() {
		return growthDefectiveMilestone;
	}
	public void setGrowthDefectiveMilestone(String growthDefectiveMilestone) {
		this.growthDefectiveMilestone = growthDefectiveMilestone;
	}
	
	@Column(name="any_past_disease")
	public String isAnyPastDisease() {
		return anyPastDisease;
	}
	public void setAnyPastDisease(String anyPastDisease) {
		this.anyPastDisease = anyPastDisease;
	}
	
	@Column(name="past_disease")
	public String getPastDisease() {
		return pastDisease;
	}
	public void setPastDisease(String pastDisease) {
		this.pastDisease = pastDisease;
	}
	
	@Column(name="creation_date")
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
}
