package com.syntax.class24;

public class CreditCardTest {
	public static void main(String[] args) {

		CreditCard c = new CreditCard();
		c.interest(4.6);

		Visa v = new Visa();
		v.interest(8.7);

		AX a = new AX();
		a.interest(3.7);

	}
}
