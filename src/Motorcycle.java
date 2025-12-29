public class Motorcycle extends Vehicle {
    private boolean hasSidecar;
    public Motorcycle(String brand,int year,boolean hasSidecar) {
        super(brand,year);
        this.hasSidecar=hasSidecar;
    }

    @Override
    void startEngine(){
        System.out.println(brand + " engine started");
    }

    @Override
    void stopEngine(){
        System.out.println(brand + " engine stopped");
    }

    void displayMotorcycleInfo() {
        displayInfo();
        System.out.println("Has a side car? :"+hasSidecar);
    }
}