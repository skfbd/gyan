/**
 * 
 */
package edu.sms.dao.student.manage.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import edu.sms.dao.student.manage.StudentDao;
import edu.sms.entity.StudentManager.StudentAcademicDetailsEntity;
import edu.sms.entity.StudentManager.StudentAddressEntity;
import edu.sms.entity.StudentManager.StudentEnclosedDocumentsEntity;
import edu.sms.entity.StudentManager.StudentExtraDetailsEntity;
import edu.sms.entity.StudentManager.StudentFathersInfoEntity;
import edu.sms.entity.StudentManager.StudentHealthDetailsEntity;
import edu.sms.entity.StudentManager.StudentInfectiousDetailsEntity;
import edu.sms.entity.StudentManager.StudentLastAcademicDetailsEntity;
import edu.sms.entity.StudentManager.StudentLocalGuardianInfoEntity;
import edu.sms.entity.StudentManager.StudentMasterEntity;
import edu.sms.entity.StudentManager.StudentMothersInfoEntity;
import edu.sms.entity.StudentManager.StudentNonInfectiousDetailsEntity;
import edu.sms.entity.StudentManager.StudentOtherFacilityEntity;
import edu.sms.entity.StudentManager.StudentOtherInfoEntity;
import edu.sms.entity.StudentManager.StudentParentalCommonInfoEntity;
import edu.sms.entity.StudentManager.StudentPersonalDetailsEntity;
import edu.sms.entity.StudentManager.StudentSibblingInfoEntity;
import edu.sms.model.student.manage.StudentListForm;

/** 
 * @author Kundan Suthar
 *
 */

@Repository
public class StudentDaoImpl extends HibernateDaoSupport implements StudentDao {
	
	@Autowired
	public void setSession(SessionFactory sessionFactory) {
		this.setSessionFactory(sessionFactory);
	}
	
	public void createStudent(StudentMasterEntity studentMasterEntity) {
		try {
			getHibernateTemplate().save(studentMasterEntity);
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		
	}

	public void createStudentAcademicDetails(StudentAcademicDetailsEntity studentAcademicDetailsEntity) {
		try {
			getHibernateTemplate().save(studentAcademicDetailsEntity);
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		
	}

	public void createStudentAddress(StudentAddressEntity studentAddressEntity) {
		try {
			getHibernateTemplate().save(studentAddressEntity);
		} catch (HibernateException e) {
			e.printStackTrace();
		}
	}

	public void createStudentFathersInfo(StudentFathersInfoEntity studentFathersInfoEntity) {
		try {
			getHibernateTemplate().save(studentFathersInfoEntity);
		} catch (HibernateException e) {
			e.printStackTrace();
		}
	}

	public void createStudentLocalGuardianInfo(StudentLocalGuardianInfoEntity studentLocalGuardianInfoEntity) {
		try {
			getHibernateTemplate().save(studentLocalGuardianInfoEntity);
		} catch (HibernateException e) {
			e.printStackTrace();
		}
	}

	public void createStudentMothersInfo(StudentMothersInfoEntity studentMothersInfoEntity) {
		try {
			getHibernateTemplate().save(studentMothersInfoEntity);
		} catch (HibernateException e) {
			e.printStackTrace();
		}
	}

	public void createStudentParentalCommonInfo(StudentParentalCommonInfoEntity studentParentalCommonInfoEntity) {
		try {
			getHibernateTemplate().save(studentParentalCommonInfoEntity);
		} catch (HibernateException e) {
			e.printStackTrace();
		}
	}

	public void createStudentPersonalDetails(StudentPersonalDetailsEntity studentPersonalDetailsEntity) {
		try {
			getHibernateTemplate().save(studentPersonalDetailsEntity);
		} catch (HibernateException e) {
			e.printStackTrace();
		}
	}

	public void createStudentSibblingInfo(StudentSibblingInfoEntity studentSibblingInfoEntity) {
		try {
			getHibernateTemplate().save(studentSibblingInfoEntity);
		} catch (HibernateException e) {
			e.printStackTrace();
		}
	}

	public void createStudentOtherInfo(StudentOtherInfoEntity studentOtherInfoEntity) {
		try {
			getHibernateTemplate().save(studentOtherInfoEntity);
		} catch (HibernateException e) {
			e.printStackTrace();
		}
	}

	public void createStudentOtherFacility(StudentOtherFacilityEntity studentOtherFacilityEntity) {
		try {
			getHibernateTemplate().save(studentOtherFacilityEntity);
		} catch (HibernateException e) {
			e.printStackTrace();
		}
	}

	public void createStudentLastAcademicDetails(StudentLastAcademicDetailsEntity studentLastAcademicDetailsEntity) {
		try {
			getHibernateTemplate().save(studentLastAcademicDetailsEntity);
		} catch (HibernateException e) {
			e.printStackTrace();
		}
	}

	public void createStudentEnclosedDocuments(StudentEnclosedDocumentsEntity studentEnclosedDocumentsEntity) {
		try {
			getHibernateTemplate().save(studentEnclosedDocumentsEntity);
		} catch (HibernateException e) {
			e.printStackTrace();
		}
	}

	public void createStudentExtraDetails(StudentExtraDetailsEntity studentExtraDetailsEntity) {
		try {
			getHibernateTemplate().save(studentExtraDetailsEntity);
		} catch (HibernateException e) {
			e.printStackTrace();
		}
	}

	public void createStudentInfectiousDetails(StudentInfectiousDetailsEntity studentInfectiousDetailsEntity) {
		try {
			getHibernateTemplate().save(studentInfectiousDetailsEntity);
		} catch (HibernateException e) {
			e.printStackTrace();
		}
	}

	public void createStudentNonInfectiousDetails(StudentNonInfectiousDetailsEntity studentNonInfectiousDetailsEntity) {
		try {
			getHibernateTemplate().save(studentNonInfectiousDetailsEntity);
		} catch (HibernateException e) {
			e.printStackTrace();
		}
	}

	public void createStudentHealthDetails(StudentHealthDetailsEntity studentHealthDetailsEntity) {
		try {
			getHibernateTemplate().save(studentHealthDetailsEntity);
		} catch (HibernateException e) {
			e.printStackTrace();
		}
	}

	public StudentMasterEntity loadStudentMasterEntity(long studentId) {
		return getHibernateTemplate().load(StudentMasterEntity.class, studentId);
	}

	@SuppressWarnings("unchecked")
	public ArrayList<StudentAcademicDetailsEntity> loadStudentAcademicDetailsEntity(long studentId) {
		try{
			Query query = getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery("from StudentAcademicDetailsEntity sad where sad.studentId =:studentId order by sad.id desc");
			query.setLong("studentId", studentId);
			return (ArrayList<StudentAcademicDetailsEntity>) query.list();
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	public ArrayList<StudentAddressEntity> loadStudentAddressEntity(long studentId) {
		try{
			Query query = getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery("from StudentAddressEntity sa where sa.studentId =:studentId order by sa.id desc");
			query.setLong("studentId", studentId);
			return (ArrayList<StudentAddressEntity>) query.list();
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	public ArrayList<StudentFathersInfoEntity> loadStudentFathersInfoEntity(long studentId) {
		try{
			Query query = getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery("from StudentFathersInfoEntity sfi where sfi.studentId =:studentId order by sfi.id desc");
			query.setLong("studentId", studentId);
			return (ArrayList<StudentFathersInfoEntity>) query.list();
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	public ArrayList<StudentLocalGuardianInfoEntity> loadStudentLocalGuardianInfoEntity(long studentId) {
		try{
			Query query = getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery("from StudentLocalGuardianInfoEntity slgi where slgi.studentId =:studentId order by slgi.id desc");
			query.setLong("studentId", studentId);
			return (ArrayList<StudentLocalGuardianInfoEntity>) query.list();
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	public ArrayList<StudentMothersInfoEntity> loadStudentMothersInfoEntity(long studentId) {
		try{
			Query query = getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery("from StudentMothersInfoEntity smi where smi.studentId =:studentId order by smi.id desc");
			query.setLong("studentId", studentId);
			return (ArrayList<StudentMothersInfoEntity>) query.list();
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	public ArrayList<StudentParentalCommonInfoEntity> loadStudentParentalCommonInfoEntity(long studentId) {
		try{
			Query query = getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery("from StudentParentalCommonInfoEntity spci where spci.studentId =:studentId order by spci.id desc");
			query.setLong("studentId", studentId);
			return (ArrayList<StudentParentalCommonInfoEntity>) query.list();
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	public ArrayList<StudentPersonalDetailsEntity> loadStudentPersonalDetailsEntity(long studentId) {
		try{
			Query query = getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery("from StudentPersonalDetailsEntity spd where spd.studentId =:studentId order by spd.id desc");
			query.setLong("studentId", studentId);
			return (ArrayList<StudentPersonalDetailsEntity>) query.list();
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	public ArrayList<StudentSibblingInfoEntity> loadStudentSibblingInfoEntity(long studentId) {
		try{
			Query query = getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery("from StudentSibblingInfoEntity ssi where ssi.studentId =:studentId order by ssi.id desc");
			query.setLong("studentId", studentId);
			return (ArrayList<StudentSibblingInfoEntity>) query.list();
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	public ArrayList<StudentOtherInfoEntity> loadStudentOtherInfoEntity(long studentId) {
		try{
			Query query = getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery("from StudentOtherInfoEntity soi where soi.studentId =:studentId order by soi.id desc");
			query.setLong("studentId", studentId);
			return (ArrayList<StudentOtherInfoEntity>) query.list();
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	public ArrayList<StudentOtherFacilityEntity> loadStudentOtherFacilityEntity(long studentId) {
		try{
			Query query = getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery("from StudentOtherFacilityEntity sof where sof.studentId =:studentId order by sof.id desc");
			query.setLong("studentId", studentId);
			return (ArrayList<StudentOtherFacilityEntity>) query.list();
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	public ArrayList<StudentLastAcademicDetailsEntity> loadStudentLastAcademicDetailsEntity(long studentId) {
		try{
			Query query = getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery("from StudentLastAcademicDetailsEntity sad where sad.studentId =:studentId order by sad.id desc");
			query.setLong("studentId", studentId);
			return (ArrayList<StudentLastAcademicDetailsEntity>) query.list();
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	public ArrayList<StudentEnclosedDocumentsEntity> loadStudentEnclosedDocumentsEntity(long studentId) {
		try{
			Query query = getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery("from StudentEnclosedDocumentsEntity sed where sed.studentId =:studentId order by sed.id desc");
			query.setLong("studentId", studentId);
			return (ArrayList<StudentEnclosedDocumentsEntity>) query.list();
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	public ArrayList<StudentExtraDetailsEntity> loadStudentExtraDetailsEntity(long studentId) {
		try{
			Query query = getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery("from StudentExtraDetailsEntity sed where sed.studentId =:studentId order by sed.id desc");
			query.setLong("studentId", studentId);
			return (ArrayList<StudentExtraDetailsEntity>) query.list();
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	public ArrayList<StudentInfectiousDetailsEntity> loadStudentInfectiousDetailsEntity(long studentId) {
		try{
			Query query = getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery("from StudentInfectiousDetailsEntity sid where sid.studentId =:studentId order by sid.id desc");
			query.setLong("studentId", studentId);
			return (ArrayList<StudentInfectiousDetailsEntity>) query.list();
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	public ArrayList<StudentNonInfectiousDetailsEntity> loadStudentNonInfectiousDetailsEntity(long studentId) {
		try{
			Query query = getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery("from StudentNonInfectiousDetailsEntity snid where snid.studentId =:studentId order by snid.id desc");
			query.setLong("studentId", studentId);
			return (ArrayList<StudentNonInfectiousDetailsEntity>) query.list();
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	public ArrayList<StudentHealthDetailsEntity> loadStudentHealthDetailsEntity(long studentId) {
		try{
			Query query = getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery("from StudentHealthDetailsEntity shd where shd.studentId =:studentId order by shd.id desc");
			query.setLong("studentId", studentId);
			return (ArrayList<StudentHealthDetailsEntity>) query.list();
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return null;
	}

	public void updateStudent(StudentMasterEntity studentMasterEntity) {
		try {
			getHibernateTemplate().update(studentMasterEntity);
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		
	}

	public void updateStudentAcademicDetails(StudentAcademicDetailsEntity studentAcademicDetailsEntity) {
		try {
			getHibernateTemplate().update(studentAcademicDetailsEntity);
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		
	}

	public void updateStudentAddress(StudentAddressEntity studentAddressEntity) {
		try {
			getHibernateTemplate().update(studentAddressEntity);
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		
	}

	public void updateStudentFathersInfo(StudentFathersInfoEntity studentFathersInfoEntity) {
		try {
			getHibernateTemplate().update(studentFathersInfoEntity);
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		
	}

	public void updateStudentLocalGuardianInfo(StudentLocalGuardianInfoEntity studentLocalGuardianInfoEntity) {
		try {
			getHibernateTemplate().update(studentLocalGuardianInfoEntity);
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		
	}

	public void updateStudentMothersInfo(StudentMothersInfoEntity studentMothersInfoEntity) {
		try {
			getHibernateTemplate().update(studentMothersInfoEntity);
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		
	}

	public void updateStudentParentalCommonInfo(StudentParentalCommonInfoEntity studentParentalCommonInfoEntity) {
		try {
			getHibernateTemplate().update(studentParentalCommonInfoEntity);
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		
	}

	public void updateStudentPersonalDetails(StudentPersonalDetailsEntity studentPersonalDetailsEntity) {
		try {
			getHibernateTemplate().update(studentPersonalDetailsEntity);
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		
	}

	public void updateStudentSibblingInfo(StudentSibblingInfoEntity studentSibblingInfoEntity) {
		try {
			getHibernateTemplate().update(studentSibblingInfoEntity);
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		
	}

	public void updateStudentOtherInfo(StudentOtherInfoEntity studentOtherInfoEntity) {
		try {
			getHibernateTemplate().update(studentOtherInfoEntity);
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		
	}

	public void updateStudentOtherFacility(StudentOtherFacilityEntity studentOtherFacilityEntity) {
		try {
			getHibernateTemplate().update(studentOtherFacilityEntity);
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		
	}

	public void updateStudentLastAcademicDetails(StudentLastAcademicDetailsEntity studentLastAcademicDetailsEntity) {
		try {
			getHibernateTemplate().update(studentLastAcademicDetailsEntity);
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		
	}

	public void updateStudentEnclosedDocuments(StudentEnclosedDocumentsEntity studentEnclosedDocumentsEntity) {
		try {
			getHibernateTemplate().update(studentEnclosedDocumentsEntity);
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		
	}

	public void updateStudentExtraDetails(StudentExtraDetailsEntity studentExtraDetailsEntity) {
		try {
			getHibernateTemplate().update(studentExtraDetailsEntity);
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		
	}

	public void updateStudentInfectiousDetails(StudentInfectiousDetailsEntity studentInfectiousDetailsEntity) {
		try {
			getHibernateTemplate().update(studentInfectiousDetailsEntity);
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		
	}

	public void updateStudentNonInfectiousDetails(StudentNonInfectiousDetailsEntity studentNonInfectiousDetailsEntity) {
		try {
			getHibernateTemplate().update(studentNonInfectiousDetailsEntity);
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		
	}

	public void updateStudentHealthDetails(StudentHealthDetailsEntity studentHealthDetailsEntity) {
		try {
			getHibernateTemplate().update(studentHealthDetailsEntity);
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		
	}

	@SuppressWarnings("rawtypes")
	public List getListByCriteria(StudentListForm studentListForm) {
		try{
			StringBuilder sql = new StringBuilder("select sm.student_id,spd.student_first_name , spd.student_middle_name , spd.student_last_name,spd.student_gender, "
					+ "spd.student_dob,spd.student_blood_group,spd.age,spd.student_email_id,sm.student_class ,sm.student_section, sm.student_house "
					+ " from student_master sm , Student_Personal_Details spd where sm.student_id = spd.student_id and sm.school_id = :schoolId ");
			
			if(StringUtils.isNotEmpty(studentListForm.getSession())){
				sql.append(" and spd.student_currently_in_session = :session ");
			}
			if(StringUtils.isNotEmpty(studentListForm.getClasses())){
				sql.append(" and spd.student_class = :classes ");
			}
			if(StringUtils.isNotEmpty(studentListForm.getSection())){
				sql.append(" and spd.student_section = :section ");
			}
			if(StringUtils.isNotEmpty(studentListForm.getStatus())){
				sql.append(" and sm.status = :status ");
			}
			if(StringUtils.isNotEmpty(studentListForm.getGender())){
				sql.append(" and spd.student_gender = :gender ");
			}
			if(StringUtils.isNotEmpty(studentListForm.getHouse())){
				sql.append(" and spd.student_house = :house ");
			}
			if(StringUtils.isNotEmpty(studentListForm.getReservationCategory())){
				sql.append(" and spd.student_caste_category = :reservationCategory ");
			}
			if(StringUtils.isNotEmpty(studentListForm.getFeeCategory())){
				sql.append(" and spd.student_fee_category = :feeCategory ");
			}

			Query query = getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery(sql.toString());
			query.setLong("schoolId", studentListForm.getSchoolId());
			if(StringUtils.isNotEmpty(studentListForm.getSession())){
				query.setString("session",studentListForm.getSession());
			}
			if(StringUtils.isNotEmpty(studentListForm.getClasses())){
				query.setString("classes",studentListForm.getClasses());
			}
			if(StringUtils.isNotEmpty(studentListForm.getSection())){
				query.setString("section",studentListForm.getSection());
			}
			if(StringUtils.isNotEmpty(studentListForm.getStatus())){
				query.setString("status",studentListForm.getStatus());
			}
			if(StringUtils.isNotEmpty(studentListForm.getGender())){
				query.setString("gender",studentListForm.getGender());
			}
			if(StringUtils.isNotEmpty(studentListForm.getHouse())){
				query.setString("house",studentListForm.getHouse());
			}
			if(StringUtils.isNotEmpty(studentListForm.getReservationCategory())){
				query.setString("reservationCategory",studentListForm.getReservationCategory());
			}
			if(StringUtils.isNotEmpty(studentListForm.getFeeCategory())){
				query.setString("feeCategory",studentListForm.getFeeCategory());
			}
			return (ArrayList) query.list();
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
