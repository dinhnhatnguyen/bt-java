package OOP_Extends;

public class Circle extends  Shape {
    double Radius ;

    public Circle() {
        super();
        Radius = 1;
    }

    public Circle(double radius) {
        super();
        Radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        Radius = radius;
    }


    public double getRadius() {
        return Radius;
    }
    public double GetArea()
    {
        return Math.pow(Radius,2)*Math.PI;
    }
    public double GetPerimeter()
    {
        return 2*Radius*Math.PI;
    }

    @Override
    public String toString() {
        return String.format("Circle[%s , radius = %2f, ]", super.toString(),Radius);
    }
}
