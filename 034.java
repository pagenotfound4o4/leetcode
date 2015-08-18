public class Solution {
    public int[] searchRange(int[] nums, int target) {
        int l = lower_bound(nums, target);
        int r = upper_bound(nums, target);
        int[] ret = new int[]{-1, -1};
        if (r > l) {
            ret[0] = l;
            ret[1] = r - 1;
        }
        return ret;
    }
    
    int upper_bound(int[] arr, int target) {
        int l = 0, r = arr.length;
        while (l < r) {
            int mid = (r - l) / 2 + l;
            if (target >= arr[mid]) l = mid + 1;
            else r = mid;
        }
        return l;
    }
    
    int lower_bound(int[] arr, int target) {
        int l = 0, r = arr.length;
        while (l < r) {
            int mid = (r - l) / 2 + l;
            if (target <= arr[mid]) r = mid;
            else l = mid + 1;
        }
        return l;
    }
}