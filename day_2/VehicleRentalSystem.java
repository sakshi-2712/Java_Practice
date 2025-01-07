class Vehicle {
    String vehicleType;
    String numberPlate;
    double rentalPricePerDay;

    Vehicle(String vehicleType, String numberPlate, double rentalPricePerDay) {
        this.vehicleType = vehicleType;
        this.numberPlate = numberPlate;
        this.rentalPricePerDay = rentalPricePerDay;
    }

    double calculateTotalRentalCost(int numberOfDays) {
        return rentalPricePerDay * numberOfDays;
    }

    public String toString() {
        return vehicleType + " (" + numberPlate + ") - Rs." + rentalPricePerDay + "/day";
    }
}

class Car extends Vehicle {
    int seatingCapacity;

    Car(String numberPlate, double rentalPricePerDay, int seatingCapacity) {
        super("Car", numberPlate, rentalPricePerDay);
        this.seatingCapacity = seatingCapacity;
    }

    public String toString() {
        return super.toString() + ", Seats: " + seatingCapacity;
    }
}

class Bike extends Vehicle {
    boolean hasGear;

    Bike(String numberPlate, double rentalPricePerDay, boolean hasGear) {
        super("Bike", numberPlate, rentalPricePerDay);
        this.hasGear = hasGear;
    }

    public String toString() {
        return super.toString() + ", Gear: " + (hasGear ? "Yes" : "No");
    }
}


class Truck extends Vehicle {
    double loadCapacity;

    Truck(String numberPlate, double rentalPricePerDay, double loadCapacity) {
        super("Truck", numberPlate, rentalPricePerDay);
        this.loadCapacity = loadCapacity;
    }

    public String toString() {
        return super.toString() + ", Load: " + loadCapacity + " tons";
    }
}

public class VehicleRentalSystem {
    public static void main(String[] args) {
        Car car = new Car("MH158534", 1500, 5);
        Bike bike = new Bike("MH152343", 500, true);
        Truck truck = new Truck("MH15534", 3000, 10);

        System.out.println(car);
        System.out.println(bike);
        System.out.println(truck);

        int rentalDays = 3;
        System.out.println("\nTotal Costs for " + rentalDays + " days:");
        System.out.println("Car: Rs." + car.calculateTotalRentalCost(rentalDays));
        System.out.println("Bike: Rs." + bike.calculateTotalRentalCost(rentalDays));
        System.out.println("Truck: Rs." + truck.calculateTotalRentalCost(rentalDays));
    }
}
