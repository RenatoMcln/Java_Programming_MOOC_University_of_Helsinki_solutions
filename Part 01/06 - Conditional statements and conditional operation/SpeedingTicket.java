import java.util.Scanner;

public class SpeedingTicket {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give speed as an integer value: ");
        int speed = scanner.nextInt();

        if (speed > 120) {
            System.out.println("Speeding ticket!");
        }

    }
}
