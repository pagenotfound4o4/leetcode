public class Solution {
    public int findKthLargest(int[] nums, int k) {
        return find(nums, k, 0, nums.length - 1);
    }

    public int find(int[] nums, int k, int l, int r) {
        if (r == l) return nums[l];
        int pivot = nums[r];
        int tl = l, tr = r - 1;
        while (tl <= tr) {
            while (tl<=r && nums[tl] < pivot) tl++;
            while (tr>=l && nums[tr] >= pivot) tr--;
            if (tl < tr) {
                swap(nums, tl, tr);
            }
        }
        swap(nums, tl, r);
        if (r-tl+1 == k) return nums[tl];
        else if (r-tl+1 > k) {
            return find(nums, k, tl+1, r);
        } else {
            return find(nums, k-r+tl-1, l, tl-1);
        }
    }
    
    public void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
