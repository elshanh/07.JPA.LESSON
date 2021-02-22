package eh.project.l27.NamedQuery;

import java.util.Date;
import java.util.List;

import eh.project.l01.entity.L27_Brand;
import eh.project.l01.entity.L27_Category;
import eh.project.l01.entity.L27_Product;
import eh.project.l01.entity.L27_ProductDetails;

public class S05_Main {
	
	private static S03_Repostory repostory = new S04_RepostoryImpl();
	
	public static void main(String[] args) {
		
		//JPQL (Java Persistence Query Language)
		
		//r01_insertData();
		//r02();
		//r03();
		r04();
		
		
	}
	
	public static void r01_insertData() {
		
		L27_Brand brand1 = new L27_Brand("Apple");
		L27_Brand brand2 = new L27_Brand("SAMSUNG");
		L27_Brand brand3 = new L27_Brand("MI");
		L27_Brand brand4 = new L27_Brand("LENOVO");
		L27_Brand brand5 = new L27_Brand("ACER");
		
		L27_Category category1 = new L27_Category("Laptop");
		L27_Category category2 = new L27_Category("Tab");
		L27_Category category3 = new L27_Category("Phone");
		
		L27_Product product1 = new L27_Product("IPhone 10",2500,2,brand1,category3, new Date());
		L27_Product product2 = new L27_Product("A 31",500,3,brand2,category3, new Date());
		L27_Product product3 = new L27_Product("S2",300,5,brand3,category3, new Date());
		
		L27_Product product4 = new L27_Product("P 10",800,2,brand4,category2, new Date());
		L27_Product product5 = new L27_Product("A 295",350,3,brand2,category2, new Date());
		L27_Product product6 = new L27_Product("I-PAD",1000,5,brand1,category2, new Date());
	
		L27_Product product7 = new L27_Product("Aspire",1700,3,brand5,category1, new Date());
		L27_Product product8 = new L27_Product("Mac",4500,3,brand1,category1, new Date());
		L27_Product product9 = new L27_Product("Think Pad",1000,5,brand4,category1, new Date());
		
		repostory.saveBrand(brand1);
		repostory.saveBrand(brand2);
		repostory.saveBrand(brand3);
		repostory.saveBrand(brand4);
		repostory.saveBrand(brand5);
		
		repostory.saveCategory(category1);
		repostory.saveCategory(category2);
		repostory.saveCategory(category3);
		
		repostory.saveProduct(product1);
		repostory.saveProduct(product2);
		repostory.saveProduct(product3);
		repostory.saveProduct(product4);
		repostory.saveProduct(product5);
		repostory.saveProduct(product6);
		repostory.saveProduct(product7);
		repostory.saveProduct(product8);
		repostory.saveProduct(product9);
	}
	public static void r02() {
		
		List<L27_Product> products = repostory.findProducts();
		for(L27_Product product : products) {
			System.out.println(product);
		}
		
	}
	public static void r03() {
		
		L27_Product product = repostory.findProductById(5);
		System.out.println(product);
		
	}
	public static void r04() {
		
		List<L27_ProductDetails> productDetails = repostory.findProductDetails();
		productDetails.forEach(System.out::println);
		
	}	

}
