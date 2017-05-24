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
@Table(name = "Student_Non_Infectious_Details")
public class StudentNonInfectiousDetailsEntity implements Serializable{
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
	
	@Column(name="accidents")
	public boolean isAccidents() {
		return accidents;
	}
	public void setAccidents(boolean accidents) {
		this.accidents = accidents;
	}
	
	@Column(name="allergies")
	public boolean isAllergies() {
		return allergies;
	}
	public void setAllergies(boolean allergies) {
		this.allergies = allergies;
	}
	
	@Column(name="bronchial_asthama")
	public boolean isBronchialAsthama() {
		return bronchialAsthama;
	}
	public void setBronchialAsthama(boolean bronchialAsthama) {
		this.bronchialAsthama = bronchialAsthama;
	}
	
	@Column(name="congenital_heart_disease")
	public boolean isCongenitalHeartDisease() {
		return congenitalHeartDisease;
	}
	public void setCongenitalHeartDisease(boolean congenitalHeartDisease) {
		this.congenitalHeartDisease = congenitalHeartDisease;
	}
	
	@Column(name="diabetes_mellitus")
	public boolean isDiabetesMellitus() {
		return diabetesMellitus;
	}
	public void setDiabetesMellitus(boolean diabetesMellitus) {
		this.diabetesMellitus = diabetesMellitus;
	}
	
	@Column(name="epilepsy")
	public boolean isEpilepsy() {
		return epilepsy;
	}
	public void setEpilepsy(boolean epilepsy) {
		this.epilepsy = epilepsy;
	}
	
	@Column(name="G6pd")
	public boolean isG6pd() {
		return G6pd;
	}
	public void setG6pd(boolean g6pd) {
		G6pd = g6pd;
	}
	
	@Column(name="rheumatic_fever")
	public boolean isRheumaticFever() {
		return rheumaticFever;
	}
	public void setRheumaticFever(boolean rheumaticFever) {
		this.rheumaticFever = rheumaticFever;
	}
	
	@Column(name="surgical_operation")
	public boolean isSurgicalOperation() {
		return surgicalOperation;
	}
	public void setSurgicalOperation(boolean surgicalOperation) {
		this.surgicalOperation = surgicalOperation;
	}
	
	@Column(name="thalassemia")
	public boolean isThalassemia() {
		return thalassemia;
	}
	public void setThalassemia(boolean thalassemia) {
		this.thalassemia = thalassemia;
	}
	
	@Column(name="hb_disorder")
	public boolean isHbDisorder() {
		return hbDisorder;
	}
	public void setHbDisorder(boolean hbDisorder) {
		this.hbDisorder = hbDisorder;
	}
	
	@Column(name="mental_disorder")
	public boolean isMentalDisorder() {
		return mentalDisorder;
	}
	public void setMentalDisorder(boolean mentalDisorder) {
		this.mentalDisorder = mentalDisorder;
	}
	
	@Column(name="is_growth_defective")
	public boolean isGrowthDefective() {
		return isGrowthDefective;
	}
	public void setGrowthDefective(boolean isGrowthDefective) {
		this.isGrowthDefective = isGrowthDefective;
	}
	
	@Column(name="creation_date")
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

}
