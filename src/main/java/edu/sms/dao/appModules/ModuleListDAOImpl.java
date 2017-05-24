package edu.sms.dao.appModules;


import java.util.List;

import org.springframework.stereotype.Repository;

import edu.sms.dao.genric.DaoBase;
import edu.sms.entity.appModules.ModSubPerMissionEntity;
import edu.sms.entity.appModules.ModulesEntity;

@Repository
public class ModuleListDAOImpl  extends DaoBase<ModulesEntity> implements  ModuleListDAO {

	public void save(ModulesEntity domain) {
		// TODO Auto-generated method stub
		
	}

	public void update(ModulesEntity domain) {
		// TODO Auto-generated method stub
		
	}

	public void delete(ModulesEntity domain) {
		// TODO Auto-generated method stub
		
	}

	

	/*public List<ModulesEntity> loadAll() {
		
		return null;
	}*/

	/*@Autowired
	private SessionFactory sessionFactory;

	

	@Override
	public void saveOrg(OrganizationEntity OrganizationEntity) {
		try {
			//Session session = sessionFactory.getCurrentSession();
			session.saveOrUpdate(OrganizationEntity);
		} catch (HibernateException e) {
			e.printStackTrace();
		}
	}

	
	@Override
	public void update(OrganizationEntity domain) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(OrganizationEntity domain) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public OrganizationEntity get(Serializable id) {
		// TODO Auto-generated method stub
		return null;
	}

	
	*/
	
	
	
}
