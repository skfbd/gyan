package edu.sms.dao.appModules;



import java.util.List;
import java.util.Map;

import edu.sms.dao.genric.IDaoBase;
import edu.sms.entity.appModules.ModSubPerMissionEntity;


public interface ModSubPerListDAO extends IDaoBase<ModSubPerMissionEntity>{
	public void deletUserType(String userType);
	public void saveList(List<ModSubPerMissionEntity> modSubPerList);
	public List<ModSubPerMissionEntity> loadAll();
	public Map loadEditModule(String editRow);
	
}
 