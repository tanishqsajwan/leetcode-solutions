import java.util.*;

class Solution {
    public boolean possibleBipartition(int n, int[][] dislikes) {

        // Build adjacency list
        List<List<Integer>> adj = new ArrayList<>();

        for(int i = 0; i <= n; i++){
            adj.add(new ArrayList<>());
        }

        // Dislike relationships are undirected
        for(int[] d : dislikes){
            adj.get(d[0]).add(d[1]);
            adj.get(d[1]).add(d[0]);
        }

        // -1 = uncoloured, 0 and 1 = two different groups
        int[] color = new int[n + 1];
        Arrays.fill(color, -1);

        // Handle disconnected components
        for(int i = 1; i <= n; i++){

            if(color[i] == -1){

                Queue<Integer> queue = new LinkedList<>();
                queue.offer(i);
                color[i] = 0;

                // BFS traversal
                while(!queue.isEmpty()){

                    int node = queue.poll();

                    for(int neighbour : adj.get(node)){

                        // Uncoloured neighbour: assign opposite colour
                        if(color[neighbour] == -1){
                            color[neighbour] = 1 - color[node];
                            queue.offer(neighbour);
                        }

                        // Same colour on adjacent nodes = conflict
                        else if(color[neighbour] == color[node]){
                            return false;
                        }
                    }
                }
            }
        }

        return true;
    }
}