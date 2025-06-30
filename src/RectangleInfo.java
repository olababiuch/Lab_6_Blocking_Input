import java.util.Scanner;

public class RectangleInfo {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        double width = 0;
        double height = 0;
        double area = 0;
        double perimeter = 0;
        double diagonal = 0;
        String trash = "";
        boolean done = false;

        do {
            System.out.print("Enter the width of the rectangle: ");
            if (in.hasNextDouble()) {
                width = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("You must enter the width of the rectangle, not " + trash);

            }
        }while(!done);

        done = false;
        do {
            System.out.print("Enter the height of the rectangle: ");
            if (in.hasNextDouble()) {
                height = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("You must enter the height of the rectangle, not " + trash);

            }
        }while(!done);

        area = height  * width;
        perimeter = 2 * (width + height);
        diagonal = Math.sqrt((height * height) + (width * width));

        System.out.printf("The area of the rectangle is: %.2f\n", area);
        System.out.printf("The perimeter of the rectangle is: %.2f\n", perimeter);
        System.out.printf("The diagonal of the rectangle is: %.2f\n", diagonal);
    }
}
