package edu.sms.model.student.manage;

import java.io.Serializable;
import java.util.Date;

public class StudentInfectiousDetailsForm implements Serializable{
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
	public boolean isMeasles() {
		return measles;
	}
	public void setMeasles(boolean measles) {
		this.measles = measles;
	}
	public boolean isPoliomyelitis() {
		return poliomyelitis;
	}
	public void setPoliomyelitis(boolean poliomyelitis) {
		this.poliomyelitis = poliomyelitis;
	}
	public boolean isChickenPox() {
		return chickenPox;
	}
	public void setChickenPox(boolean chickenPox) {
		this.chickenPox = chickenPox;
	}
	public boolean isMumps() {
		return mumps;
	}
	public void setMumps(boolean mumps) {
		this.mumps = mumps;
	}
	public boolean isRubella() {
		return rubella;
	}
	public void setRubella(boolean rubella) {
		this.rubella = rubella;
	}
	public boolean isWhoopingCough() {
		return whoopingCough;
	}
	public void setWhoopingCough(boolean whoopingCough) {
		this.whoopingCough = whoopingCough;
	}
	public boolean isDiphtheria() {
		return diphtheria;
	}
	public void setDiphtheria(boolean diphtheria) {
		this.diphtheria = diphtheria;
	}
	public boolean isInfectiveHepatitis() {
		return infectiveHepatitis;
	}
	public void setInfectiveHepatitis(boolean infectiveHepatitis) {
		this.infectiveHepatitis = infectiveHepatitis;
	}
	public boolean isTuberculosis() {
		return tuberculosis;
	}
	public void setTuberculosis(boolean tuberculosis) {
		this.tuberculosis = tuberculosis;
	}
	public boolean isDysentery() {
		return dysentery;
	}
	public void setDysentery(boolean dysentery) {
		this.dysentery = dysentery;
	}
	public boolean isScarletFever() {
		return scarletFever;
	}
	public void setScarletFever(boolean scarletFever) {
		this.scarletFever = scarletFever;
	}
	public boolean isMalaria() {
		return malaria;
	}
	public void setMalaria(boolean malaria) {
		this.malaria = malaria;
	}
	public boolean isJapaneseEncephelitis() {
		return japaneseEncephelitis;
	}
	public void setJapaneseEncephelitis(boolean japaneseEncephelitis) {
		this.japaneseEncephelitis = japaneseEncephelitis;
	}
	public boolean isKalaAzar() {
		return kalaAzar;
	}
	public void setKalaAzar(boolean kalaAzar) {
		this.kalaAzar = kalaAzar;
	}
	public boolean isTyphoid() {
		return typhoid;
	}
	public void setTyphoid(boolean typhoid) {
		this.typhoid = typhoid;
	}
	public boolean isHivAids() {
		return hivAids;
	}
	public void setHivAids(boolean hivAids) {
		this.hivAids = hivAids;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

}
