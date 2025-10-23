import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many days would you like to convert to seconds?");
        int days = scanner.nextInt();
        final int SECONDS_IN_A_DAY = 86400;
        int convert = days * SECONDS_IN_A_DAY;

        System.out.println(convert);

    }

}
