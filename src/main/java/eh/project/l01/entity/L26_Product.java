package eh.project.l01.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "L26_PRODUCT")
public class L26_Product implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "ID",unique = true,length = 10,nullable = true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int productId;
	
	@Column(name = "NAME")
	private String productName;
	
	@Column(name = "UNIT_PRICE")
	private double productUnitPrice;
	
	@Column(name = "AVAIBLE")
	private int productAvaible;
	
	@ManyToOne
	@JoinColumn(name = "BRAND_ID")
	private L26_Brand productBrand;

	@ManyToOne
	@JoinColumn(name = "CATEGORY_ID")
	private L26_Category productCategory;
	
	@Column(name = "ADD_DATE")
	@Temporal(TemporalType.TIMESTAMP)
	private Date productAddDate;
	
	@Column(name = "UPDATE_DATE")
	@Temporal(TemporalType.TIMESTAMP)
	private Date productUpdateDate;	
	
	public L26_Product() {
		
	}

	public L26_Product(String productName, double productUnitPrice, int productAvaible, L26_Brand productBrand,L26_Category productCategory, Date productAddDate) {
		this.productName = productName;
		this.productUnitPrice = productUnitPrice;
		this.productAvaible = productAvaible;
		this.productBrand = productBrand;
		this.productCategory = productCategory;
		this.productAddDate = productAddDate;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductUnitPrice() {
		return productUnitPrice;
	}

	public void setProductUnitPrice(double productUnitPrice) {
		this.productUnitPrice = productUnitPrice;
	}

	public int getProductAvaible() {
		return productAvaible;
	}

	public void setProductAvaible(int productAvaible) {
		this.productAvaible = productAvaible;
	}

	public L26_Brand getProductBrand() {
		return productBrand;
	}

	public void setProductBrand(L26_Brand productBrand) {
		this.productBrand = productBrand;
	}

	public L26_Category getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(L26_Category productCategory) {
		this.productCategory = productCategory;
	}

	public Date getProductAddDate() {
		return productAddDate;
	}

	public void setProductAddDate(Date productAddDate) {
		this.productAddDate = productAddDate;
	}

	public Date getProductUpdateDate() {
		return productUpdateDate;
	}

	public void setProductUpdateDate(Date productUpdateDate) {
		this.productUpdateDate = productUpdateDate;
	}

	@Override
	public String toString() {
		return "L26_Product [productId=" + productId + ", productName=" + productName + ", productUnitPrice="
				+ productUnitPrice + ", productAvaible=" + productAvaible + ", productBrand=" + productBrand
				+ ", productCategory=" + productCategory + ", productAddDate=" + productAddDate + ", productUpdateDate="
				+ productUpdateDate + "]";
	}
	
}
