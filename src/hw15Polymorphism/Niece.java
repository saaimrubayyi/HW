package hw15Polymorphism;

public class Niece extends Sister {
	@Override
	public void sister() {

	}

	@Override
	public void sister(int age1) {

	}

	@Override
	public void sister(int age1, int age2) {

	}

	// @Override
	// public static void sister(int age1, int age2, int age3) {

	// }
	// Static method can't override because it is a local method of the Sister class

	@Override
	public int sister(int age1, double age2, int age3, int age4) {
		return 0;
	}

	// @Override
	// public final int sister(int age4, int age5, int age6, float age7) {
	// return 0;
	// }
	// Final method can't be override because the method
	// is final in nature and no change will be accepted

}
