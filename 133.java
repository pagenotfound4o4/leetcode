/**
 * Definition for undirected graph.
 * class UndirectedGraphNode {
 *     int label;
 *     List<UndirectedGraphNode> neighbors;
 *     UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
 * };
 */
public class Solution {
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        if (node == null) return null;
        HashMap<UndirectedGraphNode, UndirectedGraphNode> map = new HashMap<>();
        HashSet<UndirectedGraphNode> vis = new HashSet<>();
        Stack<UndirectedGraphNode> stack = new Stack<>();
        stack.push(node);
        map.put(node, new UndirectedGraphNode(node.label));
        vis.add(node);
        while (!stack.isEmpty()) {
            UndirectedGraphNode cur = stack.pop();
            for (UndirectedGraphNode next : cur.neighbors) {
                if (!vis.contains(next)) {
                    vis.add(next);
                    stack.push(next);
                    map.put(next, new UndirectedGraphNode(next.label));
                }
            }
        }
        
        vis.clear();
        stack.push(node);
        vis.add(node);
        while (!stack.isEmpty()) {
            UndirectedGraphNode cur = stack.pop();
            UndirectedGraphNode ncur = map.get(cur);
            for (UndirectedGraphNode next : cur.neighbors) {
                ncur.neighbors.add(map.get(next));
                if (!vis.contains(next)) {
                    vis.add(next);
                    stack.push(next);
                }
            }
        }
        return map.get(node);
    }
}
