//Seth Pederson
//Homework 2

public class ShoppingDriver {

	public static void main(String[] args) {
		
		Customer cust1 = new Customer ("James", "Kirk", "111 N. Avenue");
		System.out.print(cust1.toString());
		
		VIPCustomer vcust1 = new VIPCustomer ("Luke", "Skywalker", "111 S. Ave", "1");
		System.out.print(vcust1.toString());
		vcust1.setDiscountRate("2");
		System.out.print(vcust1.toString());
		
		Product prod1 = new Product ("Thingamjig", "Blue & Red", 10.00, 20);
		Product prod2 = new Product("Whatchamacallit", "Black & Blue", 2.50, 30);
		Product prod3 = new Product("Whosiewhatsit", "Bigger than breadbox", 5.00, 5);
		Product prod4 = new Product("WindDing", "Surprisingly Small", 15.00, 20);
		Product prod5 = new Product("Humdinger", "Really Good", 10.00, 50);
		System.out.print(prod1);
		System.out.print(prod2);
		System.out.print(prod3);
		System.out.print(prod4);
		System.out.print(prod5);
		
		PromotionalProduct promoprod1 = new PromotionalProduct("Enhanced Thingamajig", "Blue & Red & Green", 15.00, 20);
		PromotionalProduct promoprod2 = new PromotionalProduct("Bigger & Better", "Heavenly", 10.00, 20);
		PromotionalProduct promoprod3 = new PromotionalProduct("Top of the Line", "Solid Platinum", 12.00, 40);		
		PromotionalProduct promoprod4 = new PromotionalProduct("Sky is the Limit", "Solid Diamond", 16.00, 25);		
		PromotionalProduct promoprod5 = new PromotionalProduct("1st Class All the Way", "Solid Gold", 5.00, 10);
		
		promoprod1.setDiscountPrice(.80);
		promoprod2.setDiscountPrice(.80);
		promoprod3.setDiscountPrice(.80);
		promoprod4.setDiscountPrice(.80);
		promoprod5.setDiscountPrice(.80);
		
		Product[] list = {prod1, prod2, prod3, promoprod1};
		ShoppingCart cart1 = new ShoppingCart (cust1, list);
		System.out.println(cart1.getCartTotal());
		
		//System.out.print(promoprod1);
		
		//ShoppingCart.addProduct(cart1, "Humdinger", 1); I wrote a method to add item to cart, but can't get it to work
		
		//Question 3
		
		Customer q3Customer = new Customer("Michael", "Meyers", "0000 Halloween Drive");
		Product item1 = new Product("Latex Halloween Mask", " William Shatner Mask painted white", 20.00, 10);
		Product item2 = new Product("Coveralls", "Navy Blue, Size XL", 35.00, 15);
		Product item3 = new Product("Rope", "Hemp, 50'", 30.00, 5);
		Product item4 = new Product("Flashlight", "Aluminum, 18", 40.00, 5);
		Product item5 = new Product("Jack o' Lantern", "Orange, 50lbs", 50.00, 5);
		PromotionalProduct promoItem1 = new PromotionalProduct("Plastic Mask", "Adult Hockey Mask", 55.00, 25);
		PromotionalProduct promoItem2 = new PromotionalProduct("Machete", "Steel blade w/ wooden handle", 40.00, 10);
		PromotionalProduct promoItem3 = new PromotionalProduct("Candle", "large tapered candle", 5.00, 100);
		PromotionalProduct promoItem4 = new PromotionalProduct("Batteries", "1 pack D-Cell, 4 count", 5.00, 100);
		VIPCustomer q3VIPCustomer = new VIPCustomer("Jason", "Voorhees", "Summer Camp Avenue", "2");
		
		Product[] list1 = {item1, item2, item3, promoItem4};
		Product[] list2 = {promoItem2, promoItem3, item4, item5};
		ShoppingCart cart2 = new ShoppingCart(q3Customer, list2);

		System.out.println("\n" + "Customer Cart total = " + cart2.getCartTotal());
		
		ShoppingCart cart3 = new ShoppingCart(q3VIPCustomer, list2);
		q3VIPCustomer.setDiscountRate("2");
		System.out.print("\n" + "VIP Customer Cart total = " + cart3.getCartTotal());
	}

}
