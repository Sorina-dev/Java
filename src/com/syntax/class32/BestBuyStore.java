package com.syntax.class32;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
 * Create a map of Best Buy store. Place
item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )

Retrieve all keys and values from a Best Buy map using EntrySet.
 */
public class BestBuyStore {
	
public static void main(String[] args) {
	
	Map<Integer, String> bestBuyStore = new HashMap<>();
	bestBuyStore.put(7664847, "Printer");
	bestBuyStore.put(7664848, "TV");
	bestBuyStore.put(7664849, "PC");
	bestBuyStore.put(7664850, "Notebook");
	
	Set<Entry<Integer, String>> entry = bestBuyStore.entrySet();
	
	for(Entry<Integer, String> e :entry) {
		System.out.println(e.getKey() + " === "+ e.getValue());
	}
	
}
}
