package hw16ElseCondition02;

public class Temperature {
	public static void main(String[] args) {
		int todaysTemp = 0;

		if (todaysTemp < 32) {
			System.out.println("Freezing");
		} else if (todaysTemp < 55) {
			System.out.println("Pleasant");
		} else if (todaysTemp < 73) {
			System.out.println("Getting Warmer");
		} else if (todaysTemp > 101) {
			System.out.println("Very Hot");
		} else {
			System.out.println("Please put a valid temperature");
		}
	}
}
