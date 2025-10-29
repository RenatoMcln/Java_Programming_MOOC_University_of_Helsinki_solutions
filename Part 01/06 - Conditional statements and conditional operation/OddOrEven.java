import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a integer number to verify wheter it's even or odd.\n");

        System.out.println("Give a number:");
        long number = scan.nextLong();

        if (number % 2 == 0) {
            System.out.println("Number " + number + " is even.");
        } else {
            System.out.println("Number " + number + " is odd.");
        }

    }
}
