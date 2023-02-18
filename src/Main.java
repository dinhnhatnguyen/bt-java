import java.util.Scanner;

import OOP.Employee;
import OOP.Point;
public class Main {
    public static void main(String[] args)
    {
       employee();
    }
    static void employee()
    {
        Employee e = new Employee(1 , "Nhat" , "Nguyen", 100000000 );
        System.out.println(e.toString());
    }
    static void OOP()
    {
        Point p = new Point();
        System.out.println("Toạ độ điểm P là: "+ p.toString());
        Point q = new Point(5,10);
        System.out.println("Toạ độ điểm Q là: "+ q.toString());
        Point t = new Point(q);
        System.out.println("Toạ độ điểm Q là: "+ t.toString());
        double d = q.Distance(p);

    }

    static void CB()
    {
        boolean flag = true;
        int n;
        do
        {
            System.out.println("-----------------------------------------------------------");
            System.out.println("-----1. Giải phương trình bậc 2 ---------------------------");
            System.out.println("-----2. Tính giai thừa ------------------------------------");
            System.out.println("-----3. Tìm Fibonacci thứ n -------------------------------");
            System.out.println("-----4. Tìm UCLN và BCNN ----------------------------------");
            System.out.println("-----5. Liệt kê số nguyên tố nhỏ hơn n --------------------");
            System.out.println("-----6. Liệt kê n số nguyên tố đầu tiên -------------------");
            System.out.println("-----7. Liệt kê số nguyên tố có 5 chữ số ------------------");
            System.out.println("-----8. Tính tồng chữ số của số nguyên --------------------");
            System.out.println("-----9. Liệt kê số thuận nghịch có 6 chữ số ---------------");
            System.out.println("-----10. Số nguyên tố thuộc dãy Fibonacci nhỏ hơn n -------");
            System.out.println("-----BẤM 0 ĐỂ KẾT THÚC CHƯƠNG TRÌNH------------------------");
            System.out.println("-----------------------------------------------------------");
            System.out.print("-----Lựa chọn của bạn : ");
            Scanner scanner = new Scanner(System.in);
            int crl = scanner.nextInt();
            switch (crl)
            {
                case 1:
                    System.out.print("Nhập a,b,c (ax^2 +bx + c =0): ");
                    Double a = scanner.nextDouble();
                    Double b = scanner.nextDouble();
                    Double c = scanner.nextDouble();
                    bai_tap_co_ban.PTB2(a,b,c);
                    break;
                case 2:
                    System.out.print("Nhập n: ");
                    n = scanner.nextInt();
                    System.out.println( "Giai thừa của "+ n+" là: "+ bai_tap_co_ban.Giai_thua(n));
                    break;
                case 3:
                    System.out.print("Nhập n: ");
                    n = scanner.nextInt();
                    System.out.println("Số Finonacci thứ "+n+" là: " +bai_tap_co_ban.Fibonacci(n));
                    break;
                case 4:
                    int x,y;
                    System.out.print("Nhập 2 số x và y: ");
                    x = scanner.nextInt();
                    y = scanner.nextInt();
                    System.out.println("UCLN của 2 số là: " + bai_tap_co_ban.UCLN(x,y));
                    System.out.println("BCNN của 2 số là : "+ bai_tap_co_ban.BCNN(x,y));
                    break;
                case 5:
                    System.out.print("Nhập n: ");
                    n = scanner.nextInt();
                    bai_tap_co_ban.snt_nho_hon_n(n);
                    break;
                case 6:
                    System.out.print("Nhập n: ");
                    n = scanner.nextInt();
                    bai_tap_co_ban.n_snt_dau_tien(n);
                    break;
                case 7:
                    bai_tap_co_ban.snt_co_5_chu_so();
                    break;
                case 8:
                    System.out.print("Nhập n: ");
                    n = scanner.nextInt();
                    System.out.println("Tổng các chữ số của "+ n+" là: "+bai_tap_co_ban.tong_chu_so(n));
                    break;
                case 9:
                    bai_tap_co_ban.stn_6_chu_so();
                    break;
                case 10:
                    System.out.print("Nhập n: ");
                    n = scanner.nextInt();
                    bai_tap_co_ban.liet_ke(n);
                    break;
                default:
                    System.out.println("\nTạm biệt HiHi :3");
                    flag = false;
                    break;
            }
        }while (flag);
    }

}