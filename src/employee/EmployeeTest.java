package employee;
import java.util.Scanner;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Employee employee = new Employee();

		System.out.print("First Name: ");
        String firstName = scanner.next();

        System.out.print("Last Name: ");
        String lastName = scanner.next();

        System.out.print("Experience (in years): ");
        int experience = scanner.nextInt();

        System.out.print("Designation: ");
        String designation = scanner.next();

        System.out.print("Salary: ");
        double salary = scanner.nextDouble();
        
		scanner.close();
        
        employee.setFirstName(firstName);
        employee.setlastName(lastName);
		employee.setExperience(experience);
		employee.setDesignation(designation);
		employee.setSalary(salary);
		
		
		System.out.println("\nEmployee  Details:");
		System.out.println("FirstName: " + employee.getFirstName());
        System.out.println("LastName: " + employee.getlastName());
        System.out.println("Experience : " + employee.getExperience() + " yrs");
        System.out.println("Designation : " + employee.getDesignation());
        System.out.println("Salary: " + employee.getSalary());
        
       if (designation.equalsIgnoreCase("Manager") && experience >= 5) {
        double salaryHikeForManager = salary + (salary * 0.20);
        System.out.println("Salary with hike: " + salaryHikeForManager);
    } else if (experience >= 3) {
        double salaryHike = salary + (salary * 0.10);
        System.out.println("Salary with hike: " + salaryHike);
    } else {
       
        System.out.println("No salary hike.");
    }
        
      
     
    }
}


