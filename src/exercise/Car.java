package exercise;

class Vehicle {
    protected String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
    }
}

class PetrolCar extends Vehicle {
    private String modelName;
    private int year;
    private double engineCapacity;
    private double mileage;

    public PetrolCar(String brand, String modelName, int year, double engineCapacity, double mileage) {
        super(brand);
        this.modelName = modelName;
        this.year = year;
        this.engineCapacity = engineCapacity;
        this.mileage = mileage;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Model Name: " + modelName);
        System.out.println("Year: " + year);
        System.out.println("Engine Capacity: " + engineCapacity + " cc");
        System.out.println("Mileage: " + mileage + " km/l");
    }
}

public class Car {
    public static void main(String[] args) {
        PetrolCar petrolCar = new PetrolCar("Toyota", "Corolla", 2021, 1598, 14.5);
        petrolCar.displayInfo();
    }
}

