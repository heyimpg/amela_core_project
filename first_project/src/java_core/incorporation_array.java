package java_core;

public class incorporation_array {
    public static void main(String[] args) {
        int[] A_arr = {1,2,3};
        int[] B_arr = {4,5,6};
        int[] C_arr = new int[A_arr.length+ B_arr.length];
        for (int i = 0; i < A_arr.length; i++) {
            C_arr[i] = A_arr[i];
        }
        for (int i = 0; i < B_arr.length; i++) {
            C_arr[A_arr.length+i] = B_arr[i];
        }

        System.out.println("Show arr incorporation");
        for (int i = 0; i < C_arr.length; i++) {
            System.out.print(C_arr[i]+"\t");
        }

        System.out.println("\n\n\n--------End Code--------");
    }
}
