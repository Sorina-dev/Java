package com.syntax.class30;

import java.util.ArrayList;

import java.util.Iterator;

public class Recap {
	public static void main(String[] args) {

		// I need collection that can store double objects and can have duplicates and I
		// would like to maintain the order

		double[] array = { 10, 20, 10.99 };

		ArrayList<Double> numbers = new ArrayList<>();
		numbers.add(10.99);// boxing
		numbers.add(9.99);
		numbers.add(8.99);
		numbers.add(9.99);
		numbers.add(9.99);
		// numbers.add(7); CE: we cannot store Integer Objects into ArrayList of Double
		// Objects

		System.out.println(numbers);

		Double num = numbers.get(2);
		double num1 = numbers.get(1);// unboxing

		System.out.println(" ----  Retrieving elements using advanced for loop ----- ");
		for (double n : numbers) {
			System.out.print(n + " ");
		}

		System.out.println();
		System.out.println(" ----- I want to retrieve elements backwards ------ ");
		for (int i = numbers.size() - 1; i >= 0; i--) {
			Double myNum = numbers.get(i);
			System.out.print(myNum + " ");
		}

		System.out.println();
		System.out.println(" ---- Gertting all values using iterator ------ ");

		Iterator<Double> it = numbers.iterator();
		// next(); --> gets next Object
		// hasNext(); --> checks if there is next element
		// remove(); --> remove element from the collection

		double d = it.next();
		double d1 = it.next();
		System.out.println(d1);

		System.out.println(" ---- Printing all values using iterator ------ ");

		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}

		System.out.println(" ---- Printing all values using new iterator object ------ ");

		Iterator<Double> doubleIT = numbers.iterator();
		
		while (doubleIT.hasNext()) {
			double element = doubleIT.next();//unboxing
			if(element <9){
				doubleIT.remove();//removing element from collection
			}
		}
		System.out.println(numbers);
	}
}
