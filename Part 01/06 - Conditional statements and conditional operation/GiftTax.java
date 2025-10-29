import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the value of the gift received from a close relative to calculate the gift tax.\n");

        System.out.println("Value of the gift?");
        double gift = scan.nextDouble();

        double tax1 = 100 + (gift - 5000) * 0.08;
        double tax2 = 1_700 + (gift - 25000) * 0.10;
        double tax3 = 4_700 + (gift - 55000) * 0.12;
        double tax4 = 22_100 + (gift - 200000) * 0.15;
        double tax5 = 142_100 + (gift - 1000000) * 0.17;

        if (gift < 5000) {
            System.out.println("No tax!");
        } else if (gift >= 5000 && gift < 25000) {
            System.out.println("Tax: " + tax1);
        } else if (gift >= 25000 && gift < 55000) {
            System.out.println("Tax: " + tax2);
        } else if (gift >= 55000 && gift < 200000) {
            System.out.println("Tax: " + tax3);
        } else if (gift >= 200000 && gift < 1000000) {
            System.out.println("Tax: " + tax4);
        } else {
            System.out.println("Tax: " + tax5);
        }

    }
}