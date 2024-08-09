public class Main {
    public static void main(String[] args) {
        Car[] cars = {
                new Car("Лада Калина", 4),
                new Car("Москвич 412", 4)
        };

        Truck[] trucks = {
                new Truck("Маз", 6),
                new Truck("Камаз", 8)
        };

        Bicycle[] bicycles = {
                new Bicycle("Десна", 2),
                new Bicycle("Урал", 2)
        };

        Transport[] transports = new Transport[cars.length + trucks.length + bicycles.length];
        for (int i = 0; i < cars.length; i++) {
            transports[i] = cars[i];
        }
        for (int i = 0; i < trucks.length; i++) {
            transports[i + cars.length] = trucks[i];
        }
        for (int i = 0; i < bicycles.length; i++) {
            transports[i + cars.length + trucks.length] = bicycles[i];
        }

        Diagnostics diagnostics = new Diagnostics();
        diagnostics.check(transports);
    }
}