package hw14Abstraction;

public class ColombiaUniversity extends MedicalSchool implements University, VocationalSchool{

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
	// An regular class can only extend (Inherit)once

	@Override
	public void classSize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void playGround() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void teacher() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void vocationalInfo() {
		// TODO Auto-generated method stub
		
	}
}
