package edu.sms.entity.appModules;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;




@Entity
@Table(name = "gyaan_modules")
public class ModulesEntity implements java.io.Serializable {

	private Integer stockId;
	private String stockCode;
	private String stockName;
	private String modCaption;
	

	private List<SubModulesEntity> subRecord = new ArrayList<SubModulesEntity>(0);
 	
	
	@OneToMany(fetch=FetchType.EAGER, targetEntity=SubModulesEntity.class, cascade=CascadeType.ALL)
	@JoinColumn(name = "module_Id", referencedColumnName="moduleId")
	public List<SubModulesEntity> getSubRecord() {
		return subRecord;
	}

	public void setSubRecord(List<SubModulesEntity> subRecord) {
		this.subRecord = subRecord;
	}

	

	public ModulesEntity() {
	}

	public ModulesEntity(String stockCode, String stockName,List<SubModulesEntity> stockDailyRecords) {
		this.stockCode = stockCode;
		this.stockName = stockName;
		this.subRecord = stockDailyRecords;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "moduleId", unique = true, nullable = false)
	public Integer getStockId() {
		return this.stockId;
	}

	public void setStockId(Integer stockId) {
		this.stockId = stockId;
	}

	@Column(name = "moduleName", unique = false, nullable = true, length = 10)
	public String getStockCode() {
		return this.stockCode;
	}

	public void setStockCode(String stockCode) {
		this.stockCode = stockCode;
	}

	@Column(name = "moduleDesc", unique = false, nullable = true, length = 20)
	public String getStockName() {
		return this.stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
	
	@Column(name = "modCaption", unique = false, nullable = true, length = 20)
	public String getModCaption() {
		return modCaption;
	}

	public void setModCaption(String modCaption) {
		this.modCaption = modCaption;
	}
}
