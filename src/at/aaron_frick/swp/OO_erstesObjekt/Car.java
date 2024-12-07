package at.aaron_frick.swp.OO_erstesObjekt;

public class Car {
    private int fuelConsumption;
    private String brand;
    private String serialNumber;
    private int fuelAmount;
    private String color;

    public Car(int fc, String brand, String sn) {
        this.fuelConsumption = fc;
        this.brand = brand;
        this.serialNumber = sn;
        this.fuelAmount = 0;
    }

    public Car(int fc, String brand, String sn, int fuelAmount) {
        this(fc, brand, sn);
        this.fuelAmount = fuelAmount;
    }

    public void drive() {
        this.fuelAmount = this.fuelAmount - fuelConsumption;
        System.out.println("I am Driving");
    }

    public void breaking() {
        String breaks = "ich bremse";
        System.out.println(breaks);
    }

    public void turboboost() {
        if (this.fuelAmount > fuelAmount * 0.1) {
            System.out.println("Superturboboostmode");
        } else {
            System.out.println("not enough fuel");
        }
    }

    public void honk(int amountOfRepetitions) {
        for (int i = 0; i < amountOfRepetitions; i++) {
            System.out.println("Tuuut");
        }
    }

    public void getRemainingRange() {
        if (fuelConsumption > 0) {
            System.out.println((fuelAmount / fuelConsumption) * 100 + "km");
        } else {
            System.out.println(0 + "km");
        }
    }

    public void setFuelAmount(int fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public int getFuelAmount() {
        return fuelAmount;
    }

    public String getBrand() {
        return brand;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public String getColor() {
        return color;
    }
}


