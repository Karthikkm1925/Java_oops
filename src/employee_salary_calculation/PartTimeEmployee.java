package employee_salary_calculation;

public class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(String name, int id, double basePay, int hoursWorked, double hourlyRate) {
        super(name, id, basePay);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return getBasePay() + (hoursWorked * hourlyRate);
    }
}
