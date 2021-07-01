package java_web.branches_ex;

public class mainClass {
    public static void main(String[] args) {
        IllegalTriangleException_Class triagle = new IllegalTriangleException_Class(2,3,3);
        try {
            triagle.validateTriangle();
            System.out.println("Tam giác hợp lệ");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Tam giác không hợp lệ");
        }
        System.out.println("\n\n\n--------End Code--------");
    }
}
