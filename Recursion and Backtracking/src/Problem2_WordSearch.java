// Problem 2: Backtracking Word Search
class Problem2_WordSearch {

    static int[] dx = {-1,-1,-1,0,0,1,1,1};
    static int[] dy = {-1,0,1,-1,1,-1,0,1};

    static boolean search(char[][] grid, String word, int x, int y, int idx, boolean[][] visited) {
        if (idx == word.length()) return true;

        if (x < 0 || y < 0 || x >= 4 || y >= 4) return false;
        if (visited[x][y] || grid[x][y] != word.charAt(idx)) return false;

        visited[x][y] = true;

        for (int i = 0; i < 8; i++) {
            if (search(grid, word, x + dx[i], y + dy[i], idx + 1, visited))
                return true;
        }

        visited[x][y] = false;
        return false;
    }

    public static void main(String[] args) {
        char[][] grid = {
            {'C','A','T','S'},
            {'O','R','E','A'},
            {'D','E','A','M'},
            {'E','L','L','S'}
        };

        String word = "DREAM";
        boolean[][] visited = new boolean[4][4];

        boolean found = false;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (search(grid, word, i, j, 0, visited)) {
                    found = true;
                }
            }
        }

        System.out.println(found ? "Word Found" : "Word Not Found");
    }
}
