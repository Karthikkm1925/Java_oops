package parking_lot_system;

public class ParkingSystemMain {
    public static void main(String[] args) {
        ParkingLot lot = new ParkingLot(5); // 5 slots

        // Park Vehicles
        lot.parkVehicle(new Car("CAR123", 3));
        lot.parkVehicle(new Bike("BIKE789", 2));
        lot.parkVehicle(new Truck("TRUCK999", 1));

        // Show parked vehicles
        lot.displayParkedVehicles();

        // Remove a vehicle
        lot.removeVehicle("BIKE789");

        // Show updated info
        lot.displayParkedVehicles();

        // Show total revenue
        lot.showTotalRevenue();
    }
}

