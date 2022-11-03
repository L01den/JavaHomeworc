//package Homework.Dz2;
//
//public class task3 {
//    public static void main(String[] args) {
//        static class Solution {
//            int[] num = new int[50];
//
//            public int climbStairs(int n) {
//                if (n == 1) return 1;
//                if (n == 2) return 2;
//                if (num[n - 1] == 0)
//                    num[n - 1] = climbStairs(n - 1);
//                if (num[n - 2] == 0)
//                    num[n - 2] = climbStairs(n - 2);
//                return num[n - 1] + num[n - 2];
//            }
//        }
//    }
//}