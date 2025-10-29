package parking_lot_system;

class Car extends Vehicle {
    public Car(String number, int hours) {
        super(number, "Car", hours);
    }

    public double calculateCharge() {
        return 20 * getHoursParked(); // ₹20/hr
    }
}
