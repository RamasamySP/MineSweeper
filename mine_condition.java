import java.util.Scanner;

public class mine_condition {
    public static void checkBomb(int[][] result,char[][] playing) {
        for (int i = 0; i < playing.length; i++) {
            for (int j = 0; j < playing[0].length; j++) {
                if (result[i][j] == -2 && playing[i][j] != 'F') {
                    playing[i][j] = 'B';
                }
            }
        }
        MineSweeper.clearScreen();
        System.out.println("------------------- Minesweeper -------------------\n");
        MineSweeper.print_matrix(playing);
        System.out.println("=============== GAME OVER ===============");
        System.out.println("\n         You lost the Game :(        \n");
        System.out.println("         Better luck next time!         \n\n");
        System.out.println("1.New Game");
        System.out.println("2. Exit ");
        System.out.println("Enter Choice : ");
        Scanner sc = new Scanner(System.in);
        int win_choice = sc.nextInt();
        if (win_choice == 1) {
            MineSweeper.clearScreen();
            MineSweeper.main(null);
        } else {
            System.out.println(" Thank You !");
            System.exit(0);
        }
    }
}
