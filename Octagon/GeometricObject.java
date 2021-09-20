package Octagon;

public class GeometricObject implements Comparable,Cloneable {


    @Override
    public int compareTo(Octagen obj) {
        return 0;
    }

    @Override
    public double getPerimtr() {
        return 0;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    protected Object clone(){
        try{
            return super.clone();
            }
        catch (CloneNotSupportedException e){
            return null;
        }
    }
}
