package hw12Encapsulation;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee employee = new Employee("Rubayyi", 16, 'F', 'F');

		System.out
				.println("-------Empoyee infromation------------" + "\nName: " + employee.getEmpName() + "\nAge: " + employee.getEmpAge()
						+ "\nGender: " + employee.getEmpGender() + "\nIs Citizen or not: " + employee.getEmpCitizen());

	}
}
