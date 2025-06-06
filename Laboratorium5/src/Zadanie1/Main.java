package Zadanie1;

public class Main {
    public static void main(String[] args) {
        Engine carEngine = new Engine(150, "Disel");
        FuelTank carTank = new FuelTank(50);
        Car car = new Car("BMW", "M3", 2020, 180, carEngine, carTank, 5);

        Engine truckEngine = new Engine(400, "Benzyna");
        FuelTank truckTank = new FuelTank(150);
        Truck truck = new Truck("Mercedes", "FDG34", 2018, 120, truckEngine, truckTank, 25);

        System.out.println("=== Samochód ===");
        car.displayInfo();
        car.engine.startEngine();
        car.fuelTank.refuel(30);
        car.fuelTank.consume(10);

        System.out.println("\n=== Ciężarówka ===");
        truck.displayInfo();
        truck.engine.startEngine();
        truck.fuelTank.refuel(100);
        truck.fuelTank.consume(40);
    }
}
