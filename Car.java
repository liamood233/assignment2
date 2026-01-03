public class Car extends Vehicle {

    private int numberOfDoors;

    public Car(String model, int year, double basePrice, int numberOfDoors) {
        super(model, year, basePrice);
        setNumberOfDoors(numberOfDoors);
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        if (numberOfDoors <= 0) {
            throw new IllegalArgumentException("Number of doors must be positive");
        }
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public double calculateInsuranceFee() {
        int age = getAge(java.time.Year.now().getValue());
        return getBasePrice() * 0.05 + age * 100;
    }

    @Override
    public void performService() {
        System.out.println("Car ID " + id + " is undergoing standard car service");
    }

    @Override
    public int getServiceIntervalKm() {
        return 15000;
    }

    @Override
    public String toString() {
        return "Car {" + super.toString() + ", Doors=" + numberOfDoors + "}";
    }
}