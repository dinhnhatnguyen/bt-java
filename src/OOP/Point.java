package OOP;

public class Point {
    private int x,y;
    public Point()
    {
        x=y=0;
    }

    public Point(int x , int y)
    {
        this.x = x;
        this.y = y;
    }

    public Point(Point p) // hàm khởi tạo sao chép
    {
        x = p.x;
        y = p.y;
    }

    /**
     * Khoảng cách tới gốc toạ độ O(0,0)
     * @return Khoảng cách d(P,0)
     */
    public double Distance()
    {
        return Math.sqrt((Math.pow(x,2))+Math.pow(y,2));
    }

    public  double Distance(Point d2)
    {
        return Math.sqrt(Math.pow((d2.x-x),2)+Math.pow((d2.y-y),2));
    }

    @Override
    public String toString() {
        return String.format("( %d, %d)",x,y);
    }
}
