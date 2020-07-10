package com.syntax.class19;

public class AppleStore {
public static void main(String[] args) {
	//related to Iphone
		
		//IPhone.touchScreen=false;
		
		IPhone phone1=new IPhone();
		phone1.model="11 Pro";
		phone1.memory=256;
		phone1.color="Blue";
		phone1.price=1000;
		phone1.displayDetails();
		//phone1.displayInfo();--> possible but not prefferable way
		IPhone.displayInfo();//calling static method
		
		IPhone.touchScreen=false;//accessing static variable
		
		System.out.println("---- 2 iPhone object ------");
		IPhone phone2=new IPhone();
		phone2.model="11";
		phone2.memory=64;
		phone2.color="Pink";
		phone2.price=900;
		phone2.displayDetails();
		IPhone.displayInfo();
		
		System.out.println("-------  Calling info method again -------");
		phone1.displayInfo();
		

	}
	
}
