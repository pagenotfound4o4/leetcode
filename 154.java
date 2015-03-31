import java.util.*;

public class Solution {
    public int findMin(int[] num) {
        int l = 0, r = num.length-1;
        while (l < r) {
            int mid = l + (r - l) / 2; // 著名的bug，当num.length很大时，可能导致(l+r)溢出
            if (num[mid] > num[r]) l = mid + 1;
            else if (num[mid] < num[r]) r = mid;
            else r--; // num[mid] == num[r] 不能确定最小值在左边还是右边，故upper bound减一
        }
        return num[l];
    }
}
