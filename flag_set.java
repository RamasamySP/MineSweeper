public class flag_set {
    public static String flag(char[][] displayArray, boolean[][] check_matrix, int row, int col, int flagcount) {
        String out = "";
        if (displayArray[row][col] == '-') {
            displayArray[row][col] = 'F';
            check_matrix[row][col] = true;
            flagcount--;
            out = "( " + row + "," + col + " ) is flaged.\n Flag Count : " + flagcount;
        } else if (displayArray[row][col] == 'F') {
            displayArray[row][col] = '-';
            check_matrix[row][col] = false;
            flagcount++;
            out = "( " + row + "," + col + " ) is unflaged.\n Flag Count : " + flagcount;

        } else {
            out = ">>>>>>>>>> It's already opened! <<<<<<<<<<<<";
        }
        return out;
    }
}
