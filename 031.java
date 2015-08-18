public class Solution {
    public void nextPermutation(int[] nums) {
        if (nums == null || nums.length < 2) return;
        int pos = nums.length - 2;
        while (pos>=0 && nums[pos]>=nums[pos+1]) pos--;
        if (pos < 0) {
            reverse(nums, 0, nums.length);
            return;
        }
        reverse(nums, pos+1, nums.length);
        int p = upper_bound(nums, pos+1, nums.length, nums[pos]);
        int tmp = nums[pos];
        nums[pos] = nums[p];
        nums[p] = tmp;
    }
    
    int upper_bound(int[] arr, int l, int r, int target) {
        while (l < r) {
            int mid = (r - l) / 2 + l;
            if (target >= arr[mid]) l = mid + 1;
            else r = mid;
        }
        return l;
    }
    
    void reverse(int[] arr, int l, int r) {
        for (int i=0; i<(r-l)/2; i++) {
            int t = arr[i+l];
            arr[i+l] = arr[r-i-1];
            arr[r-i-1] = t;
        }
    }
}