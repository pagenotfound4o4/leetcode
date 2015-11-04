public class Solution {
    public String multiply(String num1, String num2) {
        int len1 = num1.length(), len2 = num2.length();
        int[] nums = new int[len1+len2];
        for (int i=len1-1; i>=0; i--) {
            for (int j=len2-1; j>=0; j--) {
                int tmp = (num1.charAt(i)-'0') * (num2.charAt(j)-'0');
                nums[i+j] += (tmp + nums[i+j+1]) / 10;
                nums[i+j+1] = (tmp + nums[i+j+1]) % 10;
            }
        }
        StringBuilder sb = new StringBuilder("");
        for (int i=0; i<len1+len2; i++) {
            if (sb.length() > 0 || nums[i] > 0)
                sb.append(nums[i]);
        }
        if (sb.length() == 0) return "0";
        return sb.toString();
    }
}
