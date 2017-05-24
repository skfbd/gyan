package edu.sms.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import edu.sms.model.SubModLstForm;


public class MenuForm implements Serializable {
	private static final long serialVersionUID = 1L;
	
	
	public MenuForm() {

	}
	
   private String menuName;
   private String menuHtm;


	public String getMenuName() {
		return menuName;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	public String getMenuHtm() {
		return menuHtm;
	}
	public void setMenuHtm(String menuHtm) {
		this.menuHtm = menuHtm;
	}
   
}
