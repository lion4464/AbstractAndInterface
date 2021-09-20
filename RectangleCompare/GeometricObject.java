package RectangleCompare;

import TestTriangle.Triangle;

public class GeometricObject implements Comparable{

    public  boolean equals(Object t2) {
        Triangle tr2=(Triangle)t2;
        if (this.getArea()!=((Triangle)tr2).getArea())
            return false;
        else
            return true;
        }

    @Override
    public double getArea() {
        return 0;
    }


    public static void main(String[] args) {
        Traingle tr1=new Traingle();
        Traingle tr2=new Traingle(5,6,2);
        tr1.equals(tr2);
    }

}
