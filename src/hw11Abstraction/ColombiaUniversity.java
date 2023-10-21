package hw11Abstraction;

public class ColombiaUniversity extends MedicalSchool {

	// public abstract void chemistry();
	// Method cannot be declared in a regular class

	public void biology() {
		System.out.println("You can create a implemented method inside a regular class");
	}

	public ColombiaUniversity() {
	}
	// There is only one keyword that used for Inheritance (which is extends)
	// The regular class can extend a regular class and an abstract class but not an
	// Interface
	// Implements keyword can be used to inherit Interface
	// An regular class can only extend (Inherit)once
}
