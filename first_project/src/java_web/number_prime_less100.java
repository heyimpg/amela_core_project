package java_web;

import java.util.Scanner;

public class number_prime_less100 {
    //kiểm tra xem số đó có phải snt hay ko?
    public static boolean check_prime(int value)
    {
        if (value < 2)
        {
            System.out.println(value + " is not a prime");
            return false;
        }
        for (int i = 2; i <= Math.sqrt(value); i++) {
            if (value%i==0)
                return false;
        }
        //Đủ đk thì là snt
        return true;
    }

    public static void main(String[] args) {


        System.out.println("List number prime: ");
        for (int i = 0; i < 100 ; i++) {
            if (check_prime(i))
                System.out.print(i+"\t");
        }

        System.out.println("\n\n\n--------End Code--------");
    }
}
