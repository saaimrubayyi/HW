package hw11UseOfSuperInChildClass;

public class Daughter extends Father {

	public int birthMonth;
	public int age;

	public Daughter() {
		super.father();
		super.FamilyName = "Brown";
		System.out.println("I am daughter (default constructor)");
	}

	public Daughter(int birthMonth, int age) {
		super();
		this.birthMonth = birthMonth;
		this.age = age;
		System.out.println("I am daughter (parameterized constructor)");
	}

	public void daughter() {
		System.out.println("I am daughter (regular method)");
	}

	public void daughterInfo(int birthMonth, int age) {
		this.birthMonth = birthMonth;
		this.age = age;
		System.out.println("I am daughter (parameterized method)");
	}

}
