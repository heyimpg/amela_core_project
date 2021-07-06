package java_web.branches_ex;

import java.util.Stack;

public class reverseStackMain {
    public static int[] a = {1,2,3};
    public static void main(String[] args) {
        //Khởi tạo stack
        Stack myStack = new Stack();
        for (int i = 0; i < a.length; i++) {
            myStack.push(a[i]);
        }

        //Lấy ra kq
        for (int i = 0; i < myStack.size(); i++) {
            a[i]  = (int)myStack.pop();
        }
        //show ra kq
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+"\t");
        }

        System.out.println("\n\n\n--------End Code--------");
    }
}
