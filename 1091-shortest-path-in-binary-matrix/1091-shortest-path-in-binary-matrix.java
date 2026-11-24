class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {

        int n = grid.length;

        if (grid[0][0] != 0 || grid[n-1][n-1] != 0)
            return -1;

        boolean[][] visited = new boolean[n][n];

        Queue<int[]> queue = new ArrayDeque<>();

        queue.offer(new int[]{0, 0});
        visited[0][0] = true;

        int[] dr = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dc = {-1, 0, 1, -1, 1, -1, 0, 1};

        int count = 1;

        while (!queue.isEmpty()) {

            int size = queue.size();

            for (int i = 0; i < size; i++) {

                int[] cell = queue.poll();

                int r = cell[0];
                int c = cell[1];

                // Destination reached
                if (r == n-1 && c == n-1)
                    return count;

                // Explore eight directions
                for (int j = 0; j < 8; j++) {

                    int nr = r + dr[j];
                    int nc = c + dc[j];

                    if (nr >= 0 && nr < n &&
                        nc >= 0 && nc < n) {

                        if (grid[nr][nc] == 0 &&
                            !visited[nr][nc]) {

                            visited[nr][nc] = true;
                            queue.offer(new int[]{nr, nc});
                        }
                    }
                }
            }

            count++;
        }

        return -1;
    }
}