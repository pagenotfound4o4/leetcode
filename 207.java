import java.util.*;

public class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] in = new int[numCourses];
        List<List<Integer>> edges = new ArrayList<List<Integer>>();
        for (int i=0; i<numCourses; i++) {
            edges.add(new ArrayList<Integer>());
        }
        for (int i=0; i<prerequisites.length; i++) {
            edges.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }
        for (List<Integer> list : edges) {
            for (Integer item : list) {
                in[item]++;
            }
        }
        boolean[] vis = new boolean[numCourses];
        int cnt = 0;
        while (cnt < numCourses) {
            int pos = -1;
            for (int i=0; i<numCourses; i++) {
                if (!vis[i] && in[i] == 0) {
                    pos = i;
                    break;
                }
            }
            if (pos == -1) return false;
            vis[pos] = true;
            cnt++;
            List<Integer> list = edges.get(pos);
            for (int i=0; i<list.size(); i++) {
                int t = list.get(i);
                if (!vis[t]) {
                    in[t]--;
                }
            }
        }
        return true;
    }
}
