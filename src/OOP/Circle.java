package OOP;

public class Circle {
    double Radius ;
    String color = "Red";

    public Circle()
    {
        Radius = 1.0;
        color = "Red";
    }

    public double getRadius() {
        return Radius;
    }
    public double GetArea()
    {
        return Math.pow(Radius,2)*Math.PI;
    }
}
