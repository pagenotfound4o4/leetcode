public class Solution {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int l, r, b, t;
        l = Math.max(A, E);
        r = Math.min(C, G);
        b = Math.max(B, F);
        t = Math.min(D, H);
        int width = 0, height = 0;
        if (r > l) width = r - l;
        if (t > b) height = t - b;
        return (C-A)*(D-B) - width * height + (G-E)*(H-F);
    }
}