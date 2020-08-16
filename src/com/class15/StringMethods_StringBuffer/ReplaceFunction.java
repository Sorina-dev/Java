package com.class15.StringMethods_StringBuffer;

public class ReplaceFunction {
public static void main(String[] args) {
	System.out.println("----------------- replace() mehtod -------------------");
	String me="I am a good tester. I am a good person";
	
	String str="Hello";
	
	str=str.replace('e', 'E');
	System.out.println(str);
	
	me=me.replace("good", "great");
	System.out.println(me);
	
	me=me.replace("we", "us");//if it find it --> replace if it will not --> does nothing
	System.out.println(me);
	//replacing all character from A-Z
	String fromApplication="Phone number is 1234567890";
	fromApplication=fromApplication.replaceAll("[A-Z]", "");
	
	System.out.println(fromApplication);//hone number is 1234567890
	//replacing all character from a-z
	fromApplication=fromApplication.replaceAll("[a-z]", "").trim();
	
	System.out.println("New String value is="+fromApplication);
	
	String another="Hello12345";
	another=another.replaceAll("[A-Z]", "").replaceAll("[a-z]", "");
	System.out.println(another);
	
	String anotherWay="HelloYIIghffjfj6576565";
	anotherWay=anotherWay.replaceAll("[A-Za-z]", "");//6576565
	
	System.out.println(anotherWay);
	
	//replacing all numbers [0-9] from the String, if specific [0-5]
	String mix="Hello76588 friends 0976886";
	mix=mix.replaceAll("[0-9]", "");//Hello friends 
	System.out.println(mix);
	//replacing all special characters
	String mix1="hello &*%##%";
	mix1=mix1.replaceAll("[^A-Za-z0-9]", "Syntax");
	
	System.out.println(mix1);
}
}
