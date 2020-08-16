package com.class02.String_Operators;

public class Variables {

	public static void main(String[] args) {
		
		String name = "Sorina";
		String lastName = "Cristian";
        int grade = 7;
        String city = "Chisinau";
        String state = "Codru";
        String phoneNumber = "600-947-466";
      
        System.out.println(name);
        System.out.println(lastName);
        System.out.println(grade);
        System.out.println(city);
        System.out.println(state);
        System.out.println(phoneNumber);
        System.out.println("---------------------------------------------------------");
        city = "Balti";
        state = "Orhei";
        phoneNumber = "394-846-7383";
        grade = 10;
        
        System.out.println(city);
        System.out.println(state);
        System.out.println(phoneNumber);
        System.out.println(grade);
        
        
        
        System.out.println("----------------------------------------------------------");
        //Task:
        //1. My name is _ and my last name is _.
        //2. I live in city of _ and my phone number id _. 
        
      
        
       System.out.println("My name is " + name + " "+"and my last name is " + lastName+ '.');
       System.out.println("I live in the city of " + city+ " "+ "and my phone number is "+ phoneNumber + '.');
        
        
        
        
	}

}
