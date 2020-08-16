package com.class17.ReturnMethod;

public class Task {
	
	//related to TaskTest class
	/*
	 * Create a method createEmail(). Based on values of users name, lastName and
	 * email type, your method should return complete email Address.
	 */
	String createEmail(String name, String lastName, String emailType) {
		String mail = name + lastName + "@" + emailType + ".com";
		return mail.toLowerCase();
	}

	/*
	 * Write a method to return whether given number is prime or not?
	 */
	boolean isPrime(int a) {
		boolean prime = true;
		
		if (a > 1) {
			for (int i = 2; i <= a / i; i++) {
				if (a % i == 0) {
					prime = false;
					break;
				}
			}
		} else {
			prime = false;
		}
		return prime;
	}
   
	
	
		
	}
	

