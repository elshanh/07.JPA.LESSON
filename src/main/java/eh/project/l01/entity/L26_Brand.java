package eh.project.l01.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "L26_BRAND")
public class L26_Brand implements Serializable {
	
	private static final long serialVersionUID = 1L; 
	
	@Id
	@Column(name = "ID",unique = true,length = 10,nullable = true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int brandId;
	
	@Column(name = "NAME")
	private String brandName;
	
	@OneToMany(mappedBy =  "productBrand")
	private List<L26_Product> products;

	public L26_Brand() {
		
	}

	public L26_Brand(String brandName) {
		this.brandName = brandName;
	}

	public int getBrandId() {
		return brandId;
	}

	public void setBrandId(int brandId) {
		this.brandId = brandId;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public List<L26_Product> getProducts() {
		return products;
	}

	public void setProducts(List<L26_Product> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "L26_Brand [brandId=" + brandId + ", brandName=" + brandName + "]";
	}

}
