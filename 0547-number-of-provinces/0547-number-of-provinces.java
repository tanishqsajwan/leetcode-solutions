class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean[] visited = new boolean[n];
        int provinces = 0;

        // Traverse every city
        for (int i = 0; i < n; i++) {

            // If this city hasn't been explored,
            // it belongs to a new province
            if (!visited[i]) {
                dfs(isConnected, visited, i);
                provinces++;
            }
        }

        return provinces;
    }

    void dfs(int[][] isConnected, boolean[] visited, int city) {

        // Mark the current city as visited
        visited[city] = true;

        // Check every possible city for a direct connection
        for (int neighbour = 0; neighbour < isConnected.length; neighbour++) {

            // If there's a connection and the neighbour isn't visited,
            // explore that city using DFS
            if (isConnected[city][neighbour] == 1 && !visited[neighbour]) {
                dfs(isConnected, visited, neighbour);
            }
        }
    }
}