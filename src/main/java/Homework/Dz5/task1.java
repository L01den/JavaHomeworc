package Homework.Dz5;

import Homework.Dz4.isValid;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class task1 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        Solution sol = new Solution();
        System.out.println(sol.intersect(nums1, nums2));
    }


    static class Solution {
        public int[] intersect(int[] nums1, int[] nums2) {
            if (nums1.length > nums2.length) {
                return intersect(nums2, nums1);
            }

            Map<Integer, Integer> map = new HashMap<>();

            for (int i = 0; i < nums1.length; i++) {
                if (map.containsKey(nums1[i])) {
                    map.put(nums1[i], map.get(nums1[i]) + 1);
                } else {
                map.put(nums1[i], 1);
            }

        }

            List<Integer> ans = new ArrayList<>();
            for (int i = 0; i < nums2.length; i++) {
                if (map.containsKey(nums2[i])) {
                    if (map.get(nums2[i]) != 0) {
                        ans.add(nums2[i]);
                        map.put(nums2[i], map.get(nums2[i]) - 1);
                    }
                }
            }
            int[] resalt = new int[ans.size()];
            for (int i = 0; i < ans.size(); i++) {
                resalt[i] = ans.get(i);
            }
            return resalt;
        }
    }
}
