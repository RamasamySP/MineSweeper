public class empty_space {
    public static void openEmptySpaces(char[][] displaymatrix, boolean[][] matrix, int[][] grid, int i, int j) {
        int grid_row = grid.length, grid_col = grid[0].length;
        if (i == -1 || j == -1 || i >= grid_row || j >= grid_col) {
            return;
        }

        if (grid[i][j] != 0) {
            matrix[i][j] = true;
            displaymatrix[i][j] = Integer.toString(grid[i][j]).charAt(0);
        }

        if (matrix[i][j] == false && grid[i][j] == 0) {
            matrix[i][j] = true;
            displaymatrix[i][j] = ' ';

            openEmptySpaces(displaymatrix, matrix, grid, i, j + 1); // right
            openEmptySpaces(displaymatrix, matrix, grid,i + 1, j); // down
            openEmptySpaces(displaymatrix, matrix, grid, i, j - 1); // left
            openEmptySpaces(displaymatrix, matrix, grid,i - 1, j); // up

            openEmptySpaces(displaymatrix, matrix, grid,i + 1, j + 1); // downright
            openEmptySpaces(displaymatrix, matrix, grid,i - 1, j + 1); // upright
            openEmptySpaces(displaymatrix, matrix, grid,i - 1, j - 1); // upleft
            openEmptySpaces(displaymatrix, matrix, grid,i + 1, j - 1); // downleft
        }
    }
}
