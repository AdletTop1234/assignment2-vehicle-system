public class Main {
    public static void main(String[] args) {

        Driver driver1 = new Driver("Adilet", "TOP456");
        Driver driver2 = new Driver("Zhakubay", "MOV123");

        Car car = new Car("Toyota", 2020, 4, "Gasoline");
        Motorcycle motorcycle = new Motorcycle("Yamaha", 2018, false);
        Truck truck = new Truck("Volvo", 2022, 18.5, 4);

        car.setDriver(driver1);
        motorcycle.setDriver(driver1);
        truck.setDriver(driver2);

        Vehicle[] vehicles = { car, motorcycle, truck };

        for (Vehicle v : vehicles) {
            v.startEngine();
            v.displayInfo();

            if (v.getDriver() != null) {
                v.getDriver().displayDriverInfo();
            }

            v.stopEngine();
            System.out.println("----------------");
        }
    }
}
