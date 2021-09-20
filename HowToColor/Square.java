package HowToColor;

public class Square extends GeometricObject implements Colorable{
    private double side=0;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void howToColor() {
        System.out.print(" Color all four sides ");
    }
    public double getAreas(){
        return side*side;
    }
}

