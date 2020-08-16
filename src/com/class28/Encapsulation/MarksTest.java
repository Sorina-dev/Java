package com.class28.Encapsulation;

public class MarksTest {
public static void main(String[] args) {
		
		Marks StuA = new A(90, 80, 70);
		System.out.println(StuA.getPercentage());
		
	
		
		Marks StuB = new B(20, 30, 50, 75);
		System.out.println(StuB.getPercentage());
	}

}
abstract class Marks {
	/*
	 * We have to calculate the average of marks obtained in three subjects by
	 * student A and by student B. Create class 'Marks' with an abstract method
	 * 'getPercentage' that will be returning the average percentage of marks.
	 * Provide implementation of abstract method in classes 'A' and 'B'. The
	 * constructor of student A takes the marks in three subjects as its parameters
	 * and the marks in four subjects as its parameters for student B. Test your
	 * code
	 */

	int math;
	int geo;
	int chem;
	
	Marks(int math, int geo, int chem) {
		this.math = math;
		this.geo = geo;
		this.chem = chem;
	}

	public abstract int getPercentage();
}

class A extends Marks {
	
	A(int math, int geo, int chem) {
		super(math, geo, chem);
		
	}

	public int getPercentage() {
		int result = (math + geo + chem) /3;
		return result;
	}
}

class B extends Marks {
	int science;
	
	B(int math, int geo, int chem, int science) {
		super(math, geo, chem);
		this.science = science;
	}
	public int getPercentage() {
		int result = (math + geo + chem + science) /4;
		return result;
	}
}