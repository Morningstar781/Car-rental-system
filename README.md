Car Rental System
This project implements a simple Car Rental System using Java and Object-Oriented Programming (OOP) principles. The system includes basic functionalities for managing cars, customers, and rental transactions.

Features
- Add new cars to the rental agency
- Add new customers to the rental agency
- Rent an available car to a customer
- Return a rented car
- Display all cars and customers

Class Structure
Car
Represents a car in the rental system.

- String licensePlate
- String model
- boolean isRented

Methods:
- Car(String licensePlate, String model)
- String getLicensePlate()
- String getModel()
- boolean isRented()
- void rentCar()
- void returnCar()
- String toString()

Customer
Represents a customer in the rental system.
- String name
- String driverLicenseNumber

 Methods:
- Customer(String name, String driverLicenseNumber)
- String getName()
- String getDriverLicenseNumber()
- String toString()

 RentalAgency
Represents the rental agency, managing cars and customers.
- List<Car> cars
- List<Customer> customers

Methods:
- RentalAgency()
- void addCar(Car car)
- void addCustomer(Customer customer)
- Car findAvailableCar()
- boolean rentCar(Customer customer)
- void returnCar(Car car)
- void displayCars()
- void displayCustomers()

Main
Contains the main method to run the program and demonstrate the functionalities.
 Main Method:
- Creates instances of RentalAgency, Car, and Customer
- Adds cars and customers to the rental agency
- Rents and returns cars
- Displays the cars and customers


 Sample Output
```text
Cars available:
Car [licensePlate=ABC123, model=Toyota Camry, isRented=false]
Car [licensePlate=XYZ789, model=Honda Accord, isRented=false]

Customers:
Customer [name=Levy Kibet, driverLicenseNumber=D7654311]
Customer [name=Adriel Hope, driverLicenseNumber=D1234566]

Renting car to Levy Kibet...
Car rented to Levy Kibet: Car [licensePlate=ABC123, model=Toyota Camry, isRented=true]

Cars available after rental:
Car [licensePlate=ABC123, model=Toyota Camry, isRented=true]
Car [licensePlate=XYZ789, model=Honda Accord, isRented=false]

Returning car rented by Levy Kibet...
Car returned: Car [licensePlate=ABC123, model=Toyota Camry, isRented=false]

Cars available after return:
Car [licensePlate=ABC123, model=Toyota Camry, isRented=false]
Car [licensePlate=XYZ789, model=Honda Accord, isRented=false]
