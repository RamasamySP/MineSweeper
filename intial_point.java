public class intial_point {
    public static int[] best_start(int[][] result) {
        int[] index = new int[2];
        int result_row = result.length, result_col = result[0].length;
        int max = 0;
        for (int row = 0; row < result_row; row++) {
            for (int col = 0; col < result_col; col++) {
                int count = 0;
                if (result[row][col] == 0) {
                    if (row > 0 && col > 0 && result[row-1][col-1] == 0) {
                        count += 1;
                    }
                    if (row > 0 && result[row-1][col] == 0) {
                        count += 1;
                    }
                    if (row > 0 && col < result_col-1 && result[row-1][col+1] == 0) {
                        count += 1;
                    }
                    if (col < result_col-1 && result[row][col+1] == 0) {
                        count += 1;
                    }
                    if (col > 0 && result[row][col -1] == 0) {
                        count += 1;
                    }
                    if (row < result_row-1 && result[row+1][col] == 0) {
                        count += 1;
                    }
                    if (row < result_row-1 && col > 0 && result[row +1][col -1] == 0) {
                        count += 1;
                    }
                    if (row < result_row-1 && col < result_col-1 && result[row +1][col +1] == 0) {
                        count += 1;
                    }
                    if (count > max) {
                        max = count;
                        index[0] = row;
                        index[1] = col;
                    }
                }
            }
        }
        return index;
    }
}
