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
@Table(name = "L27_CATEGORY")
@NamedQueries({
	@NamedQuery(name = "Category.findCategories",query = "SELECT c FROM L27_Category c")
})	
public class L27_Category implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "ID",unique = true,length = 10,nullable = true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int categoryId;
	
	@Column(name = "NAME")
	private String categoryName;
	
	@OneToMany(mappedBy = "productCategory")
	private List<L27_Product> products;

	public L27_Category() {
		
	}

	public L27_Category(String categoryName) {
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

	public List<L27_Product> getProducts() {
		return products;
	}

	public void setProducts(List<L27_Product> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "L27_Category [categoryId=" + categoryId + ", categoryName=" + categoryName + "]";
	}
	
	

	
}
