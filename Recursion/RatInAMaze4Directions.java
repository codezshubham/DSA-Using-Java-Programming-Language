public class RatInAMaze4Directions {
    public static void maze(int sr, int sc, int er, int ec, String s, boolean[][] isVisited){
        if(sr<0 || sc<0) return;
        if(sr>er || sc>ec) return;
        if(isVisited[sr][sc] == true) return;
        if(sr==er && er==ec){
            System.out.println(s);
            return;
        }
        isVisited[sr][sc] = true;
        //Go right
        maze(sr, sc+1, er, ec, s+"R", isVisited);
        //Go down
        maze(sr+1, sc, er, ec, s+"D", isVisited);
        //Go left
        maze(sr, sc-1, er, ec, s+"L", isVisited);
        //Go up
        maze(sr-1, sc, er, ec, s+"U", isVisited);

        // Backtracing
        isVisited[sr][sc] = false;
    }
    public static void main(String[] args) {
        int rows = 3;
        int cols = 3;
        boolean[][] isVisited = new boolean[rows][cols];  // By default 2-D array filled with false
        maze(0, 0, rows-1, cols-1, " ", isVisited);
    }
}
