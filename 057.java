import java.util.*;

public class Solution {
    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        int pos = 0;
        while (pos < intervals.size()) {
            if (intervals.get(pos).start > newInterval.start) {
                break;
            }
            ++pos;
        }
        intervals.add(pos, newInterval);
        List<Interval> ret = new ArrayList<Interval>();
        ret.add(intervals.get(0));
        for (int i=1; i<intervals.size(); i++) {
            if (ret.get(ret.size() - 1).end < intervals.get(i).start) {
                ret.add(intervals.get(i));
            } else {
                ret.get(ret.size() - 1).end = Math.max(ret.get(ret.size() - 1).end, intervals.get(i).end);
            }
        }
        return ret;
    }
}
