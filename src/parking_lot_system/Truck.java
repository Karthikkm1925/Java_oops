package parking_lot_system;

public class Truck extends Vehicle {
    public Truck(String number, int hours) {
        super(number, "Truck", hours);
    }

    public double calculateCharge() {
        return 50 * getHoursParked(); // ₹50/hr
    }
}
