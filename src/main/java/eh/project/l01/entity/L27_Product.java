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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "L27_PRODUCT")
@NamedQueries({
	@NamedQuery(name = "Product.findProducts",query = "SELECT p FROM L27_Product p"),
	@NamedQuery(name = "Product.findProductById",query = "SELECT p FROM L27_Product p WHERE p.productId = :productId"),
	@NamedQuery(name = "Product.findProductByCategoryName",query = "SELECT p FROM L27_Product p WHERE p.productCategory.name = :name"),
	@NamedQuery(name = "Product.findProductCount",query = "SELECT count(p) FROM L27_Product p"),
	@NamedQuery(name = "Product.findProductAddDateLater",query = "SELECT p FROM L27_Product p WHERE p.productAddDate > :addDate"),
	@NamedQuery(name = "Product.findProductDetails",query = "SELECT new eh.project.l01.entity.L27_ProductDetails(p.productName,p.productUnitPrice,p.productAvaible,p.productBrand.brandName,p.productCategory.categoryName) FROM L27_Product p")
})	
public class L27_Product implements Serializable {
	
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
	private L27_Brand productBrand;

	@ManyToOne
	@JoinColumn(name = "CATEGORY_ID")
	private L27_Category productCategory;
	
	@Column(name = "ADD_DATE")
	@Temporal(TemporalType.TIMESTAMP)
	private Date productAddDate;
	
	@Column(name = "UPDATE_DATE")
	@Temporal(TemporalType.TIMESTAMP)
	private Date productUpdateDate;	
	
	public L27_Product() {
		
	}

	public L27_Product(String productName, double productUnitPrice, int productAvaible, L27_Brand productBrand,L27_Category productCategory, Date productAddDate) {
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

	public L27_Brand getProductBrand() {
		return productBrand;
	}

	public void setProductBrand(L27_Brand productBrand) {
		this.productBrand = productBrand;
	}

	public L27_Category getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(L27_Category productCategory) {
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
		return "L27_Product [productId=" + productId + ", productName=" + productName + ", productUnitPrice="
				+ productUnitPrice + ", productAvaible=" + productAvaible + ", productBrand=" + productBrand
				+ ", productCategory=" + productCategory + ", productAddDate=" + productAddDate + ", productUpdateDate="
				+ productUpdateDate + "]";
	}
	
}
