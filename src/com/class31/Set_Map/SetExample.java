package com.class31.Set_Map;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
	public static void main(String[] args) {

		// creating an object of HashSet
		HashSet<String> brand = new HashSet<>();
		brand.add("Nike");
		brand.add("Adidas");
		brand.add("H&M");
		brand.add("Zara");
		brand.add("Uniqlo");
		brand.add("Adidas");
		brand.add("H&M");
		brand.add("Adidas");
		brand.add("H&M");
		brand.add("Adidas");
		brand.add("H&M");
		
		System.out.println(brand.size());
		System.out.println(brand);
		
		//how to verify if element is there
		boolean isItThere=brand.contains("Nike");
		System.out.println(isItThere);
		
		//how to access element from a Set collection?
		//brand.get is not available to objects of Set Type
		
		Iterator<String> iterator=brand.iterator();
		String obj=iterator.next();
		System.out.println(obj);
		
		obj=iterator.next();
		System.out.println(obj);
		
		System.out.println("------------------   Using while loop to get values from iterator object --");
		while(iterator.hasNext()) {
			obj=iterator.next();
			System.out.println(obj);
		}
		
		//if we need to iterate over entire collection again we need NEW ITERATOR OBJECT	
		Iterator<String> it=brand.iterator();
		System.out.println("------------------   Using while loop to get values from it object --");

		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("------------------   Using for each loop to get values from set collection --");
		//is there other way to get all elements from Set collection?
		for(String br:brand) {
			System.out.println(br);
		}
		
		System.out.println("------------------   Creating an object of LinkedHashSet --");

		LinkedHashSet<String> luxBrand=new LinkedHashSet<>();
		luxBrand.add("Gucci");
		luxBrand.add("LV");
		luxBrand.add("Prada");
		luxBrand.add("Chanel");
		luxBrand.add("Gucci");
		luxBrand.add("LV");

		System.out.println(luxBrand.size());
		System.out.println(luxBrand);
		
		System.out.println("------------------   Creating an object of TreeSet --");
		
		TreeSet<String> allBrands=new TreeSet<>(brand);
		allBrands.add("Calvin Clein");
		allBrands.addAll(luxBrand);
		
		System.out.println(allBrands);
		
		System.out.println("------------------   Retrieving elements from TreeSet --");
		Iterator<String> brandIterator=allBrands.iterator();
		while(brandIterator.hasNext()) {
			String br=brandIterator.next();
			System.out.println(br);
		}
		
		
		System.out.println("------------------   Creating an object of TreeSet to store Double--");
		
		Set<Double>tset=new TreeSet<>();
		tset.add(10.99);
		tset.add(1.99);
		tset.add(1000.99);
		tset.add(10.01);
		tset.add(110.99);
	
		System.out.println(tset);
	}
}
