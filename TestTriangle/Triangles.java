package TestTriangle;

public class Triangles extends GeometricObject{

    public Triangles(double a, double b, double c, String color, boolean filled) {
        super(a, b, c, color, filled);
    }

    public static void main(String[] args) {
        Triangles t1=new Triangles(2,3,4,"red",false);
        System.out.println("t1.getArea() = " + t1.getArea());
        System.out.println("t1.getPerimetr() = " + t1.getPerimetr());
        System.out.println("t1.isFilled() = " + t1.isFilled());

    }

    @Override
    public double getArea() {
        return Math.sqrt(getPerimetr()/2*(getPerimetr()/2-a)*(getPerimetr()/2-b)*(getPerimetr()/2-c))*1/2;
    }

    @Override
    public double getPerimetr() {
        return a+b+c;
    }
}
