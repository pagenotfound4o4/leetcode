public class Solution {
    public int myAtoi(String str) {
        final int INT_MAX = 2147483647;
        final int INT_MIN = -2147483648;
        if (str == null || str.length() == 0) return 0;
        char[] arr = str.toCharArray();
        int sign = 1, ret = 0, pos = 0;

        // ignore leading white space
        while (pos < arr.length) {
            if (arr[pos] != ' ') break;
            pos++;
        }

        // decide positive or negative
        if (arr[pos] == '-') {
            sign = -1;
            pos++;
        } else if (arr[pos] == '+') {
            pos++;
        }

        // calc number
        while (pos < arr.length) {
            if (arr[pos] < '0' || arr[pos] > '9') break;
            ret = ret * 10 + (arr[pos] - '0');
            // check if the num is overflow
            if (ret % 10 != (arr[pos] - '0') && !(ret == INT_MIN && sign == -1)) {
                return sign > 0 ? INT_MAX : INT_MIN;
            }
            pos++;
        }
        if (ret == INT_MIN) return INT_MIN;
        return ret * sign;
    }
}
