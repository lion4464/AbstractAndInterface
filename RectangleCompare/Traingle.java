package RectangleCompare;
public class Traingle extends GeometricObject implements Cloneable{
    private double side_a=3;
    private double side_b=4;
    private double side_c=5;
    @Override
    public double getArea() {
        double perimetr=(side_a+side_a+side_c)/2;
        return Math.sqrt(perimetr*(perimetr-side_a)*(perimetr-side_b)*(perimetr-side_c));
    }

    public Traingle(double side_a, double side_b, double side_c) {
        this.side_a = side_a;
        this.side_b = side_b;
        this.side_c = side_c;
    }

    public Traingle() {
    }

}
