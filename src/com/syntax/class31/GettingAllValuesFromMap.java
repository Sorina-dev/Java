package com.syntax.class31;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class GettingAllValuesFromMap {
	public static void main(String[] args) {
		
		Map <Integer, String> map = new HashMap<>();
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "AA");
		map.put(4, "B");
		map.put(5, "AA");
		map.put(6, null);
		map.put(null, "null");
		
		Collection <String> values = map.values(); // for values make it a Collection
		for(String value:values) {
			System.out.println(value);
		}
		
		Iterator<String> iterator = values.iterator();
		while(iterator.hasNext()) {
			String value = iterator.next();
			System.out.println(value);
		}
}
}
