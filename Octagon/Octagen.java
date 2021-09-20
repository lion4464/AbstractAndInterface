package Octagon;

public class Octagen extends GeometricObject implements Comparable{
    private double side;

    public Octagen(double side) {
        if (side>0)
            this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public int compareTo(Octagen obj) {
        if (this.side< obj.side)
        return 1;
        else if(this.side>obj.side)
            return -1;
        else
            return 0;
        }

    @Override
    public double getPerimtr() {
        return 8*side;
    }

    @Override
    public double getArea() {
        return (2+4/Math.sqrt(2))*Math.pow(side,2);
    }

    public static void main(String[] args) {
        Octagen o1=new Octagen(4);
        System.out.println(o1.getArea());
        System.out.println(o1.getPerimtr());
        Octagen o2=(Octagen)o1.clone();
//        o2.setSide(5);
        System.out.println(o2.getPerimtr());
        System.out.println("o1.compareTo(o2) = " + o1.compareTo(o2));
    }

}
