public class NKnights {
    static int maxKnights = -1;
    static int number = 8;

    public static boolean isSafe(char[][] board, int row, int col) {
        int n = board.length;
        int i, j;
        // 2 UP and 1 Right
        i = row - 2;
        j = col + 1;
        if (i >= 0 && j < n && board[i][j] == 'K')
            return false;
        // 2 Up and 1 Left
        i = row - 2;
        j = col - 1;
        if (i >= 0 && j >= 0 && board[i][j] == 'K')
            return false;

        // 2 Down and 1 Right
        i = row + 2;
        j = col + 1;
        if (i < n && j < n && board[i][j] == 'K')
            return false;
        // 2 Down and 1 Left
        i = row + 2;
        j = col - 1;
        if (i < n && j >= 0 && board[i][j] == 'K')
            return false;

        // 2 Left and 1 Up
        i = row - 1;
        j = col - 2;
        if (i >= 0 && j >= 0 && board[i][j] == 'K')
            return false;
        // 2 Left and 1 Down
        i = row + 1;
        j = col - 2;
        if (i < n && j >= 0 && board[i][j] == 'K')
            return false;

        // 2 Right and 1 Up
        i = row - 1;
        j = col + 2;
        if (i >= 0 && j < n && board[i][j] == 'K')
            return false;
        // 2 Right and 1 Down
        i = row + 1;
        j = col + 2;
        if (i < n && j < n && board[i][j] == 'K')
            return false;
        return true;
    }

    public static void nknights(char[][] board, int row, int col, int num) {
        int n = board.length;
        if (row == n) {
            if (num == number) {
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        System.out.print(board[i][j]);
                    }
                    System.out.println();
                }
                System.out.println();
            }
            maxKnights = Math.max(maxKnights, num);
            return;
        } else if (isSafe(board, row, col)) {
            board[row][col] = 'K';
            if (col != n - 1)
                nknights(board, row, col + 1, num + 1);
            else
                nknights(board, row + 1, 0, num + 1);
            board[row][col] = 'x';  // Backtracking
        }
        if (col != n - 1)
            nknights(board, row, col + 1, num);
        else
            nknights(board, row + 1, 0, num);
    }

    public static void main(String[] args) {
        int n = 4;
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'x';
            }
        }
        nknights(board, 0, 0, 0);
        System.out.print(maxKnights);
    }
}
