package CountIslands;

/*
Given a 2D array of integers with ones representing land and zeroes representing water,
return the number of islands in the grid. Note: an island is one or more ones surrounded
by water connected either vertically or horizontally. Ex: Given the following grid…

11000
11010
11001
return 3.

Time Complecity: O(m x n) where m is the number of rows and n the number of the columns
Space Complexity : O(m x n) in the worst case, due to the recursion stack used by the dfs function.
 */
public class CountIslands {

    public int numIslands(char[][] grid) {

        if (grid == null || grid.length == 0) return 0;

        int numIslands = 0;
        int rows = grid.length;
        int cols = grid[0].length;

        for (int r = 0; r < rows; r++) {

            for (int c = 0; c < cols; c++) {

                if (grid[r][c] == '1') {
                    numIslands += 1;
                    dfs(grid, r, c);
                }

            }

        }


        return numIslands;
    }


    private void dfs(char[][] grid, int r, int c) {

        int rows = grid.length;
        int cols = grid[0].length;


        if (r < 0 || r >= rows || c < 0 || c >= cols || grid[r][c] == '0') return;

        grid[r][c] = '0';

        dfs(grid, r - 1, c);
        dfs(grid, r + 1, c);
        dfs(grid, r, c - 1);
        dfs(grid, r, c + 1);


    }

    public static void main(String[] args) {
        // create new instnace
        CountIslands islands = new CountIslands();
        char[][] grid = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '1'},
        };

        System.out.println("result : " + islands.numIslands(grid));
    }

}
