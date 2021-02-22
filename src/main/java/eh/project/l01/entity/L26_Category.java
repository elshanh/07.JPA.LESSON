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
@Table(name = "L26_CATEGORY")
public class L26_Category implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "ID",unique = true,length = 10,nullable = true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int categoryId;
	
	@Column(name = "NAME")
	private String categoryName;
	
	@OneToMany(mappedBy = "productCategory")
	private List<L26_Product> products;

	public L26_Category() {
		
	}

	public L26_Category(String categoryName) {
		super();
		this.categoryName = categoryName;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public List<L26_Product> getProducts() {
		return products;
	}

	public void setProducts(List<L26_Product> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "L26_Category [categoryId=" + categoryId + ", categoryName=" + categoryName + "]";
	}
	
	

	
}
