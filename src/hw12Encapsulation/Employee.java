package hw12Encapsulation;

public class Employee {

	private String epmName;
	private int empAge;
	private char empGender;
	private char empCitizen;

	public Employee(String empName, int empAge, char empGender, char empCitizen) {
		super();

		this.epmName = empName;
		this.empAge = empAge;
		this.empGender = empGender;
		this.empCitizen = empCitizen;
	}

	public String getEmpName() {
		return epmName;
	}

	public int getEmpAge() {
		return empAge;
	}

	public char getEmpGender() {
		return empGender;
	}

	public char getEmpCitizen() {
		return empCitizen;
	}

}
