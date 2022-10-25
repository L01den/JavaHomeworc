package Homework.Dz4;
import java.util.Stack;


public class evalRPN {
    public static void main(String[] args) {
        String[] tokens = {"4","13","5","/","+"};
        Solution sol = new Solution();
        System.out.println(sol.evalRPN(tokens));

    }

    static class Solution {
        public int evalRPN(String[] tokens) {
            Stack<Integer> num = new Stack<>();
            int res = 0;
            for (int i = 0; i < tokens.length; i++) {
                String s = tokens[i];
                if (isNumeric(s)){
                    num.push(Integer.parseInt(tokens[i]));
                } else {
                    switch (tokens[i]){
                        case "+":
                            res = num.pop() + num.pop();
                            num.push(res);
                            break;
                        case "*":
                            res = num.pop() * num.pop();
                            num.push(res);
                            break;
                        case "-":
                            res = -num.pop() + num.pop();
                            num.push(res);
                            break;
                        case "/":
                            res = num.pop();
                            res = num.pop() / res;
                            num.push(res);
                            break;
                        default:
                            break;
                    }
                }
            }
            return num.pop();
        }
        public static boolean isNumeric(String str) {
            try {
                Double.parseDouble(str);
                return true;
            } catch(NumberFormatException e){
                return false;
            }
        }
    }
}
