public class Solution {
    public String largestNumber(int[] nums) {
        Integer[] arr = new Integer[nums.length];
        for (int i=0; i<nums.length; i++) arr[i] = nums[i];
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                String stra = String.valueOf(a) + String.valueOf(b);
                String strb = String.valueOf(b) + String.valueOf(a);
                for (int i=0; i<stra.length(); i++) {
                    if (stra.charAt(i) != strb.charAt(i)) {
                        return strb.charAt(i) - stra.charAt(i);
                    }
                }
                return 0;
            }
        });
        String ret = "";
        for (Integer item : arr) {
            if (ret.length() == 0 && item == 0) continue;
            ret = ret + String.valueOf(item);
        }
        return ret.length() == 0 ? "0" : ret;
    }
}
