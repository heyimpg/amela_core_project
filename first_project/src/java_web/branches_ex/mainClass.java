package java_web.branches_ex;

public class mainClass {
    public static void main(String[] args) {
        //Thêm mới 1 ds
        Shape[] shape = new Shape[5];
        shape[0] = new Circle(1.5);
        shape[1] = new Circle(2, "blue", true);
        shape[2] = new Rectangle(2.5, 3.5);
        shape[3] = new Square(2.5,3,"yellow", false);
        shape[4] = new Rectangle(2.5,3,"dark", false);

        //Duyệt và in ra diện tích, howToColor
        for (int i = 0; i < shape.length; i++) {
            System.out.printf("Shape %d: ", i);
            if (shape[i] instanceof Square)
                ((Square) shape[i]).howToColor();
            else
                 System.out.println(shape[i].getArea());
        }
        
        
        System.out.println("\n\n\n--------End Code--------");
    }
}
