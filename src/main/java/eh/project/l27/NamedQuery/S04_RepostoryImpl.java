package eh.project.l27.NamedQuery;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TemporalType;
import javax.persistence.TypedQuery;

import eh.project.l01.entity.L27_Brand;
import eh.project.l01.entity.L27_Category;
import eh.project.l01.entity.L27_Product;
import eh.project.l01.entity.L27_ProductDetails;

public class S04_RepostoryImpl implements S03_Repostory{
	
	private S01_Factory factory = new S02_FactoryImpl();
	
	private EntityManager entityManager = factory.getEntityManager();
	
	private EntityTransaction entityTransaction = factory.getTransaction();

	@Override
	public L27_Product saveProduct(L27_Product product) {
		
		this.entityTransaction.begin();
		
		this.entityManager.persist(product);
		
		this.entityTransaction.commit();		

		return product;
	}

	@Override
	public L27_Brand saveBrand(L27_Brand brand) {

		this.entityTransaction.begin();
		
		this.entityManager.persist(brand);
		
		this.entityTransaction.commit();		
		
		return brand;
	}

	@Override
	public L27_Category saveCategory(L27_Category category) {

		this.entityTransaction.begin();
		
		this.entityManager.persist(category);
		
		this.entityTransaction.commit();	

		return category;
	}

	@Override
	public List<L27_Product> findProducts() {
		
		TypedQuery<L27_Product> typedQuery = this.entityManager.createNamedQuery("Product.findProducts", L27_Product.class);
		List<L27_Product> products = typedQuery.getResultList();
		
		return products;
	}

	@Override
	public List<L27_Product> findProductsEntities(int firstResult, int maxResult) {
		
		TypedQuery<L27_Product> typedQuery = this.entityManager.createNamedQuery("Product.findProducts", L27_Product.class);
		typedQuery.setFirstResult(firstResult);
		typedQuery.setMaxResults(maxResult);
		List<L27_Product> products = typedQuery.getResultList();		

		return products;
	}

	@Override
	public L27_Product findProductById(int productId) {

		TypedQuery<L27_Product> typedQuery = this.entityManager.createNamedQuery("Product.findProductById", L27_Product.class);
		typedQuery.setParameter("productId", productId);
		L27_Product product = typedQuery.getSingleResult();
		
		return product;
	}

	@Override
	public List<L27_ProductDetails> findProductDetails() {
		
		TypedQuery<L27_ProductDetails> typedQuery = this.entityManager.createNamedQuery("Product.findProductDetails", L27_ProductDetails.class);
		List<L27_ProductDetails> productDetails = typedQuery.getResultList();
		
		return productDetails;
	}

	@Override
	public List<L27_Product> findProductByCategoryName(String categoryName) {
		
		TypedQuery<L27_Product> typedQuery = this.entityManager.createNamedQuery("Product.findProductByCategoryName", L27_Product.class);
		typedQuery.setParameter("name", categoryName);
		List<L27_Product> products = typedQuery.getResultList();
		
		return products;
	}

	@Override
	public int findProductCount() {
		
		TypedQuery<Integer> typedQuery = this.entityManager.createNamedQuery("Product.findProductCount", Integer.class);
		Integer count = typedQuery.getSingleResult();
		
		return count.intValue();
	}

	@Override
	public List<L27_Product> findProductAddDateLater(Date addDate) {
		
		TypedQuery<L27_Product> typedQuery = this.entityManager.createNamedQuery("Product.findProductAddDateLater", L27_Product.class);
		typedQuery.setParameter("Product.findProductAddDateLater", addDate, TemporalType.TIMESTAMP);
		List<L27_Product> products = typedQuery.getResultList();
		
		return products;
	}



}
