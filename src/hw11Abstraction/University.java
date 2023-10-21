package hw11Abstraction;

public interface University extends College, Hospital {
	public abstract void classSize();

	public abstract void playGround();

	public abstract void teacher();

	public default void gymnasium() {

	}

	public static void library() {

	}
	// Only one keyword is used for Inheritance (which is extends)
	// The interface can inherit interfaces but cannot extend a regular or an
	// abstract method (by using the extends keyword)
	// Interface cannot have a implement keyword (So it cannot be inherited either)
	// The interface can extend multiple times
}
