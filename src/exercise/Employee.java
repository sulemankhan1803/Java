package exercise;

//Final Real-Time Example - Employee
final class Employee {
	private final int employeeId;
	private final String name;
	private final String department;

	public Employee(int employeeId, String name, String department) {
		this.employeeId = employeeId;
		this.name = name;
		this.department = department;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public String getName() {
		return name;
	}

	public String getDepartment() {
		return department;
	}


}


