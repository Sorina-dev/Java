package com.syntax.class30;

import java.util.ArrayList;
import java.util.Iterator;

public class RemovingElementsFromCollection {
	public static void main(String[] args) {

		// create an arraylist of city names
		ArrayList<String> cities = new ArrayList<>();
		cities.add("Kyiv");
		cities.add("LA");
		cities.add("LA");
		cities.add("Istanbul");
		cities.add("DC");
		cities.add("New York");

		System.out.println("original arrayList === " + cities);
		// remove cities LA, DC

		System.out.println(" -------- Removing Objects from ArrayList using for loop -------- ");
		for (int i = 0; i < cities.size(); i++) {
			if (cities.get(i).equals("LA") || cities.get(i).equals("DC")) {  // don't do exactly or can be CE
				cities.remove(i);
				System.out.println(cities);
			}
		}

		System.out.println("final arraylist === " + cities);

		System.out.println(" -------- Removing Objects from ArrayList using enhanced loop -------- ");

//		for(String city:cities ) {
//			if(city.equals("New York")) {
//				cities.remove(city);
//			}
//		}
		System.out.println(cities);

		System.out.println(" -------- Removing Objects from ArrayList using iterator -------- ");
		cities.add("LA");
		cities.add("LA");
		cities.add("Miami");
		cities.add("Miami");
		cities.add("Miami");
		cities.add("Miami");

		System.out.println(cities);

		Iterator<String> citiesIt = cities.iterator();
		
		while(citiesIt.hasNext()) {
			if (citiesIt.next().equals("LA")){
				citiesIt.remove();
			}
		}
		System.out.println("ArraList after modifications from Iterator: "+cities);
	}
}
