import java.util.*;

public class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        boolean[][] map = new boolean[numCourses][numCourses];
        int[] in = new int[numCourses];
        for (int i=0; i<prerequisites.length; i++) {
            if (!map[prerequisites[i][1]][prerequisites[i][0]]) {
                map[prerequisites[i][1]][prerequisites[i][0]] = true;
                in[prerequisites[i][0]]++;
            }
        }
        boolean[] vis = new boolean[numCourses];
        int cnt = 0;
        int[] order = new int[numCourses];
        while (cnt < numCourses) {
            int pos = -1;
            for (int i=0; i<numCourses; i++) {
                if (!vis[i] && in[i] == 0) {
                    pos = i;
                    break;
                }
            }
            if (pos == -1) return new int[0];
            vis[pos] = true;
            order[cnt++] = pos;
            for (int i=0; i<numCourses; i++) {
                if (map[pos][i] && !vis[i]) {
                    in[i]--;
                }
            }
        }
        return order;
    }
}
