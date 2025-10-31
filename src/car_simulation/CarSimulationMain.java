package car_simulation;

public class CarSimulationMain {
	public static void main(String[] args) {
        Car petrolCar = new Car(60, 10, 15);         // 60 km/h, 10 liters, 15 km/l
        Car electricCar = new ElectricCar(80, 100);  // 80 km/h, 100% battery

        // Demonstrating polymorphism
        Car[] cars = { petrolCar, electricCar };

        for (Car c : cars) {
            c.drive(2);          // Drive for 2 hours
            c.displayStatus();
            System.out.println("-------------------");
        }
    }
}
