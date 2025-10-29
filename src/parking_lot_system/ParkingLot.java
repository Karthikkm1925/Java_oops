package parking_lot_system;

class ParkingLot {
    private Vehicle[] slots;
    private double totalRevenue;

    public ParkingLot(int capacity) {
        slots = new Vehicle[capacity];
        totalRevenue = 0;
    }

    public boolean parkVehicle(Vehicle v) {
        for (int i = 0; i < slots.length; i++) {
            if (slots[i] == null) {
                slots[i] = v;
                System.out.println(v.getType() + " " + v.getVehicleNumber() + " parked in slot " + (i + 1));
                return true;
            }
        }
        System.out.println("Parking full! Cannot park " + v.getVehicleNumber());
        return false;
    }

    public void removeVehicle(String number) {
        for (int i = 0; i < slots.length; i++) {
            if (slots[i] != null && slots[i].getVehicleNumber().equals(number)) {
                double charge = slots[i].calculateCharge();
                totalRevenue += charge;
                System.out.println(slots[i].getType() + " " + slots[i].getVehicleNumber() + " removed. Charge: ₹" + charge);
                slots[i] = null;
                return;
            }
        }
        System.out.println("Vehicle " + number + " not found.");
    }

    public void displayParkedVehicles() {
        System.out.println("\n--- Parked Vehicles ---");
        for (int i = 0; i < slots.length; i++) {
            if (slots[i] != null) {
                System.out.println("Slot " + (i + 1) + ": " + slots[i].getType() + " (" + slots[i].getVehicleNumber() + ")");
            }
        }
    }

    public void showTotalRevenue() {
        System.out.println("\nTotal Revenue: ₹" + totalRevenue);
    }
}

