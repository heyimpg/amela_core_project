package java_web.branches_ex;

public class Square extends Rectangle implements Colorable {
    public Square() {
    }

    public Square(double width, double length) {
        super(width, length);
    }

    public Square(double width, double length, String color, boolean filled) {
        super(width, length, color, filled);
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides..");

    }
}
