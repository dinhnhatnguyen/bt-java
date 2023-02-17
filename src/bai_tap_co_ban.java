import java.util.Scanner;


import java.util.Scanner;

public class bai_tap_co_ban {
    static  void  PTB2 (double a , double b , double c )
    {
//        Scanner scanner = new Scanner(System.in);
        double d ,X1,X2;
//        // ax^2 +bx + c =0;
//        System.out.print("Nhap a,b,c (ax^2 +bx + c =0): ");
//        a = scanner.nextDouble();
//        b = scanner.nextDouble();
//        c = scanner.nextDouble();

        d = b*b-4*a*c;

        if(d>0){
            d =  Math.sqrt(d);
            X1 = (-b + d) / (2*a);
            X2 = (-b - d) / (2*a);
            System.out.println("Nghiệm của phương trình là");
            System.out.println("X1 = "+ X1);
            System.out.println("X2 = "+ X2);
        }

        if(d==0){
            X1= -b/(2*a);
            System.out.println("Nghiệm của phương trình là x1 = x2 : "+X1);
        }

        if(d<0) {
            System.out.println("Phương trình vô nghiệm");
        }
    }

    static int Fibonacci(int n)
    {
        if (n == 1 || n == 2) return 1;
        return Fibonacci(n-1) + Fibonacci(n-2);
    }

    static int Giai_thua(int n)
    {
        if(n==0) return 1;
        return Giai_thua(n-1)*n;
    }

    static int UCLN(int a, int b)
    {
        if (b == 0) return a;
        if (a % b == 0) return b;
        return UCLN(b, a%b);
    }

    static int BCNN(int a , int b)
    {
        return a*b/UCLN(a,b);
    }

    static boolean check_snt(int n)
    {
        if(n<2) return  false;
        for(int i =2 ; i<=(int)Math.sqrt(n);i++ )
        {
            if(n%i==0) return  false;
        }
        return  true;
    }
    static void snt_nho_hon_n(int n)
    {
        System.out.print("Các số nguyên tố nhỏ hơn "+n+" là: ");
        for (int i=0 ; i<n ; i++)
        {
            if(check_snt(i)) System.out.print(i+" ");
        }
        System.out.println("\n");
    }

    static void n_snt_dau_tien(int n)
    {
        int count = 0;
        int i = 2;
        System.out.print(n+ " số nguyên tố đầu là: ");
        while (count<n)
        {
            if (check_snt(i)) {
                System.out.print(i +" ");
                ++count;
            }
            ++i;
        }
        System.out.println("\n");
    }


    static void snt_co_5_chu_so()
    {
        System.out.println("Số nguyên tố có 5 chữ số là");
        for(int i =10000 ;i < 100000 ; i++)
        {
            if(check_snt(i)) System.out.println(i);
        }
    }

    static int tong_chu_so(int n)
    {
        int sum = 0;
        while (n!=0)
        {
            sum+=n%10;
            n/=10;
        }
        return sum;
    }

    static boolean check_so_thuan_nghich(int n)
    {
        String s = Integer.toString(n);
        String r = new StringBuilder(s).reverse().toString();
        return s.equals(r);
    }

    static void stn_6_chu_so()
    {
        System.out.println("Số Thuận nghịch có 6 chữ số là");
        for(int i =100000 ;i < 1000000 ; i++)
        {
            if(check_so_thuan_nghich(i)) System.out.println(i);
        }
    }

    static boolean check_fibona(int n)
    {
        if(n==0||n==1) return  true;
        int  f2=0,f1=1;
        for(int i=3;i<93;i++ )
        {
            int f = f1+f2;
            if(f==n) return true;
            f2=f1;
            f1=f;
        }
        return false;
    }

    static void liet_ke(int n)
    {
        System.out.print("Số Fibonacci nhỏ hơn " +n+ " va là số nguyên tố là: ");
        for(int i=0 ; i<n ; i++)
        {
            if(check_fibona(i) && check_snt(i)) System.out.print(i+ " ");
        }
        System.out.println("\n");
    }


    public static float [] nhap_mang()
    {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap n: ");
        n= scanner.nextInt();
        float mang[] = new float[n];
        for(int i = 0 ; i<n ; i++)
        {
            System.out.printf("Nhap mang[%d]: ",i);
            mang[i] = scanner.nextFloat();

        }

        return mang;
    }

    public static float tong(float[] mang)
    {
        float sum = 0;
        for(int i = 0 ; i< mang.length;i++)
        {
            sum+=mang[i];
        }

        return sum;
    }

    public static float tong_snt( float[] a)
    {

        float sum = 0;
        for(int i = 0 ; i< a.length;i++)
        {
            if(check_snt((int)a[i])) sum+=a[i];
        }
        return sum;
    }

    static float min(float [] mang)
    {
        float m = Float.MAX_VALUE;
        for(int i = 0 ; i<mang.length;i++)
        {
            if(m>mang[i]) m = mang[i];
        }

        return m;
    }

    static float max(float [] mang)
    {
        float m = Float.MIN_VALUE;
        for(int i = 0 ; i<mang.length;i++)
        {
            if(m<mang[i]) m = mang[i];
        }

        return m;
    }
    static float Average(float[] mang)
    {
        float s = tong(mang);
        return s/ mang.length;
    }

    /**
     *
     * @param a
     * @return
     */
    public static float [] MinMaxAVe(float[] a)
    {
        float [] rs = new float[3];

        rs[0] = min(a);
        rs[1] = max(a);
        rs[2] = Average(a);
        return rs;
    }

    public static float [][] in_2d_array(int n,int m,float[][] a)
    {
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i<n ; i++)
            for (int j = 0 ; j<m ; j++)
            {
                a[i][j] = scanner.nextFloat();
            }
        return a;
    }

    public static int[][] addMatrix(int[][] m1, int[][] m2) {
        int rows = m1.length;
        int cols = m1[0].length;
        int[][] sum = new int[rows][cols];


        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = m1[i][j] + m2[i][j];
            }
        }

        return sum;
    }


    public static int[][] subMatrix(int[][] m1, int[][] m2) {
        int rows = m1.length;
        int cols = m1[0].length;
        int[][] sub = new int[rows][cols];


        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sub[i][j] = m1[i][j] - m2[i][j];
            }
        }

        return sub;
    }

    public static int[][] multiplyMatrix(int[][] matrix1, int[][] matrix2) {
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int cols2 = matrix2[0].length;
        int[][] product = new int[rows1][cols2];

        // Tính tích của hai ma trận và lưu vào ma trận product
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                int sum = 0;
                for (int k = 0; k < cols1; k++) {
                    sum += matrix1[i][k] * matrix2[k][j];
                }
                product[i][j] = sum;
            }
        }

        return product;
    }


    public static double[][] divideMatrix(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        double[][] quotient = new double[rows][cols];

        // Tính thương của hai ma trận và lưu vào ma trận quotient
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                quotient[i][j] = (double) matrix1[i][j] / matrix2[i][j];
            }
        }

        return quotient;
    }
}
