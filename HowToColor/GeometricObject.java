package HowToColor;

public class GeometricObject implements Colorable{


    @Override
    public void howToColor() {

    }

    @Override
    public void getArea(GeometricObject[] list) {
        for (int i = 0; i < list.length; i++) {
            list[i].howToColor();
            System.out.println("(Area:("+list[i].getAreas()+"));");
        }
    }

    @Override
    public double getAreas() {
        return 0;
    }

    public GeometricObject() {
    }

    public static void main(String[] args) {
        GeometricObject ref=new GeometricObject();
        GeometricObject[] list={new Square(1),new Square(3),new Square(5),new Square(8),new Square(9)};
        ref.getArea(list);
    }

}
