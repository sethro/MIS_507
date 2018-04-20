//Seth Pederson
//Homework 2

public class PromotionalProduct extends Product {
	
	private static double discountRate; //a promotional product at 20% off will total 80% of its original price
	private static double discountPrice;
	/*discountRate is implemented with the assumption that the same rate is applied to all promotional products
	  unless specified (set)*/
	
	
	public PromotionalProduct (String productName, String productDescription, double productPrice, int stockQuantity){//Constructor
		super(productName, productDescription, productPrice, stockQuantity);
		discountRate = .8;
		
	}
	
	public PromotionalProduct (String productName, double productPrice, String productId, int stockQuantity){//Constructor
		super(productName, productPrice, productId, stockQuantity);
		discountRate = .8;
	}
	
	public PromotionalProduct (double productPrice, String productName, int stockQuantity){//Constructor
		super(productPrice, productName, stockQuantity);
		discountRate = .8;
	}
	
	
	public void setDiscountPrice(double discount){//Calculates promotional product discount price
		double price = getProductPrice();
		discountRate = discount;
		discountPrice = price * discount;
	}
	
	public static double getDiscountPrice(){//Accessor
		return discountPrice;
	}
	
	public void setDiscountRate(double dRate){//sets Discount Rate - rate is set to 80% at the class level unless modified
		discountRate = dRate;
	}	
	
	public static double getDiscountRate(){//Accessor
		return discountRate;
	}
	
	public String toString(){
		String customerString = super.toString();
		return customerString += "\n" + "Discount Rate:" + getDiscountRate() + "." + "\n" +
								 "This product has a promotional price of " + getDiscountPrice() + ".";
	}

}
