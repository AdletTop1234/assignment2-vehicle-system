public class Car extends Vehicle{
    private int doors;
    private String fuelType;

    public Car(String brand,int year,int doors,String fuelType){
        super(brand,year);
        this.doors=doors;
        this.fuelType=fuelType;
    }

    @Override
    void startEngine(){
        System.out.println(brand + " engine started");
    }

    @Override
    void stopEngine(){
        System.out.println(brand + " engine stopped");
    }

    void displayCarInfo() {
        displayInfo();
        System.out.println("Doors: " + doors + ", Fuel: " + fuelType);
    }
}