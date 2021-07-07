package java_core.point_and_moveablePoint;

public class mainClass {
    public static void main(String[] args) {
        //kiểm thử 1: với class Point
        Point point = new Point(2.3f, 2.5f);
        System.out.println(point.toString());

        System.out.println("------------------------------------------");

        //kiểm thử 2: với class moveablePoint
        moveablePoint move = new moveablePoint(2,3,1,1.5f);
        System.out.println(move);
        move.move();
        System.out.println(move);

        System.out.println("\n\n\n--------End Code--------");
    }
}
