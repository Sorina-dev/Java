package com.syntax.class31;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class CollectionViewsOfMap {
public static void main(String[] args) {
		
		Map<String, Double> grocery = new LinkedHashMap<>();
		grocery.put("Apple", 3.99);
		grocery.put("Milk", 4.99);
		grocery.put("Ice Cream", 2.99);
		grocery.put("Eggs", 4.99);
		grocery.put("Juice", 5.99);
		grocery.put("Milk", 2.99);

		System.out.println(grocery);
		
		double value=grocery.get("Milk");
		System.out.println(value);
		
		//how to get all values
		Collection<Double> values=grocery.values(); // values do not need order and can be duplicated-->Collection
		
		System.out.println(" --------     get all values 1 by 1 using loop ----------- ");
		
		for(Double v:values) {
			System.out.println(v);
		}
		
		System.out.println(" --------     get all values 1 by 1 using iterator ----------- ");
		Iterator<Double>it=values.iterator();
		while(it.hasNext()) {
			double v=it.next();
			System.out.println(v);
		}
		//how to get all keys
		Set<String> keys=grocery.keySet(); // keys don't need to be duplicated --->Set
		System.out.println(" --------     get all keys 1 by 1 using iterator ----------- ");
		//I want to print key + pair together
		Iterator<String> keysIterator =keys.iterator();
		while(keysIterator.hasNext()) {
			System.out.println(keysIterator.next());
		}
		
		System.out.println(" --------     get all keys 1 by 1 using loop ----------- ");
		//I want to print key + pair together
		for(String key:keys) {
			System.out.println(key+" ==== "+grocery.get(key));
		}
		//Write code to get key and a value pair using Iterator
		// Look into EntrySet
		System.out.println("--------     get key and a value pair using Iterator   ------------");
		Iterator<String> iter = keys.iterator();
		while(iter.hasNext()) {
			String key = iter.next();
			System.out.println(key+" === "+ grocery.get(key));
		}
	
	}
}
