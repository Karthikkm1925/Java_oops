package employee_salary_calculation;

public class Contractor extends Employee {
    private int contractDuration; // in months
    private double monthlyPay;

    public Contractor(String name, int id, double basePay, int contractDuration, double monthlyPay) {
        super(name, id, basePay);
        this.contractDuration = contractDuration;
        this.monthlyPay = monthlyPay;
    }

    @Override
    public double calculateSalary() {
        return contractDuration * monthlyPay;
    }
}
