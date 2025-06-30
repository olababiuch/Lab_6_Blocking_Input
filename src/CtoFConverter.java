import java.util.Scanner;

public class CtoFConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String trash = "";
        double tempC = 0;
        double tempF = 0;
        boolean done = false;

        do {
            System.out.print("Enter temperature in Celsius: ");
            if (in.hasNextDouble()) {
                tempC = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("You must enter a valid temperature in Celsius, not " + trash + "\n");
            }
        }while (!done);

        tempF = (9.0 / 5.0) * tempC + 32;
        System.out.println("Your temperature in Fahrenheit is: " + tempF);
        }
    }