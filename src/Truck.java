public class Truck extends Vehicle{
    private double capacity;
    private int numAxles;

    public Truck(String brand,int year,double capacity,int numAxles){
        super(brand,year);
        this.capacity=capacity;
        this.numAxles=numAxles;
    }

    @Override
    void startEngine(){
        System.out.println(brand+" Engine started");
    }

    @Override
    void stopEngine(){
        System.out.println(brand+" Engine stopped");
    }

    void displayTruckInfo() {
        displayInfo();
        System.out.println(" Capacity :"+capacity+", Number of Axles :"+numAxles);
    }
}
