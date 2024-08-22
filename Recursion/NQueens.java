public class NQueens {
    public static void nqueens(char[][]board, int row){
        int n = board.length;
        if(row==n){  // Base Case
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        return;
        }

        // Work and Recursion
        for(int j=0; j<n; j++){
            if(isSafe(board, row, j)){
                board[row][j] = 'Q';
                nqueens(board, row+1);
                board[row][j] = 'X';  // Backtracking
            }
        }
    }

    public static boolean isSafe(char[][] board, int row, int col){
        int n = board.length;
        // For row motion
        for(int j=0; j<n; j++){
            if(board[row][j] == 'Q') return false;
        }
        // For Column motion
        for(int i=0; i<n; i++){
            if(board[i][col] == 'Q') return false;
        }
        // For North east motion
        int i = row;
        int j = col;
        while(i>=0 && j<n){
            if(board[i][j] == 'Q') return false;
            i--;
            j++;
        }
        // For South east motion
        i = row;
        j = col;
        while(i<n && j<n){
            if(board[i][j] == 'Q') return false;
            i++;
            j++;
        }
        // For South west motion
        i = row;
        j = col;
        while(i<n && j>=0){
            if(board[i][j] == 'Q') return false;
            i++;
            j--;
        }
        // For North west motion
        i = row;
        j = col;
        while(i>=0 && j>=0){
            if(board[i][j] == 'Q') return false;
            i--;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        int n = 8;
        char[][] board = new char[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j] = 'X';
            }
        }
        nqueens(board, 0);
    }
}
