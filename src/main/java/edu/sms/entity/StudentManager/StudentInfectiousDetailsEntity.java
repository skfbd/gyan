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
@Table(name = "Student_Infectious_Details")
public class StudentInfectiousDetailsEntity implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private long id;
	private long studentId;
	private boolean measles;
	private boolean poliomyelitis;
	private boolean chickenPox;
	private boolean mumps;
	private boolean rubella;
	private boolean whoopingCough;
	private boolean diphtheria;
	private boolean infectiveHepatitis;
	private boolean tuberculosis;
	private boolean dysentery;
	private boolean scarletFever;
	private boolean malaria;
	private boolean japaneseEncephelitis;
	private boolean kalaAzar;
	private boolean typhoid;
	private boolean hivAids;
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
	
	@Column(name="measles")
	public boolean isMeasles() {
		return measles;
	}
	public void setMeasles(boolean measles) {
		this.measles = measles;
	}
	
	@Column(name="poliomyelitis")
	public boolean isPoliomyelitis() {
		return poliomyelitis;
	}
	public void setPoliomyelitis(boolean poliomyelitis) {
		this.poliomyelitis = poliomyelitis;
	}
	
	@Column(name="chicken_pox")
	public boolean isChickenPox() {
		return chickenPox;
	}
	public void setChickenPox(boolean chickenPox) {
		this.chickenPox = chickenPox;
	}
	
	@Column(name="mumps")
	public boolean isMumps() {
		return mumps;
	}
	public void setMumps(boolean mumps) {
		this.mumps = mumps;
	}
	
	@Column(name="rubella")
	public boolean isRubella() {
		return rubella;
	}
	public void setRubella(boolean rubella) {
		this.rubella = rubella;
	}
	
	@Column(name="whooping_cough")
	public boolean isWhoopingCough() {
		return whoopingCough;
	}
	public void setWhoopingCough(boolean whoopingCough) {
		this.whoopingCough = whoopingCough;
	}
	
	@Column(name="diphtheria")
	public boolean isDiphtheria() {
		return diphtheria;
	}
	public void setDiphtheria(boolean diphtheria) {
		this.diphtheria = diphtheria;
	}
	
	@Column(name="infective_hepatitis")
	public boolean isInfectiveHepatitis() {
		return infectiveHepatitis;
	}
	public void setInfectiveHepatitis(boolean infectiveHepatitis) {
		this.infectiveHepatitis = infectiveHepatitis;
	}
	
	@Column(name="tuberculosis")
	public boolean isTuberculosis() {
		return tuberculosis;
	}
	public void setTuberculosis(boolean tuberculosis) {
		this.tuberculosis = tuberculosis;
	}
	
	@Column(name="dysentery")
	public boolean isDysentery() {
		return dysentery;
	}
	public void setDysentery(boolean dysentery) {
		this.dysentery = dysentery;
	}
	
	@Column(name="scarlet_fever")
	public boolean isScarletFever() {
		return scarletFever;
	}
	public void setScarletFever(boolean scarletFever) {
		this.scarletFever = scarletFever;
	}
	
	@Column(name="malaria")
	public boolean isMalaria() {
		return malaria;
	}
	public void setMalaria(boolean malaria) {
		this.malaria = malaria;
	}
	
	@Column(name="japanese_encephelitis")
	public boolean isJapaneseEncephelitis() {
		return japaneseEncephelitis;
	}
	public void setJapaneseEncephelitis(boolean japaneseEncephelitis) {
		this.japaneseEncephelitis = japaneseEncephelitis;
	}
	
	@Column(name="kala_azar")
	public boolean isKalaAzar() {
		return kalaAzar;
	}
	public void setKalaAzar(boolean kalaAzar) {
		this.kalaAzar = kalaAzar;
	}
	
	@Column(name="typhoid")
	public boolean isTyphoid() {
		return typhoid;
	}
	public void setTyphoid(boolean typhoid) {
		this.typhoid = typhoid;
	}
	
	@Column(name="Hiv_aids")
	public boolean isHivAids() {
		return hivAids;
	}
	public void setHivAids(boolean hivAids) {
		this.hivAids = hivAids;
	}
	
	@Column(name="creation_date")
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

}
