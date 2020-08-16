package com.class28.Encapsulation;

public class BankTest {
	public static void main(String[] args) {

		Bank bank=new Bank();
		bank.setAccountNumber(123456789);
		System.out.println(bank.getAccountNumber());
		
		bank.setBalance(1000);
		System.out.println(bank.getBalance());
	}
}
class Bank {

	private long accountNumber;
	private double balance;
	
	//setter
	public void setAccountNumber(long accountNumber) {
		//here can be some validation points
		this.accountNumber=accountNumber;
	}
	
	//getter 
	public long getAccountNumber() {
		// here can be many validation points
		return accountNumber;
	}
	
	public void setBalance(double balance) {
		// here can be many validation points
		this.balance=balance;
	}
	
	public double getBalance() {
		// here can be many validation points
		return balance;
	}
}