package com.class31.Set_Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class GettingAllKeysFromMap {
public static void main(String[] args) {
	
	Map <Integer, String> map = new HashMap<>();
	map.put(1, "A");
	map.put(2, "B");
	map.put(3, "AA");
	map.put(4, "B");
	map.put(5, "AA");
	map.put(6, null);
	map.put(null, "null");
	
	Set<Integer> keys = map.keySet(); //for keys make it a Set
	for(Integer key : keys) {
		System.out.println(key);
		System.out.println("Key is "+key+" and value is "+map.get(key)); //this get(); only when we know keys, otherwise is null
	}
	
	Iterator<Integer> it = keys.iterator();
	while(it.hasNext()) {
		Integer key = it.next();
		System.out.println("Key is "+key+" and value is "+map.get(key));
	}
	
}
}
