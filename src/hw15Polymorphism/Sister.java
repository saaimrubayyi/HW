package hw15Polymorphism;

/* Overloading means to have the same method name with 
 * the same parameters but have different syntax 
 */

public class Sister {

	public void sister() {

	}

	public void sister(int age1) {

	}

	public void sister(int age1, int age2) {

	}

	public static void sister(int age1, int age2, int age3) {

	}

	public int sister(int age1, double age2, int age3, int age4) {
		return 0;
	}

	public final int sister(int age4, int age5, int age6, float age7) {
		return 0;
	}

}
