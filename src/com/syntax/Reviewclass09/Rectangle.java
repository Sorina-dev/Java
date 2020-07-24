package com.syntax.Reviewclass09;

public class Rectangle extends Shape {
	int lentgh, width;
	Rectangle(int lentgh, int width) {
		super();
		this.lentgh = lentgh;
		this.width = width;
	}
	
	@Override
	public void calculateArea() {
		System.out.println("Area of the given Rectangle is : "+ (lentgh*width));
	}
	
	public void calculatePerimeter() {
		System.out.println("Perimeter of the given Rectangle is "+ 2*(lentgh+width));
	}

}
