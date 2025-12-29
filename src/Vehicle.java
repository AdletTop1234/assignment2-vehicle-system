abstract class Vehicle    {
    protected String brand;
    protected int year;
    protected Driver driver;

    Vehicle(String brand,int year){
        this.brand=brand;
        this.year=year;
    }

    void setDriver(Driver driver) {
        this.driver = driver;
    }

    Driver getDriver() {
        return driver;
    }

    abstract void startEngine();
    abstract void stopEngine();

    void displayInfo(){
        System.out.println("Brand :"+brand+", Year:"+year);
    }
}
