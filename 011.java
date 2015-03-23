import java.util.*;

public class Solution {
    public int maxArea(int[] height) {
        int l = 0, r = height.length-1;
        int maxv = 0;
        while (r > l) {
            maxv = Math.max(maxv, Math.min(height[l], height[r]) * (r - l));
            if (height[l] < height[r]) l++;
            else r--;
        }
        return maxv;
    }
}
