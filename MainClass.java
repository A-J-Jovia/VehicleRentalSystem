package classfiles;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Car car1 = new Car();
        car1.Setreg_no(1234);
        car1.Setbrand("Honda");
        car1.Setrate(100);

        Bike bike1 = new Bike();
        bike1.Setreg_no(5678);
        bike1.Setbrand("Hero");
        bike1.Setrate(50);

        Truck truck1 = new Truck();
        truck1.Setreg_no(9012);
        truck1.Setbrand("Tata");
        truck1.Setrate(150);

        System.out.println("Available Vehicles:");
        System.out.println("1. Car");
        System.out.println("2. Bike");
        System.out.println("3. Truck");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        System.out.print("Enter rental hours: ");
        int hours = sc.nextInt();

        float totalCost = 0;

        if (choice == 1) {
            System.out.print("Do you want GPS? (yes/no): ");
            String gpsChoice = sc.next();
            boolean gps = gpsChoice.equalsIgnoreCase("yes");
            totalCost = car1.CalcRate(car1.Getrate(), hours, gps);
            System.out.println("\n--- Car Details ---");
            car1.Display();
            System.out.println("Total rental cost for Car: ₹" + totalCost);
        } else if (choice == 2) {
            totalCost = bike1.CalcRate(bike1.Getrate(), hours);
            System.out.println("\n--- Bike Details ---");
            bike1.Display();
            System.out.println("Total rental cost for Bike: ₹" + totalCost);
        } else if (choice == 3) {
            System.out.print("Enter load weight in kg: ");
            float weight = sc.nextFloat();
            totalCost = truck1.CalcRate(truck1.Getrate(), hours, weight);
            System.out.println("\n--- Truck Details ---");
            truck1.Display();
            System.out.println("Total rental cost for Truck: ₹" + totalCost);
        } else {
            System.out.println("Invalid choice!");
        }

        sc.close();
    }
}
