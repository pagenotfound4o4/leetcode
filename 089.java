/*
1. reverse k-1 th list as a new list
2. add 1<<k to each reversed item in the new list
3. append new list to old list
*/
public class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> ret = new ArrayList<>();
        ret.add(0);
        for (int k=0; k<n; k++) {
            List<Integer> list = new ArrayList<>();
            for (int i=ret.size()-1; i>=0; i--) {
                list.add(ret.get(i) + (1<<k));
            }
            for (int i=0; i<list.size(); i++) ret.add(list.get(i));
        }
        return ret;
    }
}