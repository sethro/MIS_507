//Seth Pederson
//Homework 2

public class ShoppingCart {
	
	private Customer customer;
	private Product[] product;
	private double price;
	private int quantity;
	private int counter;

	
	public ShoppingCart(){	//Constructor
	}
	
	public ShoppingCart(Customer customer, Product[] product){//Constructor
		this.product = product;
		this.customer = customer;
	}
	
	public Customer getCustomer(){//Customer from Customer class
		return customer;
	}
	
	public Product[] getProducts(){//Get Product from Product class
		return product;
	}
	
	public double getPrices(){//Get Product price
		return price;
	}
	
	public void setCustomer(Customer customer){//Set Customer object
		this.customer = customer;
	}
	
	public void setProduct(Product[] product){//Set Product object
		this.product = product;
	}
	
	
	//public void addProduct(Product[] list, String name, int quantity){  **I couldn't get this method to work - it was supposed to add a product
	//	list = this.product;
	//	name = Product.getProductName();
	//	quantity = Product.getProductStock();
	//}
	
	
	public double getCartTotal(){//Calculates cart total
		double result = 0;
		double sum = 0;
		
		if (this.customer instanceof Customer){//If customer is element of Customer class, proceed
		for (int i = 0; i < product.length; i++){
			sum += product[i].getProductPrice();
			result = sum;
			}
		}
		else if (this.customer instanceof VIPCustomer){//if customer is element of VIPCustomer class, proceed
		double rate = VIPCustomer.getDiscountRate();//Get discount rate for VIP level from Customer class
		for (int i = 0; i < product.length; i++){
			sum += product[i].getProductPrice();
			result = sum * rate;//Multiply product sum by discount rate (80% by default)
		}
	}		return result;
}
}
