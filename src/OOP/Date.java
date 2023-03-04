package OOP;

public class Date {
    int d,m,y;

    public Date(int d, int m, int y) {
        this.d = d;
        this.m = m;
        this.y = y;
    }

    public void setDate(int d , int m ,int y) {
        this.d = d;
        this.m = m;
        this.y = y;
    }

    public int getD() {
        return d;
    }

    public int getM() {
        return m;
    }

    public int getY() {
        return y;
    }

    public void setD(int d) {
        this.d = d;
    }

    public void setM(int m) {
        this.m = m;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("%d/%d/&d",d,m,y);
    }
}
