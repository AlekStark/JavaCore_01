package JavaCore_09;

public class Triangle extends Figure{
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c, String color){
        super(color);
        this.a=a;
        this.b=b;
        this.c=c;
    }
    @Override
    public double area() {
        double ap = perimeter();
        double S = Math.sqrt(ap*(ap-a)*(ap-b)*(ap-c));
        return S;
    }

    @Override
    public double perimeter() {
        double p=(a+b+c)/2;
        return p;
    }
}
