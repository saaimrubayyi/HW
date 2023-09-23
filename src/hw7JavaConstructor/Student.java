package hw7JavaConstructor;

public class Student {
	public String stName;
	public int stID;
	public char stSex;
	public boolean isProgrammer;
	public float stGrade;

	public Student() {
		System.out.println("-----------This is info for Students-----------");
	}

	// This is default constructor also known as a no argument constructor

	public Student(String stName) {
		this.stName = stName;
		System.out.println("My name: " + stName);

	}

	public Student(char stSex) {
		this.stSex = stSex;
		System.out.println("My Sex: " + stSex);

	}

	public Student(boolean isProgrramer) {
		this.isProgrammer = isProgrammer;
		System.out.println("Am I a programmer?: " + isProgrammer);

	}

	public Student(float stGrade) {
		this.stGrade = stGrade;
		System.out.println("My Grade: " + stGrade);

	}

	public Student(int stID) {
		this.stID = stID;
		System.out.println("My ID: " + stID);

	}
	// This is a parameterized constructor, the parameterized constructor has a
	// argument inside
}
