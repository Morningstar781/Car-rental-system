import java.util.ArrayList;
import java.util.List;

class Car {
    private String licensePlate;
    private String model;
    private boolean isRented;

    public Car(String licensePlate, String model) {
        this.licensePlate = licensePlate;
        this.model = model;
        this.isRented = false;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getModel() {
        return model;
    }

    public boolean isRented() {
        return isRented;
    }

    public void rentCar() {
        this.isRented = true;
    }

    public void returnCar() {
        this.isRented = false;
    }

    @Override
    public String toString() {
        return "Car [licensePlate=" + licensePlate + ", model=" + model + ", isRented=" + isRented + "]";
    }
}

class Customer {
    private String name;
    private String driverLicenseNumber;

    public Customer(String name, String driverLicenseNumber) {
        this.name = name;
        this.driverLicenseNumber = driverLicenseNumber;
    }

    public String getName() {
        return name;
    }

    public String getDriverLicenseNumber() {
        return driverLicenseNumber;
    }

    @Override
    public String toString() {
        return "Customer [name=" + name + ", driverLicenseNumber=" + driverLicenseNumber + "]";
    }
}

class RentalAgency {
    private List<Car> cars;
    private List<Customer> customers;

    public RentalAgency() {
        this.cars = new ArrayList<>();
        this.customers = new ArrayList<>();
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public Car findAvailableCar() {
        for (Car car : cars) {
            if (!car.isRented()) {
                return car;
            }
        }
        return null;
    }

    public boolean rentCar(Customer customer) {
        Car availableCar = findAvailableCar();
        if (availableCar != null) {
            availableCar.rentCar();
            System.out.println("Car rented to " + customer.getName() + ": " + availableCar);
            return true;
        } else {
            System.out.println("No available cars for " + customer.getName());
            return false;
        }
    }

    public void returnCar(Car car) {
        car.returnCar();
        System.out.println("Car returned: " + car);
    }

    public void displayCars() {
        for (Car car : cars) {
            System.out.println(car);
        }
    }

    public void displayCustomers() {
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        RentalAgency agency = new RentalAgency();

        Car car1 = new Car("ABC123", "Toyota Camry");
        Car car2 = new Car("XYZ789", "Honda Accord");
        agency.addCar(car1);
        agency.addCar(car2);

        Customer customer1 = new Customer("John Doe", "D1234567");
        Customer customer2 = new Customer("Jane Smith", "D7654321");
        agency.addCustomer(customer1);
        agency.addCustomer(customer2);

        System.out.println("Cars available:");
        agency.displayCars();
        System.out.println("\nCustomers:");
        agency.displayCustomers();

        System.out.println("\nRenting car to John Doe...");
        agency.rentCar(customer1);

        System.out.println("\nCars available after rental:");
        agency.displayCars();

        System.out.println("\nReturning car rented by John Doe...");
        agency.returnCar(car1);

        System.out.println("\nCars available after return:");
        agency.displayCars();
    }
}