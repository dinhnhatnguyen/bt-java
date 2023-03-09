package OOP_Abstract;

public class Circle extends Shape{
    private  double radius;
    @Override
    double getArea() {
        return Math.PI*Math.pow(radius,2);
    }

    @Override
    double getPerimeter() {
        return 2*Math.PI*radius;
    }
}
