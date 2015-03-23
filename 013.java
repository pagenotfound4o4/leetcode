import java.util.*;

public class Solution {
    public int romanToInt(String s) {
        int sum = 0, prev = 0;
        for (char c: s.toCharArray()) {
            int now = getNum(c);
            if (now > prev && (prev == 1 || prev == 10 || prev == 100)) {
                sum = sum - prev + now - prev;
            } else {
                sum += now;
            }
            prev = now;
        }
        return sum;
    }

    public int getNum(char c) {
        if (c == 'I') return 1;
        else if (c == 'V') return 5;
        else if (c == 'X') return 10;
        else if (c == 'L') return 50;
        else if (c == 'C') return 100;
        else if (c == 'D') return 500;
        else if (c == 'M') return 1000;
        return 0;
    }
}
