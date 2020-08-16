package com.class32.Entry_Map;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/*
 * Create a map of countries with its capital that will store countries in alphabetical order.
Print all keys and values from a country map using for each loop and iterator.
Print all values from a country map using for each loop and iterator.
 */
public class Task {
public static void main(String[] args) {
	Map <String, String> map = new TreeMap<>();
	map.put("SUA", "Washington DC");
	map.put("Moldova", "Chisinau");
	map.put("Argentina", "Buenos Aires");
	map.put("France", "Paris");
	
	System.out.println("---- all keys and values from a country map using for each loop and iterator----");
	System.out.println();
	
	Set<String> keys = map.keySet(); //for keys make it a Set
	for(String key : keys) {
		System.out.println("Country "+key+" has the capital "+map.get(key));
	}
	System.out.println();

	Iterator<String> it = keys.iterator();
	while(it.hasNext()) {
		String key = it.next();
		System.out.println("Country "+key+" has the capital "+map.get(key));
	}
	System.out.println();

	System.out.println("---- all values from a country map using for each loop and iterator----");
	System.out.println();

	Collection <String> values = map.values(); // for values make it a Collection
	for(String value:values) {
		System.out.println(value);
	}
	System.out.println();

	Iterator<String> iterator = values.iterator();
	while(iterator.hasNext()) {
		String value = iterator.next();
		System.out.println(value);
	}
}
}
