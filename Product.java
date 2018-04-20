//Seth Pederson
//Homework 2

public class Product {
	private static String productName;
	private String productId;
	private String productDescription;
	private static int stockQuantity = 0;
	private double productPrice;
	
	public Product (String name, String desc, double price, int qty){//Constructor
		this.productName = name;
		this.productDescription = desc;
		this.productPrice = price;
		this.stockQuantity = qty;
	}
	
	public Product (String name, double price, String id, int qty){//Constructor
		this.productId = id;
		this.productName = name;
		this.productPrice = price;
		this.stockQuantity = qty;
	}
	
	public Product (double price, String name, int qty){//Constructor
		this.productName = name;
		this.productPrice = price;
		this.stockQuantity = qty;
	}
	
	public void setProductName(String prodName){//Sets Product Name
		productName = prodName;
	}
	
	public static String getProductName(){//Accessor
		return productName;
	}
	
	public void setProductDescription(String desc){//Product Description
		productDescription = desc;
	}
	
	public String getProductDescription(){//Accessor
		return productDescription;
	}
	
	public void setProductPrice(double price){//Sets Product Price
		productPrice = price;
	}
	
	public double getProductPrice(){//Accessor
		return productPrice;
	}
	
	public void setProductStock(int qty){//Sets Product quantity in Stock
		stockQuantity = qty;
	}
	
	public static int getProductStock(){//Accessor
		return stockQuantity;
	}
	
	public String toString(){
		return "\n" + "Product: " + productName + "\n"
				+ "Description: " + productDescription + "\n"
				+ "Cost: " + productPrice + "\n"
				+ "Quantity in Stock: " + stockQuantity + "\n";
	}
}
	