import java.util.Arrays;

public class test {

    static void method2(int a){  }

    static void method1(float a){  }

    static void method1(int c){  }

    static void method1(double d){  }

    public static void main(String[] args) {


        int a = 100;
        m(a);
        System.out.println(a);

    }
    static void m(int x) {
        x = 200;
    }

}