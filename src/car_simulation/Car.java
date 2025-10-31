package car_simulation;

public class Car {
	protected double speed;          // km per hour
    protected double fuel;           // in liters
    protected double distance;       // in km
    protected double fuelEfficiency; // km per liter

    public Car(double speed, double fuel, double fuelEfficiency) {
        this.speed = speed;
        this.fuel = fuel;
        this.fuelEfficiency = fuelEfficiency;
        this.distance = 0;
    }

    public void drive(int hours) {
        double possibleDistance = fuel * fuelEfficiency;
        double distanceToTravel = speed * hours;

        if (distanceToTravel > possibleDistance) {
            distance += possibleDistance;
            fuel = 0;
            System.out.println("Fuel ran out after driving " + possibleDistance + " km.");
        } else {
            distance += distanceToTravel;
            fuel -= distanceToTravel / fuelEfficiency;
            System.out.println("Drove for " + hours + " hours, covering " + distanceToTravel + " km.");
        }
    }

    public void displayStatus() {
        System.out.println("Car status → Distance: " + distance + " km | Fuel: " + fuel + " L");
    }
}
