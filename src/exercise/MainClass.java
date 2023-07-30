package exercise;

public class MainClass {
	public static void main(String[] args) {
		Employee employee = new Employee(101, "John Doe", "HR");

		System.out.println("Employee ID: " + employee.getEmployeeId());
		System.out.println("Name: " + employee.getName());
		System.out.println("Department: " + employee.getDepartment());


	}
}
