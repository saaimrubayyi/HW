package hw9JavaMethods;

public class Calculator {

	public Calculator() {
		addition("45", 6, 7.8f);
		fullName("Rubayyi", 190);
		subtraction("56", 67, 57.9);

	}

	public int addition(String a, int b, float c) {
		int outcome1 = Integer.parseInt(a) + b + (int) c;
		System.out.println("Addition of a, b, and c is: " + outcome1);
		return outcome1;
	}

	public String fullName(String fName, int lName) {
		String outcome2 = fName + String.valueOf(lName);
		System.out.println("Full name is: " + outcome2);
		return outcome2;
	}

	public double subtraction(String d, int e, double f) {
		double outcome3 = Double.parseDouble(d) + (double) e + f;
		System.out.println("Subtraction of d, e, and f is: " + outcome3);
		return outcome3;
	}

}
