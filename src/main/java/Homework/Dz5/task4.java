package Homework.Dz5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class task4 {
    public static void main(String[] args) {
        Map<String, List<String>> fileРaths = new HashMap<>();
        String[] paths = {"root/a 1.txt(abcd) 2.txt(efgh)", "root/c 3.txt(abcd)", "root/c/d 4.txt(efgh)", "root 4.txt(efgh)"};

        for (int i = 0; i < paths.length; i++) {
            String str = paths[i];
            String[] folder = str.split(" ");
            for (int j = 1; j < folder.length; j++) {
                int start = folder[j].indexOf('(');
                int end = folder[j].indexOf(')');
                String content = folder[j].substring(start + 1, end);
                fileРaths.putIfAbsent(content, new ArrayList<>());
                fileРaths.get(content).add(folder[0] + "/" + folder[j].substring(0, start));
            }
        }
        List<List<String>> ans = new ArrayList<>();

        for (var value : fileРaths.entrySet()) {
            if(value.getValue().size() > 1){
                ans.add(value.getValue());
            }
        }
        System.out.println(ans);
    }
}
