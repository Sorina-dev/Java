package com.syntax.class30;

import java.util.ArrayList;
import java.util.Iterator;

public class StoringCountries {
public static void main(String[] args) {
		
	//	Country[] country= {new USA("USA"), new Afghanistan("Afghanistan"),new Kazakhstan("Kazakhstan")} ; 
		
		ArrayList<Country> countries=new ArrayList<>();
		countries.add(new USA("USA"));//0
		countries.add(new Afghanistan("Afghanistan"));//1
		countries.add(new Kazakhstan("Kazakhstan"));//2
		
		System.out.println(" --- Using regular for loop ---- ");
		for(int i=0; i<countries.size(); i++) {
			countries.get(i).election(); //getting the object can call the method too
		}
		
		System.out.println(" --- Using regular for loop ---- ");
		
		for(Country c:countries) {
			c.election();
		}
		
		System.out.println(" --- Using Iterator -------------------- ");
		Iterator<Country> it=countries.iterator();
		while(it.hasNext()) {
			it.next().election();
		}
		
		
	}
}
abstract class Country {

	public String name;
	
	public Country(String name) {
		this.name=name;
	}
	
	public abstract void election();
}

class USA extends Country {
	
	public USA(String name) {
		super(name);
	}
	
	public void election() {
		System.out.println(name+ " holds presedential election every 4 years");
	}
}

class Kazakhstan extends Country {
	
	public Kazakhstan(String name) {
		super(name);
	}
	
	public void election() {
		System.out.println(name +" holds election whenever they decide so");
	}
}

class Afghanistan extends Country {
	
	public Afghanistan(String name) {
		super(name);
	}
	
	public void election() {
		System.out.println(name +" holds election every 5 years");
	}
}