package com.syntax.class25;

public class StoreTest {
public static void main(String[] args) {
	
	Store macys = new Macys("Macys", "Tysons, Virginia");
	Store starbucks = new Starbucks("Starbucks", "New York");
	Store nike = new Nike("Nike", "Los Angeles", "running");

	Store[] stores = { new Macys("Macys", "Florida"), new Starbucks("Starbucks", "Texas"),new Nike("Nike", "Illinois", "walking") };
	int size=stores.length;
	System.out.println(size);
	
	for(Store s:stores) {
		s.openHours();
		s.sell();
		System.out.println(" ----------  ");
	}
	
	System.out.println("---- LOOPING MY STORES ARRAY ------- ");
	Store[] myStores= {macys,starbucks, nike };
	
	for(int i=0; i<myStores.length; i++) {
		myStores[i].openHours();
		System.out.println(" ---------  ");
	}
	
}
}
class Store {

	String name, location;
	
	public Store(String name, String location) {
		this.name=name;
		this.location=location;
	}
	
	public void openHours() {
		System.out.println(name+" is open regular hours from 8 AM - 8 PM in "+location);
	}
	
	public void sell() {
		System.out.println("ALL Stores sale items");
	}
}

class Macys extends Store {
	
	public Macys(String name, String location) {
		super(name, location);
	}
	
	public void openHours() {
		System.out.println(name +" is open from 8 AM - 12 AM in "+location);
	}
}

class Starbucks extends Store {
	
	public Starbucks(String name, String location) {
		super(name, location);
	}
	
	public void openHours() {
		System.out.println(name+" is open everyday from 6 AM till 8PM in "+location);
	}
	
	public void sellDrinks() {
		System.out.println(name +" sells different type of drinks");
	}
}

class Nike extends Store{
	
	String shoes;
	
	public Nike(String name, String location, String shoes) {
		super(name, location);
		this.shoes=shoes;
	}
}
