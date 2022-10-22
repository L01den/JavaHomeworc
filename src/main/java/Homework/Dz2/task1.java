package Homework.Dz2;

public class task1 {
    public static void main(String[] args) {
        double num = 2.00000;
        int n = 4;
        System.out.println(myPow(num, n));
    }

    public static double myPow(double x, int n) {
        if (x == 1) return 1;
        if (x == -1 && (n % 2 == 1)) return -1;
        if (x == -1 && (n % 2 == 0)) return 1;
        if (x == 0) return 0;
        if (n == 0) return 1;
        if (n == -1) return 1 / x;
        if (n < -10000) return 0;
        if (n > 1000000) return 0;
        if (n > 0) {
            if (n == 1) return x;
            else {
                return x * myPow(x, n - 1);
            }
        } else {
            if (n == -1) return (1 / x);
            else return 1 / (x * myPow(x, (n * (-1) - 1)));
        }
    }
}

