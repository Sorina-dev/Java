package com.class32.Entry_Map;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class AnimalIntroMap {
public static void main(String[] args) {
		
		Map<Integer, Animal>life=new LinkedHashMap<>();
		life.put(1, new Dog("Dog", "Grey"));
		life.put(2, new Monkey("Monkey", "Brown"));
		life.put(3, new Zebra("Zebra", "Black and White"));
		
		System.out.println(" 1.       ----          Using EntrySet         ---              ");
		Set<Entry<Integer, Animal>> entries=life.entrySet(); 
		
		System.out.println("     ----        Access all variables and call all available methods of Animals      ---   ");
		System.out.println("         using Entry with for each loop          ");
		for(Entry<Integer, Animal>e:entries) {
			Animal animal=e.getValue();
			System.out.println(animal.type);
			System.out.println(animal.color);
			animal.eat();
			animal.sleep();
			System.out.println("  ----------   ");
		}
		
		//write with Iterator
		System.out.println("         using Entry with Iterator          ");
		Iterator<Entry<Integer, Animal>> it = entries.iterator();
		while(it.hasNext()) {
			Entry<Integer, Animal> entry =it.next();
			Animal animalObj = entry.getValue();
			System.out.println(animalObj.type);
			System.out.println(animalObj.color);
			animalObj.eat();
			animalObj.sleep();
		}

		System.out.println("2.        ----          Using values()        ---              ");
		
		Collection<Animal> values=life.values();
		for(Animal animal:values) {
			System.out.println(animal.type);
			System.out.println(animal.color);
			animal.eat();
			animal.sleep();
			System.out.println("  ----------   ");
		}
		//write with Iterator
		
		System.out.println("3.        ----          Using keySet()        ---              ");
		System.out.println("         using Entry with for each loop          ");

		Set<Integer> keys=life.keySet();
		
		for(int key:keys) {
			Animal animal=life.get(key);
			System.out.println(animal.type);
			System.out.println(animal.color);
			animal.eat();
			animal.sleep();
			System.out.println("  ----------   ");
		}
		System.out.println("         using Entry with Iterator          ");
	
		//write with Iterator
		Iterator<Integer> iter = keys.iterator();
		while(iter.hasNext()) {
			Integer key = iter.next();
			Animal an = life.get(key);
			System.out.println(an.type);
			System.out.println(an.color);
			an.eat();
			an.sleep();
		}
	}
}
abstract class Animal {

	protected String type;
	protected String color;
	
	public Animal(String type, String color){
		this.type=type;
		this.color=color;
	}
	
	abstract void eat();
	abstract void sleep();
}

class Dog extends Animal{
	
	public Dog(String type, String color) {
		super(type, color);
	}
	
	public void eat() {
		System.out.println(type+" eats bones");
	}
	
	public void sleep() {
		System.out.println(type +"  sleeps at home");
	}
}

class Zebra extends Animal {
	
	public Zebra(String type, String color) {
		super(type, color);
	}
	
	protected void eat() {
		System.out.println(type+" eats grass");
	}
	
	protected void sleep() {
		System.out.println(type +"  sleeps");
	}
}

class Monkey extends Animal{

	public Monkey(String type, String color) {
		super(type, color);
	}

	@Override
	void eat() {
		System.out.println(type+" eats banana");
	}

	@Override
	void sleep() {
		System.out.println(type +"  sleeps on tree");
	}
}