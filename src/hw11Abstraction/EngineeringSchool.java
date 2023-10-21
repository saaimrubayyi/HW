package hw11Abstraction;

public abstract class EngineeringSchool {

	public abstract void mechanicalLab();

	public void computerLab() {
		System.out.println("This is a implemented method");
	}
	// There is only one keyword that used for Inheritance (which is extends)
	// The abstract class can extend a regular class and an abstract class but not
	// an Interface
	// Implements keyword can be used to inherit Interface
	// An abstract class can only extend (Inherit)once
}
