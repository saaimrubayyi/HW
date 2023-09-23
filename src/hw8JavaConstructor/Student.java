package hw8JavaConstructor;

public class Student {
	public String stName;
	public int stID;
	public char stSex;
	public boolean isProgrammer;
	public float stGrade;

	public Student() {
		System.out.println("-----------This is info for Students-----------");
	}

	// This is where default constructor is declared
	public Student(String stName, int stID, char stSex, boolean isProgrammer, float stGrade) {
		super();
		this.stName = stName;
		this.stID = stID;
		this.stSex = stSex;
		this.isProgrammer = isProgrammer;
		this.stGrade = stGrade;
		System.out.println("\n\nMy name: " + stName + "\nMy student ID: " + stID + "\nAm I a programmer?: "
				+ isProgrammer + "\nMy Grade: " + stGrade);

	}
	// This is where parameterized constructor is declared

}
