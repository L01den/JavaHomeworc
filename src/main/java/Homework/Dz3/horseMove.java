package Homework.Dz3;

public class horseMove {
    static int n = 5;
    static int[][] board = new int[n][n];
    static int[][] moves = {{1, 2}, {1, -2}, {-1, 2}, {-1, -2}, {2, 1}, {2, -1}, {-2, 1}, {-2, -1}};
    static int step = 0;
    public static void main(String[] args) {

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                movesHorse(i, j);
                printArray(board);
                System.out.println();
                step = 0;
            }
        }
    }

    public static boolean movesHorse(int row, int col){
        if ((row < 0) || (row >= n) || (col < 0) || (col >= n)) return false;
        if (board[row][col] != 0 ) return false;

        step++;
        board[row][col] = step;

        if (step == n * n) return true;

        for (int i = 0; i < 8; i++) {
            if (movesHorse(row + moves[i][0], col + moves[i][1])) {
                return true;
            }
        }
        step--;
        board[row][col] = 0;
        return false;
    }
    public static void printArray(int [] [] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i][j] == 0) return;
                System.out.printf(" %2d", array[i][j]);
                array[i][j] = 0;
            }
            System.out.println();
        }
    }
}
