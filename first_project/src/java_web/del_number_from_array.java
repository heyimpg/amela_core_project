package java_web;

import java.util.Scanner;

public class del_number_from_array {
    public static void main(String[] args) {
        //Show before arr
        int arr[] = {1,3,5,7,9};
        System.out.println("Before arr: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ "\t");
        }
        System.out.println();
        //Enter X
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter X value = ");
        int X  = scanner.nextInt();
        int index_del = 0;
        boolean check = false;
        //Validate DK
        for (int i = 0; i < arr.length ; i++) {
           if (X == arr[i])
           {
               check = true;
               index_del = i;
               break;
           }
        }

        //Return Result
        if (check==false)
        {
            System.out.println("Not found X");
            return;
        }
      //  System.out.println("Index = "+index_del);
        for (int i = index_del; i < arr.length-1; i++) {
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = arr[i];
        }
        arr[arr.length-1] = 0;
        System.out.println("Arr result: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ "\t");
        }



        System.out.println("\n\n\n--------End Code--------");
    }
}
