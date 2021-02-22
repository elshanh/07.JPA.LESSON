package eh.project.l26.JPQL;

import java.util.List;

import eh.project.l01.entity.L26_Brand;
import eh.project.l01.entity.L26_Category;
import eh.project.l01.entity.L26_Product;
import eh.project.l01.entity.L26_ProductDetails;

public interface S04_Repostory {
	
	L26_Product 	saveProduct(L26_Product product);
	
	L26_Brand 		saveBrand(L26_Brand brand);
	
	L26_Category 	saveCategory(L26_Category category);
	
	List<L26_Product> findProducts();
	
	List<L26_Product> findProductsEntities(int firstResult,int maxResult);
	
	L26_Product findProductById(int productId);
	
	List<L26_ProductDetails> findProductDetails();
	
	L26_ProductDetails findProductDetailById(int productId);
	
	List<String> findProductNames();
	
	List<Object[]> findProductNameAndPrice();
	
	List<L26_Product> findGreatPrice(double unitPrice);
	
	List<L26_Product> findGreatAndLessPrice(double minUnitPrice,double maxUnitPrice);
	
	List<L26_Product> findBetweenPrice(double minUnitPrice,double maxUnitPrice);
	
	List<L26_Product> findLikeProductName(String productName);
	
	List<L26_Product> findInCategoryName(String categoryName1,String categoryName2);
	
	
	List<L26_Product> findAllProduct(int categoryId);
	
	List<Object[]> findFunctionPrice();
	
	List<Object[]> findGroupByCategory();
	
	List<Object[]> findGroupByHavingCategory(double unitPrice);
	
	List<L26_Product> findOrderByPrice();
}
