class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        int orgcol = image[sr][sc];

        // Avoid unnecessary traversal
        if (orgcol == color) {
            return image;
        }

        Queue<int[]> qu = new ArrayDeque<>();

        qu.offer(new int[]{sr, sc});

        // Change starting cell
        image[sr][sc] = color;

        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        while (!qu.isEmpty()) {

            int[] n = qu.poll();

            int nr = n[0];
            int nc = n[1];

            for (int i = 0; i < 4; i++) {

                int cr = nr + dr[i];
                int cc = nc + dc[i];

                // Boundary check
                if (cr >= 0 && cr < image.length &&
                    cc >= 0 && cc < image[0].length) {

                    if (image[cr][cc] == orgcol) {

                        image[cr][cc] = color;
                        qu.offer(new int[]{cr, cc});
                    }
                }
            }
        }

        return image;
    }
}