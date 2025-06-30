import java.util.Random;
import java.util.Scanner;

public class HighOrLow {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner in = new Scanner(System.in);
        int guess = 0;
        int secretNumber = rand.nextInt(10) + 1;
        String trash = "";
        boolean done = false;

        do {
            System.out.print("Guess a number between 1 and 10: ");
            if (in.hasNextInt()) {
                guess = in.nextInt();
                in.nextLine();
                if (guess >= 1 && guess <= 10) {
                    done = true;
                } else {
                    System.out.println("The number must be between 1 and 10, not " + guess);
                }
            } else {
                trash = in.nextLine();
                System.out.println("You must enter an integer between 1 and 10, not " + trash);
            }
        } while (!done);

        System.out.println("The secret number was " + secretNumber);

        if (guess > secretNumber) {
            System.out.println("The guess was too high");
        } else if (guess < secretNumber) {
            System.out.println("The guess was too low");
        } else {
            System.out.println("You guessed the number!");

        }
    }
}