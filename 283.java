public class Solution {
    public void moveZeroes(int[] nums) {
        int fast = 0;
        for (int i=0; i<nums.length; i++) {
            while (fast<nums.length && nums[fast]==0) fast++;
            if (fast >= nums.length) break;
            swap(nums, i, fast);
            fast++;
        }
    }
    
    void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}