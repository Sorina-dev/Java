package com.class31.Set_Map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LoopingMapUsingEntry {

public static void main(String[] args) {
	Map<String, Integer> classroomMap = new LinkedHashMap<>();
	classroomMap.put("Table", 20); //Entry<Key, Value>
	classroomMap.put("Chair", 60);
	classroomMap.put("Screen", 3);
	classroomMap.put("Student", 60);
	classroomMap.put("Instructor", 3);
	
	Set<Entry<String, Integer>> entrySet=classroomMap.entrySet();
	System.out.println("-------using for each loop to get all entry objects.------");
	
	for(Entry<String, Integer>entry:entrySet) {
		System.out.println(entry.getKey()+":"+entry.getValue());
	}
	
	System.out.println("-------writing Map.Entry and its generic to get all entry objects.------");
	for(Map.Entry<String,Integer> obj:classroomMap.entrySet()) {
		System.out.println(obj.getKey() + ":" + obj.getValue());
	}
	
	System.out.println("-------using iterator to get all entry onjects------");
	
	Iterator<Entry<String, Integer>>entryIterator = entrySet.iterator();
	while(entryIterator.hasNext()) {
		Entry<String, Integer> ent = entryIterator.next();
		String entry = ent.getKey()+"---"+ent.getValue();
		System.out.println(entry);
	}
}
}
