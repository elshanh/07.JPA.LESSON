package eh.project.l26.JPQL;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import eh.project.l01.entity.L26_Brand;
import eh.project.l01.entity.L26_Category;
import eh.project.l01.entity.L26_Product;
import eh.project.l01.entity.L26_ProductDetails;

public class S05_RepostoryImpl implements S04_Repostory{
	
	private S02_Factory factory = new S03_FactoryImpl();
	
	private EntityManager entityManager = factory.getEntityManager();
	
	private EntityTransaction entityTransaction = factory.getTransaction();

	@Override
	public L26_Product saveProduct(L26_Product product) {
		
		this.entityTransaction.begin();
		
		this.entityManager.persist(product);
		
		this.entityTransaction.commit();
		
		return product;
	}

	@Override
	public L26_Brand saveBrand(L26_Brand brand) {
		
		this.entityTransaction.begin();
		
		this.entityManager.persist(brand);
		
		this.entityTransaction.commit();
		
		return brand;
	}

	@Override
	public L26_Category saveCategory(L26_Category category) {
		
		this.entityTransaction.begin();
		
		this.entityManager.persist(category);
		
		this.entityTransaction.commit();
		
		return category;
	}

	@Override
	public List<L26_Product> findProducts() {
		
		TypedQuery<L26_Product> typedQuery = this.entityManager.createQuery(S01_Queries.findProducts,L26_Product.class);
		List<L26_Product> products = typedQuery.getResultList();
		
		return products;
	}

	@Override
	public List<L26_Product> findProductsEntities(int firstResult, int maxResult) {
		
		TypedQuery<L26_Product> typedQuery = this.entityManager.createQuery(S01_Queries.findProducts,L26_Product.class);
		typedQuery.setFirstResult(firstResult);
		typedQuery.setMaxResults(maxResult);
		
		List<L26_Product> products = typedQuery.getResultList();
		
		return products;
	}

	@Override
	public L26_Product findProductById(int productId) {

		TypedQuery<L26_Product> typedQuery = this.entityManager.createQuery(S01_Queries.findProductById,L26_Product.class);
		typedQuery.setParameter("productId", productId);
		L26_Product products = typedQuery.getSingleResult();
		
		return products;
	}

	@Override
	public List<L26_ProductDetails> findProductDetails() {
		
		TypedQuery<L26_ProductDetails> typedQuery = this.entityManager.createQuery(S01_Queries.findProductDetails,L26_ProductDetails.class);
		List<L26_ProductDetails> productDetails = typedQuery.getResultList();
		
		return productDetails;
	}

	@Override
	public L26_ProductDetails findProductDetailById(int productId) {
		
		TypedQuery<L26_ProductDetails> typedQuery = this.entityManager.createQuery(S01_Queries.findProductDetailById,L26_ProductDetails.class);
		typedQuery.setParameter("productId", productId);
		L26_ProductDetails productDetails = typedQuery.getSingleResult();
		
		return productDetails;
	}

	@Override
	public List<String> findProductNames() {
		
		TypedQuery<String> typedQuery = this.entityManager.createQuery(S01_Queries.findProductName,String.class);
		List<String> productName = typedQuery.getResultList();
		
		return productName;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Object[]> findProductNameAndPrice() {
		
		Query query = this.entityManager.createQuery(S01_Queries.findProductNamePrice);
		
		List<Object[]> productNameAndPrice = query.getResultList();
		
		return productNameAndPrice;
	}

	@Override
	public List<L26_Product> findGreatPrice(double unitPrice) {
		
		TypedQuery<L26_Product> typedQuery = this.entityManager.createQuery(S01_Queries.findGreatPrice,L26_Product.class);
		typedQuery.setParameter("productUnitPrice", unitPrice);
		List<L26_Product> products = typedQuery.getResultList();
		
		return products;
	}

	@Override
	public List<L26_Product> findGreatAndLessPrice(double minUnitPrice, double maxUnitPrice) {
		
		TypedQuery<L26_Product> typedQuery = this.entityManager.createQuery(S01_Queries.findGreatLessPrice,L26_Product.class);
		typedQuery.setParameter("minUnitPrice", minUnitPrice);
		typedQuery.setParameter("maxUnitPrice", maxUnitPrice);
		List<L26_Product> products = typedQuery.getResultList();
		
		return products;
	}

	@Override
	public List<L26_Product> findBetweenPrice(double minUnitPrice, double maxUnitPrice) {
		
		TypedQuery<L26_Product> typedQuery = this.entityManager.createQuery(S01_Queries.findBetweenPrice,L26_Product.class);
		typedQuery.setParameter("minUnitPrice", minUnitPrice);
		typedQuery.setParameter("maxUnitPrice", maxUnitPrice);
		List<L26_Product> products = typedQuery.getResultList();
		
		return products;
	}

	@Override
	public List<L26_Product> findLikeProductName(String productName) {
		
		TypedQuery<L26_Product> typedQuery = this.entityManager.createQuery(S01_Queries.findLikeProductName,L26_Product.class);
		typedQuery.setParameter("productName", "%"+ productName +"%");
		List<L26_Product> products = typedQuery.getResultList();
		
		return products;
	}

	@Override
	public List<L26_Product> findInCategoryName(String categoryName1, String categoryName2) {

		TypedQuery<L26_Product> typedQuery = this.entityManager.createQuery(S01_Queries.findInCategoryName,L26_Product.class);
		typedQuery.setParameter("categoryName1", categoryName1);
		typedQuery.setParameter("categoryName2", categoryName2);
		List<L26_Product> products = typedQuery.getResultList();
		
		return products;
	}

	@Override
	public List<L26_Product> findAllProduct(int categoryId) {

		TypedQuery<L26_Product> typedQuery = this.entityManager.createQuery(S01_Queries.findAllProduct,L26_Product.class);
		typedQuery.setParameter("categoryId", categoryId);
		List<L26_Product> products = typedQuery.getResultList();
		
		return products;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Object[]> findFunctionPrice() {

		Query query = this.entityManager.createQuery(S01_Queries.findFunctionsPrice);
		List<Object[]> functionPrice = query.getResultList();
		
		return functionPrice;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Object[]> findGroupByCategory() {
		
		Query query = this.entityManager.createQuery(S01_Queries.findGroupByCategory);
		List<Object[]> groupByCategory = query.getResultList();
		
		return groupByCategory;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Object[]> findGroupByHavingCategory(double unitPrice) {
		
		Query query = this.entityManager.createQuery(S01_Queries.findGroupByHavingCategory);
		query.setParameter("productUnitPrice", unitPrice);
		List<Object[]> groupByHavingCategory = query.getResultList();
		
		return groupByHavingCategory;
	}

	@Override
	public List<L26_Product> findOrderByPrice() {
		
		TypedQuery<L26_Product> typedQuery = this.entityManager.createQuery(S01_Queries.findOrderByPrice,L26_Product.class);
		List<L26_Product> products = typedQuery.getResultList();
		
		return products;
	}
	
	

}
