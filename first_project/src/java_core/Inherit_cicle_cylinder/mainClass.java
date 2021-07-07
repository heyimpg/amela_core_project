package java_core.Inherit_cicle_cylinder;

public class mainClass {
    public static void main(String[] args) {
        //Kiểm thử 1 : với hình tròn
        Circle circle =  new Circle();
        System.out.println(circle);

        circle =  new Circle(2.5, "red");
        System.out.println(circle);
        System.out.printf("Circle Area = %.2f", circle.getArea() );
        System.out.printf("\nCircle Perimeter = %.2f", circle.getPerimeter());

        System.out.println("\n------------------------------------------\n");

        //Kiểm thử 2: với hình trụ
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);

        cylinder= new Cylinder(3.5);
        System.out.println(cylinder);

        cylinder= new Cylinder(3.5, "blue", 1.5);
        System.out.println(circle);
        System.out.printf("Cylinder Area = %.2f", cylinder.getArea());
        System.out.printf("\nCylinder Volume =  %.2f", cylinder.getVolume());


        System.out.println("\n\n\n--------End Code--------");
    }
}
