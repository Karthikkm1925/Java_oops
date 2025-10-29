package parking_lot_system;

class Bike extends Vehicle {
    public Bike(String number, int hours) {
        super(number, "Bike", hours);
    }

    public double calculateCharge() {
        return 10 * getHoursParked(); // ₹10/hr
    }
}
