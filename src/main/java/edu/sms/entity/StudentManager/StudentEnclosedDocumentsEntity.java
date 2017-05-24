package edu.sms.entity.StudentManager;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Student_Enclosed_Documents")
public class StudentEnclosedDocumentsEntity  implements Serializable{
	private static final long serialVersionUID = 1L;

	private long id;
	private long studentId;
	private String birthCertificatePath;
	private String transferCertiPath;
	private String casteCertiPath;
	private String characterCertiPath;
	private String marksheetPath;
	private String medicalCertiPath;
	private String ITRPath;
	private String addressProofPath;
	private String progressReportPath;
	private String FatherPhotoPath;
	private String motherPhotoPath;
	private String guardianPhotoPath;
	private String NRIVisaDetailPath;
	private String migrationCertiPath;
	private String localGuardianUndertakingCertiPath;
	private String parentUndertakingPath;
	private String bondOfIndemnityPath;
	private boolean birthCertificatePathBool;
	private boolean transferCertiPathBool;
	private boolean casteCertiPathBool;
	private boolean characterCertiPathBool;
	private boolean marksheetPathBool;
	private boolean medicalCertiPathBool;
	private boolean ITRPathBool;
	private boolean addressProofPathBool;
	private boolean progressReportPathBool;
	private boolean fatherPhotoPathBool;
	private boolean motherPhotoPathBool;
	private boolean guardianPhotoPathBool;
	private boolean NRIVisaDetailPathBool;
	private boolean migrationCertiPathBool;
	private boolean localGuardianUndertakingCertiPathBool;
	private boolean parentUndertakingPathBool;
	private boolean bondOfIndemnityPathBool;
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
	
	@Column(name="birth_certificate_path")
	public String getBirthCertificatePath() {
		return birthCertificatePath;
	}
	public void setBirthCertificatePath(String birthCertificatePath) {
		this.birthCertificatePath = birthCertificatePath;
	}
	
	@Column(name="transfer_certi_path")
	public String getTransferCertiPath() {
		return transferCertiPath;
	}
	public void setTransferCertiPath(String transferCertiPath) {
		this.transferCertiPath = transferCertiPath;
	}
	
	@Column(name="caste_certi_path")
	public String getCasteCertiPath() {
		return casteCertiPath;
	}
	public void setCasteCertiPath(String casteCertiPath) {
		this.casteCertiPath = casteCertiPath;
	}
	
	@Column(name="character_certi_path")
	public String getCharacterCertiPath() {
		return characterCertiPath;
	}
	public void setCharacterCertiPath(String characterCertiPath) {
		this.characterCertiPath = characterCertiPath;
	}
	
	@Column(name="marksheet_path")
	public String getMarksheetPath() {
		return marksheetPath;
	}
	public void setMarksheetPath(String marksheetPath) {
		this.marksheetPath = marksheetPath;
	}
	
	@Column(name="medical_certi_path")
	public String getMedicalCertiPath() {
		return medicalCertiPath;
	}
	public void setMedicalCertiPath(String medicalCertiPath) {
		this.medicalCertiPath = medicalCertiPath;
	}
	
	@Column(name="ITR_path")
	public String getITRPath() {
		return ITRPath;
	}
	public void setITRPath(String iTRPath) {
		ITRPath = iTRPath;
	}
	
	@Column(name="address_proof_path")
	public String getAddressProofPath() {
		return addressProofPath;
	}
	public void setAddressProofPath(String addressProofPath) {
		this.addressProofPath = addressProofPath;
	}
	
	@Column(name="progress_report_path")
	public String getProgressReportPath() {
		return progressReportPath;
	}
	public void setProgressReportPath(String progressReportPath) {
		this.progressReportPath = progressReportPath;
	}
	
	@Column(name="Father_photo_path")
	public String getFatherPhotoPath() {
		return FatherPhotoPath;
	}
	public void setFatherPhotoPath(String fatherPhotoPath) {
		FatherPhotoPath = fatherPhotoPath;
	}
	
	@Column(name="mother_photo_path")
	public String getMotherPhotoPath() {
		return motherPhotoPath;
	}
	public void setMotherPhotoPath(String motherPhotoPath) {
		this.motherPhotoPath = motherPhotoPath;
	}
	
	@Column(name="guardian_photo_path")
	public String getGuardianPhotoPath() {
		return guardianPhotoPath;
	}
	public void setGuardianPhotoPath(String guardianPhotoPath) {
		this.guardianPhotoPath = guardianPhotoPath;
	}
	
	@Column(name="NRI_visa_detail_path")
	public String getNRIVisaDetailPath() {
		return NRIVisaDetailPath;
	}
	public void setNRIVisaDetailPath(String nRIVisaDetailPath) {
		NRIVisaDetailPath = nRIVisaDetailPath;
	}
	
	@Column(name="migration_certi_path")
	public String getMigrationCertiPath() {
		return migrationCertiPath;
	}
	public void setMigrationCertiPath(String migrationCertiPath) {
		this.migrationCertiPath = migrationCertiPath;
	}
	
	@Column(name="local_guardian_undertaking_certi_path")
	public String getLocalGuardianUndertakingCertiPath() {
		return localGuardianUndertakingCertiPath;
	}
	public void setLocalGuardianUndertakingCertiPath(String localGuardianUndertakingCertiPath) {
		this.localGuardianUndertakingCertiPath = localGuardianUndertakingCertiPath;
	}
	
	@Column(name="parent_undertaking_path")
	public String getParentUndertakingPath() {
		return parentUndertakingPath;
	}
	public void setParentUndertakingPath(String parentUndertakingPath) {
		this.parentUndertakingPath = parentUndertakingPath;
	}
	
	@Column(name="bond_of_indemnity_path")
	public String getBondOfIndemnityPath() {
		return bondOfIndemnityPath;
	}
	public void setBondOfIndemnityPath(String bondOfIndemnityPath) {
		this.bondOfIndemnityPath = bondOfIndemnityPath;
	}
	
	@Column(name="creation_date")
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	
	@Column(name="birth_certificate_path_bool")
	public boolean isBirthCertificatePathBool() {
		return birthCertificatePathBool;
	}
	public void setBirthCertificatePathBool(boolean birthCertificatePathBool) {
		this.birthCertificatePathBool = birthCertificatePathBool;
	}
	
	@Column(name="transfer_certi_path_bool")
	public boolean isTransferCertiPathBool() {
		return transferCertiPathBool;
	}
	public void setTransferCertiPathBool(boolean transferCertiPathBool) {
		this.transferCertiPathBool = transferCertiPathBool;
	}
	
	@Column(name="caste_certi_path_bool")
	public boolean isCasteCertiPathBool() {
		return casteCertiPathBool;
	}
	public void setCasteCertiPathBool(boolean casteCertiPathBool) {
		this.casteCertiPathBool = casteCertiPathBool;
	}
	
	@Column(name="character_certi_path_bool")
	public boolean isCharacterCertiPathBool() {
		return characterCertiPathBool;
	}
	public void setCharacterCertiPathBool(boolean characterCertiPathBool) {
		this.characterCertiPathBool = characterCertiPathBool;
	}
	
	@Column(name="marksheet_path_bool")
	public boolean isMarksheetPathBool() {
		return marksheetPathBool;
	}
	public void setMarksheetPathBool(boolean marksheetPathBool) {
		this.marksheetPathBool = marksheetPathBool;
	}
	
	@Column(name="medical_certi_path_bool")
	public boolean isMedicalCertiPathBool() {
		return medicalCertiPathBool;
	}
	public void setMedicalCertiPathBool(boolean medicalCertiPathBool) {
		this.medicalCertiPathBool = medicalCertiPathBool;
	}
	
	@Column(name="ITR_path_bool")
	public boolean isITRPathBool() {
		return ITRPathBool;
	}
	public void setITRPathBool(boolean iTRPathBool) {
		ITRPathBool = iTRPathBool;
	}
	
	@Column(name="address_proof_path_bool")
	public boolean isAddressProofPathBool() {
		return addressProofPathBool;
	}
	public void setAddressProofPathBool(boolean addressProofPathBool) {
		this.addressProofPathBool = addressProofPathBool;
	}
	
	@Column(name="progress_report_path_bool")
	public boolean isProgressReportPathBool() {
		return progressReportPathBool;
	}
	public void setProgressReportPathBool(boolean progressReportPathBool) {
		this.progressReportPathBool = progressReportPathBool;
	}
	
	@Column(name="Father_photo_path_bool")
	public boolean isFatherPhotoPathBool() {
		return fatherPhotoPathBool;
	}
	public void setFatherPhotoPathBool(boolean fatherPhotoPathBool) {
		this.fatherPhotoPathBool = fatherPhotoPathBool;
	}
	
	@Column(name="mother_photo_path_bool")
	public boolean isMotherPhotoPathBool() {
		return motherPhotoPathBool;
	}
	public void setMotherPhotoPathBool(boolean motherPhotoPathBool) {
		this.motherPhotoPathBool = motherPhotoPathBool;
	}
	
	@Column(name="guardian_photo_path_bool")
	public boolean isGuardianPhotoPathBool() {
		return guardianPhotoPathBool;
	}
	public void setGuardianPhotoPathBool(boolean guardianPhotoPathBool) {
		this.guardianPhotoPathBool = guardianPhotoPathBool;
	}
	
	@Column(name="NRI_visa_detail_path_bool")
	public boolean isNRIVisaDetailPathBool() {
		return NRIVisaDetailPathBool;
	}
	public void setNRIVisaDetailPathBool(boolean nRIVisaDetailPathBool) {
		NRIVisaDetailPathBool = nRIVisaDetailPathBool;
	}
	
	@Column(name="migration_certi_path_bool")
	public boolean isMigrationCertiPathBool() {
		return migrationCertiPathBool;
	}
	public void setMigrationCertiPathBool(boolean migrationCertiPathBool) {
		this.migrationCertiPathBool = migrationCertiPathBool;
	}
	
	@Column(name="local_guardian_undertaking_bool")
	public boolean isLocalGuardianUndertakingCertiPathBool() {
		return localGuardianUndertakingCertiPathBool;
	}
	public void setLocalGuardianUndertakingCertiPathBool(boolean localGuardianUndertakingCertiPathBool) {
		this.localGuardianUndertakingCertiPathBool = localGuardianUndertakingCertiPathBool;
	}
	
	@Column(name="parent_undertaking_path_bool")
	public boolean isParentUndertakingPathBool() {
		return parentUndertakingPathBool;
	}
	public void setParentUndertakingPathBool(boolean parentUndertakingPathBool) {
		this.parentUndertakingPathBool = parentUndertakingPathBool;
	}
	
	@Column(name="bond_of_indemnity_path_bool")
	public boolean isBondOfIndemnityPathBool() {
		return bondOfIndemnityPathBool;
	}
	public void setBondOfIndemnityPathBool(boolean bondOfIndemnityPathBool) {
		this.bondOfIndemnityPathBool = bondOfIndemnityPathBool;
	}
}
