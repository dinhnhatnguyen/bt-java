package OOP_Extends;

public class Square extends Rectangle{
    public Square() {
        super();
    }
    public Square(double side) {
        super(side,side);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }
    public double getSide()
    {
        return getL();
    }

    @Override
    public String toString() {
        return String.format("Square[%s]",super.toString());
    }
}
