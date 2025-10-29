
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter two integer values\n");

        System.out.println("Give the first number:");
        int number1 = scan.nextInt();
        System.out.println("Give the second number:");
        int number2 = scan.nextInt();

        if (number1 > number2) {
            System.out.println("Greater number is: " + number1);
        } else if (number1 < number2) {
            System.out.println("Greater number is: " + number2);
        } else {
            System.out.println("The numbers are equal!");
        }

    }
}
