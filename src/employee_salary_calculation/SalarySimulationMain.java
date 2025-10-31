package employee_salary_calculation;

public class SalarySimulationMain {
	public static void main(String[] args) {
        Employee[] employees = {
            new FullTimeEmployee("Karthik", 101, 50000, 10000),
            new PartTimeEmployee("Sneha", 102, 0, 40, 500),
            new Contractor("Rahul", 103, 0, 6, 30000)
        };

        System.out.println("🏢 Employee Salary Calculation System 🧮\n");

        for (Employee emp : employees) {
            System.out.println("Employee Name: " + emp.getName());
            System.out.println("Employee ID: " + emp.getId());
            System.out.println("Total Salary: ₹" + emp.calculateSalary());
            System.out.println("--------------------------------");
        }
    }
}
