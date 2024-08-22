public class RatInAMaze2Direction {
    public static void maze(int sr, int sc, int er, int ec, String s){
        if(sr>er || sc>ec) return;
        if(sr==er && sc==ec){
            System.out.println(s);
            return;
        }
        // Go right
        maze(sr, sc+1, er, ec, s+"R");
        // Go Down
        maze(sr+1, sc, er, ec, s+"D");
    }
    public static void main(String[] args) {
        int rows = 3;
        int cols = 3;
        maze(1, 1, rows, cols, " ");
    }
}
