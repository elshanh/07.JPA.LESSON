package eh.project.l27.NamedQuery;

import java.util.Date;
import java.util.List;

import eh.project.l01.entity.L27_Brand;
import eh.project.l01.entity.L27_Category;
import eh.project.l01.entity.L27_Product;
import eh.project.l01.entity.L27_ProductDetails;

public interface S03_Repostory {
	
	L27_Product 	saveProduct(L27_Product product);
	
	L27_Brand 		saveBrand(L27_Brand brand);
	
	L27_Category 	saveCategory(L27_Category category);
	
	
	
	List<L27_Product> findProducts();
	
	List<L27_Product> findProductsEntities(int firstResult,int maxResult);
	
	L27_Product findProductById(int productId);
	
	List<L27_ProductDetails> findProductDetails();
	
	List<L27_Product> findProductByCategoryName(String categoryName);
	
	int findProductCount();
	
	List<L27_Product> findProductAddDateLater(Date addDate);
}
