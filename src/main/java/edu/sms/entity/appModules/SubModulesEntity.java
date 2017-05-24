package edu.sms.entity.appModules;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;




@Entity
@Table(name = "gyaan_submodule")
public class SubModulesEntity implements java.io.Serializable {

	private Integer subStockId;
	private ModulesEntity   stock;
	private String  stockCode;
	private String  stockName;
	private String  subModCaption;
	private String  linkUrl;
	private List<PermissionEntity> perStock = new ArrayList<PermissionEntity>(0);
	
	@Column(name = "linkUrl", unique = true, nullable = false, length = 10)
	public String getLinkUrl() {
		return linkUrl;
	}

	public void setLinkUrl(String linkUrl) {
		this.linkUrl = linkUrl;
	}

	public SubModulesEntity() {
	}

	public SubModulesEntity(String stockCode, String stockName,ModulesEntity stock) {
		this.stockCode = stockCode;
		this.stockName = stockName;
		this.stock = stock;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "subModuleId", unique = true, nullable = false)
	public Integer getSubStockId() {
		return subStockId;
	}

	public void setSubStockId(Integer subStockId) {
		this.subStockId = subStockId;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "module_Id", nullable = false)
	public ModulesEntity getStock() {
		return stock;
	}

	

	public void setStock(ModulesEntity stock) {
		this.stock = stock;
	}

	@Column(name = "subModName", unique = true, nullable = false, length = 10)
	public String getStockCode() {
		return this.stockCode;
	}

	public void setStockCode(String stockCode) {
		this.stockCode = stockCode;
	}

	@Column(name = "subModCode", unique = true, nullable = false, length = 20)
	public String getStockName() {
		return this.stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(targetEntity=PermissionEntity.class, cascade=CascadeType.ALL)
	@JoinColumn(name = "submodule_Id", referencedColumnName="subModuleId")
	public List<PermissionEntity> getPerStock() {
		return perStock;
	}

	public void setPerStock(List<PermissionEntity> perStock) {
		this.perStock = perStock;
	}

	@Column(name = "subModCaption", unique = true, nullable = false, length = 20)
	public String getSubModCaption() {
		return subModCaption;
	}

	public void setSubModCaption(String subModCaption) {
		this.subModCaption = subModCaption;
	}
	
}
