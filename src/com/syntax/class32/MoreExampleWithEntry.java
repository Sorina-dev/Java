package com.syntax.class32;


import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;


public class MoreExampleWithEntry {
	public static void main(String[] args) {

		Map<String, String> movies = new TreeMap<>();

		movies.put("Comedy", "Movie 43");
		movies.put("Horror", "Bird Box");
		movies.put("Fiction", "Avengers");
		movies.put("Action", "James Bond");
		movies.put("Romance", "Titanic");

		System.out.println(movies);

		Set<Entry<String, String>> allEntries = movies.entrySet();
		System.out.println(allEntries);

		Iterator<Entry<String, String>> iterate = allEntries.iterator();
		while (iterate.hasNext()) {
			Entry<String, String> ent = iterate.next();
			String key = ent.getKey();
			String value = ent.getValue();
			System.out.println(key + " - " + value);
		}

		System.out.println("                    ---------              ");

		for (Entry<String, String> entry : allEntries) {
			String pair = entry.getKey() + " && " + entry.getValue();
			System.out.println(pair);
		}
	}
}
