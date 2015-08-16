public class Solution {
    public int addDigits(int num) {
        int ret = num;
        while (ret > 9) {
            int t = 0;
            while (ret > 0) {
                t += ret % 10;
                ret /= 10;
            }
            ret = t;
        }
        return ret;
    }
}
