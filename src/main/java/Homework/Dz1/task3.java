package Homework.Dz1;

public class task3 {
    public static void main(String[] args) {
        String s = " asdasd df f";
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        int end = s.length() - 1;
        int start = 1;
        while (start > 0) {
            if (s.charAt(end) != ' ') {
                if (end == 0) {
                    start = 0;
                    sb.append(s.charAt(end));
                }
                else {
                    start = end - 1;
                    while (s.charAt(start) != ' ') {
                        if (start == 0) {
                            break;
                        }
                        else start--;
                    }
                    if (start != 0) {
                        sb.append(s.substring((start + 1), (end + 1)));
                        sb.append(" ");
                        end = start;
                    }
                    else {
                        sb.append(s.substring((start), (end + 1)));
                        end = start;
                    }
                }
            }
            start = end;
            end--;
        }
        String revers = sb.toString();
        revers = revers.replaceAll("[\\s]{2,}", " ");
        revers = revers.trim();
        return revers;
    }
}
