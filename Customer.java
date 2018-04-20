//Seth Pederson
//Homework 2

import java.util.*;

public class Customer { //basic Customer information
	//Class variables
	private int idNumber, telephone;
	private String firstName, lastName; 
	private String address = "<Not Provided>";
	private Date registrationDate;
	//Date today = Calendar.getInstance().getTime(); I couldn't get this to populate correctly
	
	public Customer(){
		
	}
	
	public Customer (String fName, String lName){//Constructor
		this.firstName = fName;
		this.lastName = lName;
	}
	
	public Customer(int id, String fName, String lName, String addr, int tele){//Constructor
		this.firstName = fName;
		this.lastName = lName;
		this.address = addr;
		this.telephone = tele;
		//this.registrationDate = today;
	}
	
	public Customer (String fName, String lName, String addr){//Constructor
		this.firstName = fName;
		this.lastName = lName;
		this.address = addr;
	}
	
	public Customer (String fName, String lName, String addr, int num){//Constructor
		this.firstName = fName;
		this.lastName = lName;
		this.address = addr;
		this.telephone = num;
	}
	
	public Customer (String fName, String lName, int num){//Constructor
		this.firstName = fName;
		this.lastName = lName;
		this.telephone = num;
	}
	
	public void setId(int idNum){//Sets Customer ID Number
		idNumber = idNum;
	}
	
	public int getId(){//Accessor
		return idNumber;
	}
	
	public void setName(String fName, String lName){//Sets First Name, Last Name
		this.firstName = fName;
		this.lastName = lName;		
	}
	
	public String getName(){//Accessor, Concantenates First + Last name
		return firstName + " " + lastName;
	}
	
	public void setTelephone(int tel){//Sets Phone Number
		telephone = tel;
	}
	
	public int getTelephone(){//Phone Accessor
		return telephone;
	}
	
	public void setAddress(String addr){//Set Address; No mandatory fields
		address = addr;
	}
	
	public String getAddress(){//Accessor
		return address;
	}
	
	public void setRegistrationDate(Date regDate){//Set Registration date. I attempted to get this to populate programmatically, but couldn't get it to work
		registrationDate = regDate;
	}
	
	public Date getRegistrationDate(){
		return registrationDate;
	}
	
	public String toString(){
		return "\n" + "Customer Name: " + firstName + " " + lastName + "\n" +
				"Address: " + this.address + "\n"+
				"Registration Date: " + this.registrationDate + "\n";
	}

}