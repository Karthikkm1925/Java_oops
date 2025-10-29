package parking_lot_system;

public abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private int hoursParked;

    public Vehicle(String vehicleNumber, String type, int hoursParked) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.hoursParked = hoursParked;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getType() {
        return type;
    }

    public int getHoursParked() {
        return hoursParked;
    }

    public abstract double calculateCharge();
}

