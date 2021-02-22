package eh.project.l01.entity;

public class L26_ProductDetails {
		
	private String productName;
	
	private double productUnitPrice;
	
	private int productAvaible;
	
	private String brandName;
	
	private String categoryName;
	
	public L26_ProductDetails() {

	}

	public L26_ProductDetails(String productName, double productUnitPrice, int productAvaible, String brandName, String categoryName) {
		this.productName = productName;
		this.productUnitPrice = productUnitPrice;
		this.productAvaible = productAvaible;
		this.brandName = brandName;
		this.categoryName = categoryName;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductUnitPrice() {
		return productUnitPrice;
	}

	public void setProductUnitPrice(double productUnitPrice) {
		this.productUnitPrice = productUnitPrice;
	}

	public int getProductAvaible() {
		return productAvaible;
	}

	public void setProductAvaible(int productAvaible) {
		this.productAvaible = productAvaible;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	@Override
	public String toString() {
		return "L26_ProductDetails [productName=" + productName + ", productUnitPrice=" + productUnitPrice
				+ ", productAvaible=" + productAvaible + ", brandName=" + brandName + ", categoryName=" + categoryName
				+ "]";
	}
	
}
