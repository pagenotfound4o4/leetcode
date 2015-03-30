import java.util.*;

public class Solution {
    public void rotate(int[] nums, int k) {
        if (nums.length == 0) return;
        k %= nums.length;
        if (k == 0) return;
        int j = 0, pos = 0;
        int tmpa = nums[0], tmpb;
        for (int i=0; i<nums.length; i++) {
            pos = (pos + k) % nums.length;
            tmpb = nums[pos];
            nums[pos] = tmpa;
            tmpa = tmpb;
            if (pos == j) {
                pos = ++j;
                tmpa = nums[pos];
            }
        }
    }
}
