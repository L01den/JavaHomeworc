package Homework.Dz5;

import java.util.HashMap;
import java.util.Map;

public class task3 {
    public static void main(String[] args) {
        int k = 3;
        int[] nums = {1,2,3,1};


        Solution sol = new Solution();
        System.out.println(sol.containsNearbyDuplicate(nums, k));
    }
    static class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> mapValues = new HashMap<>();
        if(nums.length <= 1) {
            return false;
        }
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();

        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i]) && i - map.get(nums[i]) <= k){
                return true;
            }else{
                map.put(nums[i],i);
            }
        }
        return false;
    }
}
}




