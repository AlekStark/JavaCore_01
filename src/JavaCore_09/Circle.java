package JavaCore_09;

public class Circle extends Figure{
    private double R;

    public Circle(double R, String color){
        super(color);
        this.R = R;
    }
    @Override
    public double area() {
        double S=2*(Math.PI)*(Math.pow(R,2));
        return S;
    }

    @Override
    public double perimeter() {
        double p = 2*R*(Math.PI);
        return p;
    }
}
