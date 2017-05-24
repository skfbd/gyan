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
public class StudentNonInfectiousDetailsForm implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private long id;
	private long studentId;
	private boolean accidents;
	private boolean allergies;
	private boolean bronchialAsthama;
	private boolean congenitalHeartDisease;
	private boolean diabetesMellitus;
	private boolean epilepsy;
	private boolean G6pd;
	private boolean rheumaticFever;
	private boolean surgicalOperation;
	private boolean thalassemia;
	private boolean hbDisorder;
	private boolean mentalDisorder;
	private boolean isGrowthDefective;
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
	public boolean isAccidents() {
		return accidents;
	}
	public void setAccidents(boolean accidents) {
		this.accidents = accidents;
	}
	public boolean isAllergies() {
		return allergies;
	}
	public void setAllergies(boolean allergies) {
		this.allergies = allergies;
	}
	public boolean isBronchialAsthama() {
		return bronchialAsthama;
	}
	public void setBronchialAsthama(boolean bronchialAsthama) {
		this.bronchialAsthama = bronchialAsthama;
	}
	public boolean isCongenitalHeartDisease() {
		return congenitalHeartDisease;
	}
	public void setCongenitalHeartDisease(boolean congenitalHeartDisease) {
		this.congenitalHeartDisease = congenitalHeartDisease;
	}
	public boolean isDiabetesMellitus() {
		return diabetesMellitus;
	}
	public void setDiabetesMellitus(boolean diabetesMellitus) {
		this.diabetesMellitus = diabetesMellitus;
	}
	public boolean isEpilepsy() {
		return epilepsy;
	}
	public void setEpilepsy(boolean epilepsy) {
		this.epilepsy = epilepsy;
	}
	public boolean isG6pd() {
		return G6pd;
	}
	public void setG6pd(boolean g6pd) {
		G6pd = g6pd;
	}
	public boolean isRheumaticFever() {
		return rheumaticFever;
	}
	public void setRheumaticFever(boolean rheumaticFever) {
		this.rheumaticFever = rheumaticFever;
	}
	public boolean isSurgicalOperation() {
		return surgicalOperation;
	}
	public void setSurgicalOperation(boolean surgicalOperation) {
		this.surgicalOperation = surgicalOperation;
	}
	public boolean isThalassemia() {
		return thalassemia;
	}
	public void setThalassemia(boolean thalassemia) {
		this.thalassemia = thalassemia;
	}
	public boolean isHbDisorder() {
		return hbDisorder;
	}
	public void setHbDisorder(boolean hbDisorder) {
		this.hbDisorder = hbDisorder;
	}
	public boolean isMentalDisorder() {
		return mentalDisorder;
	}
	public void setMentalDisorder(boolean mentalDisorder) {
		this.mentalDisorder = mentalDisorder;
	}
	public boolean isGrowthDefective() {
		return isGrowthDefective;
	}
	public void setGrowthDefective(boolean isGrowthDefective) {
		this.isGrowthDefective = isGrowthDefective;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

}
