package hw16IfElseCondition01;

import java.util.Scanner;

public class Voter01 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int age = scanner.nextInt();
		
		
		if (age == 18) {
			System.out.println("I am a Voter");
		} else if (age < 18) {
			System.out.println("I am not a voter");
		} else if (age > 18) {
			System.out.println("I am a voter from age 18");
		} else {
			System.out.println("Please add a valid age");
		}
		scanner.close();
	}
}
