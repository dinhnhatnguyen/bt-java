package Kiem_tra;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        int d,m,y;
        Scanner scanner = new Scanner(System.in);
        d = 16;
        m = 11;
        y = 2002;
        MyDate a = new MyDate(y,m,d);

        System.out.println(a.toString());

    }


}
