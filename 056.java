import java.util.*;

public class Solution {
    public List<Interval> merge(List<Interval> intervals) {
        List<Interval> ret = new LinkedList<Interval>();
        if (intervals.size() < 1) return ret;
        Collections.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                if (o1.start != o2.start)
                    return o1.start - o2.start;
                return o1.end - o2.end;
            }
        });
        int start = intervals.get(0).start, end = intervals.get(0).end;
        for (int i=1; i<intervals.size(); i++) {
            Interval interval = intervals.get(i);
            if (interval.start > end) { // new interval
                ret.add(new Interval(start, end));
                start = interval.start;
                end = interval.end;
            } else {
                end = Math.max(end, interval.end);
            }
        }
        ret.add(new Interval(start, end));
        return ret;
    }
}
