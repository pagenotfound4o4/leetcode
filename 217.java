import java.util.*;

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for (Integer item : nums) {
            set.add(item);
        }
        return set.size() != nums.length;
    }
}
