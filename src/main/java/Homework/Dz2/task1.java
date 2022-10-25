package Homework.Dz2;

public class task1 {
    public static void main(String[] args) {
        double num = 2.00000;
        int n = 4;
        System.out.println(myPow(num, n));
    }

    public static double myPow(double x, int n) {
        if (x == 1 || n == 0) return 1;
        if (x == 0) return 0;
        if (n < 0){
            return 1 / x * myPow(1 / x, - (n + 1));
        }
        double num = myPow(x, n / 2);
        if (n % 2 == 0){
            return num * num;
        } else{
            return num * num * x;
        }
    }
}

