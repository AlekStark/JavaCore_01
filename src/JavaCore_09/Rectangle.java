package JavaCore_09;

public class Rectangle extends Figure {
    private double width;
    private double height;


    public Rectangle(double width, double height, String color){
        super(color);
        this.width=width;
        this.height=height;
    }
    @Override
    public double area() {
        double S= width*height;
        return S;
    }

    @Override
    public double perimeter() {
        double p = (width+height)*2;
        return p;
    }


}
