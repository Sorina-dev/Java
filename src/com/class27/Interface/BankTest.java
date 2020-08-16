package com.class27.Interface;

public class BankTest {
	public static void main(String[] args) {
		
		System.out.println("The PNC object, PNC type");
		
		PNC v = new PNC();
		v.trust();
		v.deposit();
		v.withdraw();
		v.doInvestments();
		v.giveMortgage();
		
		System.out.println("The PNC object, Mortgage type");
		
		Mortgage x = new PNC();
		x.giveMortgage();
		
		System.out.println("The PNC object, Bank type");
		
		Bank y = new PNC();
		y.deposit();
		y.withdraw();
		y.trust();
		
		System.out.println("The PNC object, Investments type");
		
		Investments z = new PNC();
		z.doInvestments();
		
		System.out.println("The PNC object, Trustable type");
		
		Trustable w = new PNC();
		w.trust();
		
		System.out.println("************************************************");
		
		System.out.println("The BOA object, BOA type ");
	
		BOA a = new BOA();
		a.deposit();
		a.withdraw();
		a.trust();
		
		System.out.println("The BOA object, Bank type");
		
		Bank b = new BOA();
		b.deposit();
		b.withdraw();
		
		System.out.println("The BOA object, Trustable type");
		
		Trustable c = new BOA();
		c.trust();
	}
}
interface Trustable {
	
	void trust();
}

interface Bank extends Trustable{
	
	void deposit();
	void withdraw();
}
abstract class Mortgage {

	protected abstract void giveMortgage();
}

interface Investments {
	
	void doInvestments();
}

class PNC extends Mortgage implements Bank, Investments {
	
	public void deposit() {
		System.out.println("PNC bank takes deposits");
	}
	
	public void withdraw() {
		System.out.println("PNC gives you your money");
	}
	
	public void trust() {
		System.out.println("You can trust PNC with your money");
	}
	
	public void giveMortgage() {
		System.out.println("PNC gives mortgage");
	}
	
	public void doInvestments() {
		System.out.println("You can invest your money with PNC");
	}
}
//COMPLETE BOA CLASS
//TEST YOUR CODE
class BOA implements Bank{
	public void deposit() {
		System.out.println("BOA bank takes deposits");
	}
	
	public void withdraw() {
		System.out.println("BOA gives you your money");
	}
	
	public void trust() {
		System.out.println("You can trust BOA with your money");
	}
} 