package employee_salary_calculation;

public class FullTimeEmployee extends Employee {
    private double bonus;

    public FullTimeEmployee(String name, int id, double basePay, double bonus) {
        super(name, id, basePay);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return getBasePay() + bonus;
    }
}
