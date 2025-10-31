package employee_salary_calculation;

public abstract class Employee {
	private String name;
    private int id;
    private double basePay; // Encapsulation

    public Employee(String name, int id, double basePay) {
        this.name = name;
        this.id = id;
        this.basePay = basePay;
    }

    // Abstract method — each employee type defines its own salary calculation
    public abstract double calculateSalary();

    // Encapsulation — getters
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getBasePay() {
        return basePay;
    }
}
