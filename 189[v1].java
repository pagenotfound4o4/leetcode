import java.util.*;

public class Solution {
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length-k);
        reverse(nums, nums.length-k, nums.length);
        reverse(nums, 0, nums.length);
    }

    public void reverse(int[] nums, int l, int r) {
        for (int i=0; i<(r-l)/2; i++) {
            int tmp = nums[l+i];
            nums[l+i] = nums[r-i-1];
            nums[r-i-1] = tmp;
        }
    }
}
