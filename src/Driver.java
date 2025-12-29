public class Driver {
    private String name;
    private String licenseNumber;

    public Driver(String name, String licenseNumber) {
        this.name = name;
        this.licenseNumber = licenseNumber;
    }

    void displayDriverInfo(){
        System.out.println(" Name of the driver :"+name+", License number :"+licenseNumber);
    }
}
