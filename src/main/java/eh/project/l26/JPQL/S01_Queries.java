package eh.project.l26.JPQL;

public class S01_Queries {
	
	public static final String findProducts 								= "SELECT p FROM L26_Product p";
	public static final String findProductById 							= "SELECT p FROM L26_Product p WHERE p.productId = :productId";
	public static final String findProductDetails 						= "SELECT new eh.project.l01.entity.L26_ProductDetails(p.productName,p.productUnitPrice,p.productAvaible,b.brandName,c.categoryName) FROM L26_Product p LEFT JOIN p.productBrand b LEFT JOIN p.productCategory c";
	public static final String findProductDetailById				= "SELECT new eh.project.l01.entity.L26_ProductDetails(p.productName,p.productUnitPrice,p.productAvaible,b.brandName,c.categoryName) FROM L26_Product p LEFT JOIN p.productBrand b LEFT JOIN p.productCategory c WHERE p.productId = :productId";
	public static final String findProductName 						= "SELECT p.productName FROM L26_Product p";
	public static final String findProductNamePrice 				= "SELECT p.productName,p.productUnitPrice FROM L26_Product p";
	public static final String findGreatPrice 							= "SELECT p FROM L26_Product p WHERE p.productUnitPrice > :productUnitPrice";
	public static final String findGreatLessPrice 						= "SELECT p FROM L26_Product p WHERE p.productUnitPrice > :minUnitPrice AND p.productUnitPrice < :maxUnitPrice";
	public static final String findBetweenPrice 						= "SELECT p FROM L26_Product p WHERE p.productUnitPrice BETWEEN :minUnitPrice AND :maxUnitPrice";
	public static final String findLikeProductName 					= "SELECT p FROM L26_Product p WHERE p.productName LIKE :productName";
	public static final String findInCategoryName 					= "SELECT p FROM L26_Product p LEFT JOIN p.productCategory c WHERE c.categoryName IN (:categoryName1,:categoryName2)";
	public static final String findAllProduct 							= "SELECT p FROM L26_Product p WHERE p.productUnitPrice > ALL(SELECT p2.productUnitPrice FROM L26_Product p2 WHERE p2.productCategory.categoryId = :categoryId)";
	public static final String findFunctionsPrice 						= "SELECT AVG(p.productUnitPrice),SUM(p.productUnitPrice),MAX(p.productUnitPrice),MIN(p.productUnitPrice),COUNT(p) FROM L26_Product p";
	public static final String findGroupByCategory					= "SELECT p.productCategory.categoryName,AVG(p.productUnitPrice) FROM L26_Product p GROUP BY p.productCategory.categoryName";
	public static final String findGroupByHavingCategory 	= "SELECT p.productCategory.categoryName,AVG(p.productUnitPrice) FROM L26_Product p GROUP BY p.productCategory.categoryName HAVING AVG(p.productUnitPrice) > :productUnitPrice";
	public static final String findOrderByPrice 						= "SELECT p FROM L26_Product p ORDER BY p.productUnitPrice DESC";

}
