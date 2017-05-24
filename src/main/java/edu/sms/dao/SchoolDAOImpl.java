package edu.sms.dao;


import org.springframework.stereotype.Repository;

import edu.sms.dao.genric.DaoBase;
import edu.sms.entity.SchoolEntity;

@Repository
public class SchoolDAOImpl  extends DaoBase<SchoolEntity> implements  SchoolDAO {
}
