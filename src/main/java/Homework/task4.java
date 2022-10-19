package Homework;

public class task4 {
    public static void main(String[] args) {
        String s = ",,,,,,,,,,,,acva";
        System.out.println(isPalindrome(s));
    }
    public static boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        boolean letter = true;
        while (start < s.length() && letter == true){
            if(Character.isLetterOrDigit(s.charAt(start)) == true){
                while(Character.isLetterOrDigit(s.charAt(end)) == false) {
                    end--;
                }
                if (Character.toUpperCase(s.charAt(start)) == Character.toUpperCase(s.charAt(end))){
                    start++;
                    end--;
                }
                else letter = false;
            }
            else start ++;
        }
        return letter;
    }
}
