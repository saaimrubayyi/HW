package hw16IfElseCondition01;

public class Voter {
	public static void main(String[] args) {

		int age = 0;

		if (age == 18) {
			System.out.println("I am a Voter");
		} else if (age < 18) {
			System.out.println("I am not a voter");
		} else if (age > 18) {
			System.out.println("I am a voter from age 18");
		} else {
			System.out.println("Please add a valid age");
		}
	}
}
