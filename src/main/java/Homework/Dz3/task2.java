package Homework.Dz3;

import java.util.ArrayList;
import java.util.List;

public class task2 {
    static List<Integer> arrayQues = new ArrayList<>();
    static char[] symbol = new char[2];

    public static void main(String[] args) {
        String exem = "2? + ?5 =   69";
        int k = 2;
        int n = 9;

        exem = exem.replace(" ", "");
        symbol = exem.toCharArray();
        remember(symbol);
        List<Integer> list = new ArrayList<>();
        helper(0, list, n, k);

    }

    //   запоминает расположение вопросв
    public static List<Integer> remember(char[] symbol) {
        for (int i = 0; i < symbol.length; i++) {
            if (symbol[i] == '?') {
                arrayQues.add(i);
            }
        }
        return arrayQues;
    }

    //  подставляем комбинации в пример
    public static void enumeration(char[] symbol, List<Integer> arrayQues, List<Integer> comb) {

        for (int i = 0; i < arrayQues.size(); i++) {
            int a = arrayQues.get(i);
            char b = (char) Character.forDigit(comb.get(i), 10);
            symbol[a] = b;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < symbol.length; i++) {
            sb.append(symbol[i]);
        }
        String s = sb.toString();
        s = s.replace("+", "=");
        String[] ans = s.split("=");
        if (Integer.parseInt(ans[0]) + Integer.parseInt(ans[1]) == Integer.parseInt(ans[2])) {
            System.out.println(String.copyValueOf(symbol));
        }
    }

    //   создаём комбинации
    private static void helper(int prev, List<Integer> comb, int n, int k) {
        prev = 0;
        if (comb.size() == k) {
            enumeration(symbol, arrayQues, comb);
            return;
        }
        for (int i = prev; i <= n; i++) {
            comb.add(i);
            prev++;
            helper(i, comb, n, k);
            comb.remove(comb.size() - 1);
        }
    }
}
