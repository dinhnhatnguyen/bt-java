package OOP_Extends;

public class Rectangle extends Shape{
    double w,l;

    public double getW() {
        return w;
    }

    public double getL() {
        return l;
    }

    public void setW(double w) {
        this.w = w;
    }

    public void setL(double l) {
        this.l = l;
    }

    public Rectangle() {
        super();
        w=l=1;
    }

    public Rectangle(double w, double l) {
        super();
        this.w = w;
        this.l = l;
    }

    public Rectangle(String color, boolean filled, double w, double l) {
        super(color, filled);
        this.w = w;
        this.l = l;
    }

    public double getArea(){
        return w*l;
    }
    public double getPerimeter()
    {
        return 2*(w+l);
    }

    @Override
    public String toString() {
        return String.format("Rectangle[%s,w = %f, l=%f]",super.toString(),w,l);
    }
}
