

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
 }


public class BinaryTreeInfect {
   

     int ans;
public void buildGraph(TreeNode root, List<List<Integer>> adj) {
        if (root == null) {
            return;
        }
        if (root.left != null) {
            adj.get(root.val).add(root.left.val);
            adj.get(root.left.val).add(root.val);
        }

        if (root.right != null) {
            adj.get(root.val).add(root.right.val);
            adj.get(root.right.val).add(root.val);
        }

        buildGraph(root.left, adj);
        buildGraph(root.right, adj);
    }
    
    public void bfs(int start, List<List<Integer>> adj, boolean[] visited) {
        Queue<Integer> q = new ArrayDeque<>();
        q.add(start);

        while (!q.isEmpty()) {
            int k = q.size();

            while (k-- > 0) {
                int u = q.poll();
                visited[u]=true;

                for (int neighbor : adj.get(u)) {
                    if (!visited[neighbor]) {
                        q.add(neighbor);
                    }
                }
            }
            ans++;
        }
    }
    public int amountOfTime(TreeNode root, int start) {
        List<List<Integer>> adj = new ArrayList<>(100001);
        for (int i = 0; i < 100001; i++) {
            adj.add(new ArrayList<>());
        }

         boolean[] visited = new boolean[100001];

        buildGraph(root, adj);
        ans = 0;
        bfs(start, adj, visited);
        return ans - 1;
    }

    

}

