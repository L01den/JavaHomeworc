package Homework;

public class Task1 {
    public static void main(String[] args) {
        int[] arr = new int[]{0, 2, 1, 5, 3, 4};
        int[] outputArray = buildArray(arr);
        for (int i = 0; i < outputArray.length; i++) {
            System.out.printf("%s, ", outputArray[i]);
        }

    }

    public static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
