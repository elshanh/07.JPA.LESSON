package eh.project.l01.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "L27_BRAND")
@NamedQuery(name = "Brand.findBrandsById",query = "SELECT b FROM L27_Brand b WHERE b.brandId = :brandId")
public class L27_Brand implements Serializable {
	
	private static final long serialVersionUID = 1L; 
	
	@Id
	@Column(name = "ID",unique = true,length = 10,nullable = true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int brandId;
	
	@Column(name = "NAME")
	private String brandName;
	
	@OneToMany(mappedBy =  "productBrand")
	private List<L27_Product> products;

	public L27_Brand() {
		
	}

	public L27_Brand(String brandName) {
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

	public List<L27_Product> getProducts() {
		return products;
	}

	public void setProducts(List<L27_Product> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "L27_Brand [brandId=" + brandId + ", brandName=" + brandName + "]";
	}

}
