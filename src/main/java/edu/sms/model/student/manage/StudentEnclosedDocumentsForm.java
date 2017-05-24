package edu.sms.model.student.manage;

import java.io.Serializable;
import java.util.Date;

import org.springframework.web.multipart.MultipartFile;

public class StudentEnclosedDocumentsForm  implements Serializable{
	private static final long serialVersionUID = 1L;

	private long id;
	private long studentId;
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
	private MultipartFile birthCertificatePathFile;
	private MultipartFile transferCertiPathFile;
	private MultipartFile casteCertiPathFile;
	private MultipartFile characterCertiPathFile;
	private MultipartFile marksheetPathFile;
	private MultipartFile medicalCertiPathFile;
	private MultipartFile ITRPathFile;
	private MultipartFile addressProofPathFile;
	private MultipartFile progressReportPathFile;
	private MultipartFile FatherPhotoPathFile;
	private MultipartFile motherPhotoPathFile;
	private MultipartFile guardianPhotoPathFile;
	private MultipartFile NRIVisaDetailPathFile;
	private MultipartFile migrationCertiPathFile;
	private MultipartFile localGuardianUndertakingCertiPathFile;
	private MultipartFile parentUndertakingPathFile;
	private MultipartFile bondOfIndemnityPathFile;
	
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
	public String getBirthCertificatePath() {
		return birthCertificatePath;
	}
	public void setBirthCertificatePath(String birthCertificatePath) {
		this.birthCertificatePath = birthCertificatePath;
	}
	public String getTransferCertiPath() {
		return transferCertiPath;
	}
	public void setTransferCertiPath(String transferCertiPath) {
		this.transferCertiPath = transferCertiPath;
	}
	public String getCasteCertiPath() {
		return casteCertiPath;
	}
	public void setCasteCertiPath(String casteCertiPath) {
		this.casteCertiPath = casteCertiPath;
	}
	public String getCharacterCertiPath() {
		return characterCertiPath;
	}
	public void setCharacterCertiPath(String characterCertiPath) {
		this.characterCertiPath = characterCertiPath;
	}
	public String getMarksheetPath() {
		return marksheetPath;
	}
	public void setMarksheetPath(String marksheetPath) {
		this.marksheetPath = marksheetPath;
	}
	public String getMedicalCertiPath() {
		return medicalCertiPath;
	}
	public void setMedicalCertiPath(String medicalCertiPath) {
		this.medicalCertiPath = medicalCertiPath;
	}
	public String getITRPath() {
		return ITRPath;
	}
	public void setITRPath(String iTRPath) {
		ITRPath = iTRPath;
	}
	public String getAddressProofPath() {
		return addressProofPath;
	}
	public void setAddressProofPath(String addressProofPath) {
		this.addressProofPath = addressProofPath;
	}
	public String getProgressReportPath() {
		return progressReportPath;
	}
	public void setProgressReportPath(String progressReportPath) {
		this.progressReportPath = progressReportPath;
	}
	public String getFatherPhotoPath() {
		return FatherPhotoPath;
	}
	public void setFatherPhotoPath(String fatherPhotoPath) {
		FatherPhotoPath = fatherPhotoPath;
	}
	public String getMotherPhotoPath() {
		return motherPhotoPath;
	}
	public void setMotherPhotoPath(String motherPhotoPath) {
		this.motherPhotoPath = motherPhotoPath;
	}
	public String getGuardianPhotoPath() {
		return guardianPhotoPath;
	}
	public void setGuardianPhotoPath(String guardianPhotoPath) {
		this.guardianPhotoPath = guardianPhotoPath;
	}
	public String getNRIVisaDetailPath() {
		return NRIVisaDetailPath;
	}
	public void setNRIVisaDetailPath(String nRIVisaDetailPath) {
		NRIVisaDetailPath = nRIVisaDetailPath;
	}
	public String getMigrationCertiPath() {
		return migrationCertiPath;
	}
	public void setMigrationCertiPath(String migrationCertiPath) {
		this.migrationCertiPath = migrationCertiPath;
	}
	public String getLocalGuardianUndertakingCertiPath() {
		return localGuardianUndertakingCertiPath;
	}
	public void setLocalGuardianUndertakingCertiPath(String localGuardianUndertakingCertiPath) {
		this.localGuardianUndertakingCertiPath = localGuardianUndertakingCertiPath;
	}
	public String getParentUndertakingPath() {
		return parentUndertakingPath;
	}
	public void setParentUndertakingPath(String parentUndertakingPath) {
		this.parentUndertakingPath = parentUndertakingPath;
	}
	public String getBondOfIndemnityPath() {
		return bondOfIndemnityPath;
	}
	public void setBondOfIndemnityPath(String bondOfIndemnityPath) {
		this.bondOfIndemnityPath = bondOfIndemnityPath;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public MultipartFile getBirthCertificatePathFile() {
		return birthCertificatePathFile;
	}
	public void setBirthCertificatePathFile(MultipartFile birthCertificatePathFile) {
		this.birthCertificatePathFile = birthCertificatePathFile;
	}
	public MultipartFile getTransferCertiPathFile() {
		return transferCertiPathFile;
	}
	public void setTransferCertiPathFile(MultipartFile transferCertiPathFile) {
		this.transferCertiPathFile = transferCertiPathFile;
	}
	public MultipartFile getCasteCertiPathFile() {
		return casteCertiPathFile;
	}
	public void setCasteCertiPathFile(MultipartFile casteCertiPathFile) {
		this.casteCertiPathFile = casteCertiPathFile;
	}
	public MultipartFile getCharacterCertiPathFile() {
		return characterCertiPathFile;
	}
	public void setCharacterCertiPathFile(MultipartFile characterCertiPathFile) {
		this.characterCertiPathFile = characterCertiPathFile;
	}
	public MultipartFile getMarksheetPathFile() {
		return marksheetPathFile;
	}
	public void setMarksheetPathFile(MultipartFile marksheetPathFile) {
		this.marksheetPathFile = marksheetPathFile;
	}
	public MultipartFile getMedicalCertiPathFile() {
		return medicalCertiPathFile;
	}
	public void setMedicalCertiPathFile(MultipartFile medicalCertiPathFile) {
		this.medicalCertiPathFile = medicalCertiPathFile;
	}
	public MultipartFile getITRPathFile() {
		return ITRPathFile;
	}
	public void setITRPathFile(MultipartFile iTRPathFile) {
		ITRPathFile = iTRPathFile;
	}
	public MultipartFile getAddressProofPathFile() {
		return addressProofPathFile;
	}
	public void setAddressProofPathFile(MultipartFile addressProofPathFile) {
		this.addressProofPathFile = addressProofPathFile;
	}
	public MultipartFile getProgressReportPathFile() {
		return progressReportPathFile;
	}
	public void setProgressReportPathFile(MultipartFile progressReportPathFile) {
		this.progressReportPathFile = progressReportPathFile;
	}
	public MultipartFile getFatherPhotoPathFile() {
		return FatherPhotoPathFile;
	}
	public void setFatherPhotoPathFile(MultipartFile fatherPhotoPathFile) {
		FatherPhotoPathFile = fatherPhotoPathFile;
	}
	public MultipartFile getMotherPhotoPathFile() {
		return motherPhotoPathFile;
	}
	public void setMotherPhotoPathFile(MultipartFile motherPhotoPathFile) {
		this.motherPhotoPathFile = motherPhotoPathFile;
	}
	public MultipartFile getGuardianPhotoPathFile() {
		return guardianPhotoPathFile;
	}
	public void setGuardianPhotoPathFile(MultipartFile guardianPhotoPathFile) {
		this.guardianPhotoPathFile = guardianPhotoPathFile;
	}
	public MultipartFile getNRIVisaDetailPathFile() {
		return NRIVisaDetailPathFile;
	}
	public void setNRIVisaDetailPathFile(MultipartFile nRIVisaDetailPathFile) {
		NRIVisaDetailPathFile = nRIVisaDetailPathFile;
	}
	public MultipartFile getMigrationCertiPathFile() {
		return migrationCertiPathFile;
	}
	public void setMigrationCertiPathFile(MultipartFile migrationCertiPathFile) {
		this.migrationCertiPathFile = migrationCertiPathFile;
	}
	public MultipartFile getLocalGuardianUndertakingCertiPathFile() {
		return localGuardianUndertakingCertiPathFile;
	}
	public void setLocalGuardianUndertakingCertiPathFile(MultipartFile localGuardianUndertakingCertiPathFile) {
		this.localGuardianUndertakingCertiPathFile = localGuardianUndertakingCertiPathFile;
	}
	public MultipartFile getParentUndertakingPathFile() {
		return parentUndertakingPathFile;
	}
	public void setParentUndertakingPathFile(MultipartFile parentUndertakingPathFile) {
		this.parentUndertakingPathFile = parentUndertakingPathFile;
	}
	public MultipartFile getBondOfIndemnityPathFile() {
		return bondOfIndemnityPathFile;
	}
	public void setBondOfIndemnityPathFile(MultipartFile bondOfIndemnityPathFile) {
		this.bondOfIndemnityPathFile = bondOfIndemnityPathFile;
	}
	public boolean isBirthCertificatePathBool() {
		return birthCertificatePathBool;
	}
	public void setBirthCertificatePathBool(boolean birthCertificatePathBool) {
		this.birthCertificatePathBool = birthCertificatePathBool;
	}
	public boolean isTransferCertiPathBool() {
		return transferCertiPathBool;
	}
	public void setTransferCertiPathBool(boolean transferCertiPathBool) {
		this.transferCertiPathBool = transferCertiPathBool;
	}
	public boolean isCasteCertiPathBool() {
		return casteCertiPathBool;
	}
	public void setCasteCertiPathBool(boolean casteCertiPathBool) {
		this.casteCertiPathBool = casteCertiPathBool;
	}
	public boolean isCharacterCertiPathBool() {
		return characterCertiPathBool;
	}
	public void setCharacterCertiPathBool(boolean characterCertiPathBool) {
		this.characterCertiPathBool = characterCertiPathBool;
	}
	public boolean isMarksheetPathBool() {
		return marksheetPathBool;
	}
	public void setMarksheetPathBool(boolean marksheetPathBool) {
		this.marksheetPathBool = marksheetPathBool;
	}
	public boolean isMedicalCertiPathBool() {
		return medicalCertiPathBool;
	}
	public void setMedicalCertiPathBool(boolean medicalCertiPathBool) {
		this.medicalCertiPathBool = medicalCertiPathBool;
	}
	public boolean isITRPathBool() {
		return ITRPathBool;
	}
	public void setITRPathBool(boolean iTRPathBool) {
		ITRPathBool = iTRPathBool;
	}
	public boolean isAddressProofPathBool() {
		return addressProofPathBool;
	}
	public void setAddressProofPathBool(boolean addressProofPathBool) {
		this.addressProofPathBool = addressProofPathBool;
	}
	public boolean isProgressReportPathBool() {
		return progressReportPathBool;
	}
	public void setProgressReportPathBool(boolean progressReportPathBool) {
		this.progressReportPathBool = progressReportPathBool;
	}
	public boolean isFatherPhotoPathBool() {
		return fatherPhotoPathBool;
	}
	public void setFatherPhotoPathBool(boolean fatherPhotoPathBool) {
		this.fatherPhotoPathBool = fatherPhotoPathBool;
	}
	public boolean isMotherPhotoPathBool() {
		return motherPhotoPathBool;
	}
	public void setMotherPhotoPathBool(boolean motherPhotoPathBool) {
		this.motherPhotoPathBool = motherPhotoPathBool;
	}
	public boolean isGuardianPhotoPathBool() {
		return guardianPhotoPathBool;
	}
	public void setGuardianPhotoPathBool(boolean guardianPhotoPathBool) {
		this.guardianPhotoPathBool = guardianPhotoPathBool;
	}
	public boolean isNRIVisaDetailPathBool() {
		return NRIVisaDetailPathBool;
	}
	public void setNRIVisaDetailPathBool(boolean nRIVisaDetailPathBool) {
		NRIVisaDetailPathBool = nRIVisaDetailPathBool;
	}
	public boolean isMigrationCertiPathBool() {
		return migrationCertiPathBool;
	}
	public void setMigrationCertiPathBool(boolean migrationCertiPathBool) {
		this.migrationCertiPathBool = migrationCertiPathBool;
	}
	public boolean isLocalGuardianUndertakingCertiPathBool() {
		return localGuardianUndertakingCertiPathBool;
	}
	public void setLocalGuardianUndertakingCertiPathBool(boolean localGuardianUndertakingCertiPathBool) {
		this.localGuardianUndertakingCertiPathBool = localGuardianUndertakingCertiPathBool;
	}
	public boolean isParentUndertakingPathBool() {
		return parentUndertakingPathBool;
	}
	public void setParentUndertakingPathBool(boolean parentUndertakingPathBool) {
		this.parentUndertakingPathBool = parentUndertakingPathBool;
	}
	public boolean isBondOfIndemnityPathBool() {
		return bondOfIndemnityPathBool;
	}
	public void setBondOfIndemnityPathBool(boolean bondOfIndemnityPathBool) {
		this.bondOfIndemnityPathBool = bondOfIndemnityPathBool;
	}
}
