package SumArea;

public class GeometricObject implements ObjectsArea{
    @Override
    public double getArea() {
        return 0;
    }
    public static double sumArea(GeometricObject[] a){
        double sum=0;
        for (int i = 0; i < a.length; i++)
                sum+=a[i].getArea();
        return sum;
    }
    public static void main(String[] args) {
        GeometricObject[] a={new Circle(3),new Circle(10),new Rectangle(3,4,5),new Rectangle(3,4,5)};
        System.out.println("sumArea(a) = " + sumArea(a));
    }
}


class Rectangle extends GeometricObject implements ObjectsArea{
    private double a;
    private double b;
    private double c;
    @Override
    public double getArea() {
        double p=(a+b+c)/2;
        return 1/2*Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public Rectangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
}
class Circle extends GeometricObject implements ObjectsArea{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return Math.PI*Math.pow(radius,2);
    }
}


