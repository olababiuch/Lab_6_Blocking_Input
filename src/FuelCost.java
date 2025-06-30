import java.util.Scanner;

public class FuelCost {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double gasInTank = 0;
        double fuelEfficiency = 0;
        double gasPrice = 0;
        double hundredMilesCost = 0;
        double fullTankDistance = 0;
        String trash = "";
        boolean done = false;

        do {
            System.out.print("Enter the number of gallons of gas in the tank: ");
            if (in.hasNextDouble()) {
                gasInTank = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("You must enter a valid number of gallons of gas in the tank, not " + trash);
            }
        } while (!done);

        done = false;

        do {
            System.out.print("Enter the fuel efficiency in miles per gallon: ");
            if (in.hasNextDouble()) {
                fuelEfficiency = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("You must enter a valid fuel efficiency in miles per gallon, not " + trash);
            }
        } while (!done);

        done = false;

        do {
            System.out.print("Enter the price of gas per gallon: ");
            if (in.hasNextDouble()) {
                gasPrice = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("You must enter the price of gas per gallon, not " + trash);
            }
        } while (!done);

        hundredMilesCost = (100 / fuelEfficiency) * gasPrice;
        fullTankDistance = fuelEfficiency * gasInTank;

        System.out.printf("The cost to drive 100 miles is $%.2f\n", hundredMilesCost);
        System.out.printf("The car can go %.2f miles with a full tank.\n", fullTankDistance);
    }
}






