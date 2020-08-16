package com.class06.Switch;

public class SwithIntro {
	public static void main(String[] args) {

     int day=3;
     String dayName;
      // if else
     if (day==1) {
    	 dayName="Monday";
     }else if(day==2) {
    	 dayName="Tuesday";
     }else if(day==3) {
    	 dayName="Wednesday";
     }else if(day==4) {
    	 dayName="Thurday";
     }else if(day==5) {
    	 dayName="Friday";
     }else if(day==6) {
    	 dayName="Saturday";
     }else if(day==7) {
    	 dayName="Sunday";
     }else {
    	 dayName="Invalid";
     }
     System.out.println("Today is "+ dayName);
     // switch case
     
    switch (day) {
    case 1:
    	dayName="Monday";
    	break;
    case 2:
    	dayName="Tuesday";
    	break;
    case 3:
    	dayName="Wednesday";
    	break;
    case 4:
    	dayName="Thursday";
    	break;
    case 5:
    	dayName="Friday";
    	break;
    case 6:
    	dayName="Saturday";
    	break;             //if we don't put break it will print the last one in the case closed to the put break
    case 7:
    	dayName="Sunday";
    	break;
    default:
    	dayName="Invalid";
    	//break;
    }
    System.out.println("Today is "+ dayName);
   
	}
}
