package java_core;

import java.util.Scanner;

public class check_number_prime {
    public static void main(String[] args) {
        int number;
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Enter your number: "); number = scanner.nextInt();

        if (number < 2)
        {
            System.out.println(number + " is not a prime");
            return;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number%i==0)
            {
                System.out.println(number + " is not a prime");
                return;
            }
        }
        System.out.println(number + " is a prime");

        System.out.println("\n\n\n--------End Code--------");
    }
}
