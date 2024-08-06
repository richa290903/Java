/*5. write a program to input a number and check whether it is greater than 1000 or not. If it is greater than 1000, throw an exception using toString() and display proper message either an exception is thrown or not. */

import java.util.Scanner;

class GreaterThan1000 extends Exception {
    public GreaterThan1000(String message) {
        super(message);
    }
}

public class p5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        try {
            if (number > 1000) {
                throw new GreaterThan1000("The number is greater than 1000.");
            } else {
                System.out.println("The number is not greater than 1000.");
            }
        } catch (GreaterThan1000 e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
