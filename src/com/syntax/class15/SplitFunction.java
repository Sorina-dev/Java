package com.syntax.class15;

public class SplitFunction {
public static void main(String[] args) {
	
	String str="Today is Sunday and we have a Java class";
	
	String[] array=str.toLowerCase().split("s");
	
	int howManyElements=array.length;
	System.out.println(howManyElements);

	//enhanced for loop
	for(String s:array) {
		System.out.print(s+"|");
	}
}
}
