package car_simulation;

public  class ElectricCar extends Car {
    // For ElectricCar, fuel means battery percentage (0–100)
    public ElectricCar(double speed, double batteryPercentage) {
        super(speed, batteryPercentage, 5); // fuelEfficiency acts as km per 1% battery
    }

    @Override
    public void drive(int hours) {
        double possibleDistance = fuel * fuelEfficiency;
        double distanceToTravel = speed * hours;

        if (distanceToTravel > possibleDistance) {
            distance += possibleDistance;
            fuel = 0;
            System.out.println("Battery drained after driving " + possibleDistance + " km.");
        } else {
            distance += distanceToTravel;
            fuel -= distanceToTravel / fuelEfficiency;
            System.out.println("Electric car drove for " + hours + " hours, covering " + distanceToTravel + " km.");
        }
    }

    @Override
    public void displayStatus() {
        System.out.println("Electric Car status → Distance: " + distance + " km | Battery: " + fuel + "%");
    }
}
