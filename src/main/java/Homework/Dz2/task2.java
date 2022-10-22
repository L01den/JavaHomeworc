package Homework.Dz2;

public class task2 {
    public static void main(String[] args) {
        int n = 32;
        System.out.println(isPowerOfTwo(n));
    }

    public static boolean isPowerOfTwo(int n) {
        if (n == 1) return true;
        if (n % 2 == 1 || n == 0) return false;
        return isPowerOfTwo(n / 2);
    }
}

