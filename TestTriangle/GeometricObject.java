package TestTriangle;

public abstract class GeometricObject implements Triangle{
    protected double a;
    protected double b;
    protected double c;
    protected String color;
    protected boolean filled;

    public GeometricObject(double a, double b, double c, String color, boolean filled) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.color = color;
        this.filled = filled;
    }

    @Override
    public boolean isFilled(){
        return filled;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
}
