package Sorina;


import java.util.Scanner;
public class RepL {
	
	class Main {
		public  void main(String[] args) {
		  
			 Scanner scan=new Scanner(System.in);
			  
			  System.out.println("Enter your name");
			  String name = scan.next();
			  System.out.println("Enter your mobile number");
			  String number = scan.nextLine();
			  System.out.println("Enter your age");
			  int age = scan.nextInt();
			  System.out.println("Your name is "+name+", your age is "+age+" and your mobile number is "+number);
			  
	}
	}
}
