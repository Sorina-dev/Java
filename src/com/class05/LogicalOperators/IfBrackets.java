package com.class05.LogicalOperators;

public class IfBrackets {
public static void main(String[] args) {
	 boolean isHoliday=true;
	 
	 if(isHoliday) {
		 System.out.println("I will sleep all day");
		 System.out.println("I will play with my kids");//if we put {} --> the the system will read these 2 lines until else
	 }else {System.out.println("I will work hard");     // without {} Else doesnt belong to anywere, 
		 
	 System.out.println("**********************************2 case****************************");
	 
	 if(isHoliday) 
		 System.out.println("I will sleep all day");      // no {} at all--> system will read both lines
         System.out.println("I will play with my kids");  // cuz after IF --> system reads one line
         //but the 2nd is not part of If conditional in case isHoliday is true
         //if isHoliday is false, then only the 2nd line will be printed
         // as the conditional is false and the 2nd line is not part of the conditional
         
	 }
}
}
