package com.syntax.class29;

import java.util.ArrayList; // import it

public class ArrayListDemo {
	public static void main(String[] args) {

		//let's create an Arraylist that will store numbers
		ArrayList<Integer> alist=new ArrayList<>();
		alist.add(100);//0
		alist.add(200);//1
		alist.add(300);//2
		//alist.add("400"); we cannot store String Objects into ArrayList of Integer Objects
		
		System.out.println("Size of alist="+alist.size()); // the number 
		System.out.println(alist);  //print the array list with [,]
		
		alist.add(1);//3      its adding indexes futher more
		alist.add(2);//4
		alist.add(2); // it can be duplicated
		alist.add(2);
		alist.add(2);
		
		System.out.println(alist);
		
		alist.remove(3);//specifying index of element to remove
		
		System.out.println(alist);
	}
}
