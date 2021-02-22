package eh.project.l26.JPQL;

import java.util.Date;
import java.util.List;

import eh.project.l01.entity.L26_Brand;
import eh.project.l01.entity.L26_Category;
import eh.project.l01.entity.L26_Product;
import eh.project.l01.entity.L26_ProductDetails;

public class S06_Main {
	
	private static S04_Repostory repostory = new S05_RepostoryImpl();
	
	public static void main(String[] args) {
		
		//JPQL (Java Persistence Query Language)
		
		//r01_insertData();
		//r02();
		//r03();
		//r04();
		//r05();
		//r06();
		//r07();
		//r08();
		//r09();
		//r10();
		//r11();
		//r12();
		//r13();
		//r14();
		//r15();
		//r16();
		r17();
		
		
	}
	
	public static void r01_insertData() {
		
		L26_Brand brand1 = new L26_Brand("Apple");
		L26_Brand brand2 = new L26_Brand("SAMSUNG");
		L26_Brand brand3 = new L26_Brand("MI");
		L26_Brand brand4 = new L26_Brand("LENOVO");
		L26_Brand brand5 = new L26_Brand("ACER");
		
		L26_Category category1 = new L26_Category("Laptop");
		L26_Category category2 = new L26_Category("Tab");
		L26_Category category3 = new L26_Category("Phone");
		
		L26_Product product1 = new L26_Product("IPhone 10",2500,2,brand1,category3, new Date());
		L26_Product product2 = new L26_Product("A 31",500,3,brand2,category3, new Date());
		L26_Product product3 = new L26_Product("S2",300,5,brand3,category3, new Date());
		
		L26_Product product4 = new L26_Product("P 10",800,2,brand4,category2, new Date());
		L26_Product product5 = new L26_Product("A 295",350,3,brand2,category2, new Date());
		L26_Product product6 = new L26_Product("I-PAD",1000,5,brand1,category2, new Date());
		
		L26_Product product7 = new L26_Product("Aspire",1700,3,brand5,category1, new Date());
		L26_Product product8 = new L26_Product("Mac",4500,3,brand1,category1, new Date());
		L26_Product product9 = new L26_Product("Think Pad",1000,5,brand4,category1, new Date());
		
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
		
		List<L26_Product> products = repostory.findProducts();
		for(L26_Product product : products) {
			System.out.println(product);
		}
		
	}
	public static void r03() {
		
		L26_Product product = repostory.findProductById(5);
		System.out.println(product);
		
	}
	public static void r04() {
		
		List<L26_ProductDetails> productDetails = repostory.findProductDetails();
		productDetails.forEach(System.out::println);
		
	}	
	public static void r05() {
		
		L26_ProductDetails productDetail = repostory.findProductDetailById(3);
		System.out.println(productDetail);
		
	}
	public static void r06() {
		
		List<String> productName = repostory.findProductNames();
		productName.forEach(System.out::println);
		
	}
	public static void r07() {
		
		List<Object[]> list = repostory.findProductNameAndPrice();
		for (Object[] object : list) {
			System.out.println(object[0] + " - " +object[1]);
		}
		
	}
	public static void r08() {
		
		List<L26_Product> products = repostory.findGreatPrice(2000);
		products.forEach(System.out::println);
		
	}
	public static void r09() {
		
		List<L26_Product> products = repostory.findGreatAndLessPrice(1000,3500);
		products.forEach(System.out::println);
		
	}	
	public static void r10() {
		
		List<L26_Product> products = repostory.findBetweenPrice(1000,3500);
		products.forEach(System.out::println);
		
	}	
	public static void r11() {
		
		List<L26_Product> products = repostory.findLikeProductName("P");
		products.forEach(System.out::println);
		
	}
	public static void r12() {
		
		List<L26_Product> products = repostory.findInCategoryName("Laptop","Tab");
		products.forEach(System.out::println);
		
	}
	public static void r13() {
		
		List<L26_Product> products = repostory.findAllProduct(2);
		products.forEach(System.out::println);
		
	}
	public static void r14() {
		
		List<Object[]> list = repostory.findFunctionPrice();
		Object[] objects = list.get(0);
		System.out.println("AVG: " +objects[0] + " - SUM: " +objects[1] + " - MAX: " +objects[2] + " - MIN: " +objects[3] + " - COUNT: " +objects[4]);
		
	}	
	public static void r15() {
		
		List<Object[]> list = repostory.findGroupByCategory();
		for (Object[] objects : list) {
			System.out.println("CATEGORY_NAME: " +objects[0] + " - AVG: " +objects[1]);
		}
		
	}	
	public static void r16() {
		
		List<Object[]> list = repostory.findGroupByHavingCategory(2000);
		for (Object[] objects : list) {
			System.out.println("CATEGORY_NAME: " +objects[0] + " - AVG: " +objects[1]);
		}
		
	}		
	public static void r17() {
		
		List<L26_Product> products = repostory.findOrderByPrice();
		products.forEach(System.out::println);
		
	}	
}
