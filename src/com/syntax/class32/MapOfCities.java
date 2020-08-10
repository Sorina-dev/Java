package com.syntax.class32;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/*
 * Create a Map from array of cities that will sort keys in alphabetical order. 
 * As a key store the name of the city and as a value store the length of the city 
 * (Example: Paris=5, Moscow =6, Washington DC=13 etc..). 
If any city name is more than 7 characters remove that city . 
 */
public class MapOfCities {
public static void main(String[] args) {
	
	Map<String, Integer> citiesMap = new TreeMap<>(); 
	
	String s;
	int x;
	;
	citiesMap.put(s = "Washington DC", x= s.length());
	citiesMap.put(s = "Chisinau", x = s.length());
	citiesMap.put(s = "Riga", x= s.length());
	citiesMap.put(s = "Buenos Aires", x= s.length());
	citiesMap.put(s= "Madrid", x= s.length());
	citiesMap.put(s = "Bali", x= s.length());
	
	System.out.println(citiesMap);
	
	Set<String> citiesSet=citiesMap.keySet(); 
	
	Iterator<String>it=citiesSet.iterator();
	while( it.hasNext()){
		String city=it.next();
		if(city.length() > 7) {
			it.remove();
		}
	}
	System.out.println(citiesMap);  

	


}
}
