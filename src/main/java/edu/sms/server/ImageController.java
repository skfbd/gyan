package edu.sms.server;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import edu.sms.entity.organization.OrganizationEntity;
import edu.sms.model.SchoolForm;
import edu.sms.organization.OrgService;
import edu.sms.service.SchoolService;

@Controller
@RequestMapping("/images")
public class ImageController {

	private OrgService orgService;
	private SchoolService schoolService;
	
	@RequestMapping(value = "imageOrgLogo")
	public void showImage(HttpServletResponse response, HttpServletRequest request, @RequestParam("id") Integer itemId) throws ServletException, IOException {
		List<OrganizationEntity> orgList = orgService.getOrgList();
		response.setContentType("image/jpeg, image/jpg, image/png, image/gif");
		for (Iterator iterator = orgList.iterator(); iterator.hasNext();) {
			OrganizationEntity organizationEntity = (OrganizationEntity) iterator.next();
			
			if(organizationEntity.getLogo()!=null && organizationEntity.getLogo().length>1 && organizationEntity.getOrgId()==itemId.longValue()){
				response.getOutputStream().write(organizationEntity.getLogo());
			}
			
		} 

		response.getOutputStream().close();
	}

	
	@RequestMapping(value = "imageSchoolLogo")
	public void showSchoolImage(HttpServletResponse response, HttpServletRequest request, @RequestParam("id") Integer itemId) throws ServletException, IOException {
		List<SchoolForm> orgList = schoolService.getSchoolList();
		response.setContentType("image/jpeg, image/jpg, image/png, image/gif");
		for (Iterator iterator = orgList.iterator(); iterator.hasNext();) {
			SchoolForm schoolFrm = (SchoolForm) iterator.next();
			
			if(schoolFrm.getLogo()!=null && schoolFrm.getLogo().length>1 && schoolFrm.getSchoolId()==itemId.longValue()){
				response.getOutputStream().write(schoolFrm.getLogo());
			}
			
		} 

		response.getOutputStream().close();
	}

	
	@RequestMapping(value = "imageEmployee")
	public void showEmployeeImage(HttpServletResponse response, HttpServletRequest request, @RequestParam("id") Integer itemId,@RequestParam("fileName") String fileName) throws ServletException, IOException {
		List<SchoolForm> orgList = schoolService.getSchoolList();
		response.setContentType("image/jpeg, image/jpg, image/png, image/gif");
		String fName =itemId+"_Employee_" + fileName;
		try {
												// Creating the directory to store file
						String rootPath = System.getProperty("catalina.home");
						File dir = new File(rootPath + File.separator + "employeeDoc/PersonalDoc/EmployeeImg");
						if (!dir.exists())
							dir.mkdirs();

						// Create the file on server
						File serverFile = new File(dir.getAbsolutePath()+ File.separator + fName);
						BufferedInputStream ss = new BufferedInputStream(new FileInputStream(serverFile));
						ByteArrayOutputStream bos=new ByteArrayOutputStream();
						int b;
						byte[] buffer = new byte[1024];
						while((b=ss.read(buffer))!=-1){
						   bos.write(buffer,0,b);
						}
						byte[] fileBytes=bos.toByteArray();
						response.getOutputStream().write(fileBytes);
						ss.close();
						bos.close();
						
					} catch (Exception e) {
		  }
		
		response.getOutputStream().close();
	}
	
	
	public SchoolService getSchoolService() {
		return schoolService;
	}


	public void setSchoolService(SchoolService schoolService) {
		this.schoolService = schoolService;
	}


	public OrgService getOrgService() {
		return orgService;
	}

	public void setOrgService(OrgService orgService) {
		this.orgService = orgService;
	}

}
