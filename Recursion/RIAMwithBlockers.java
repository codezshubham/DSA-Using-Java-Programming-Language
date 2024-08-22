public class RIAMwithBlockers {
        public static void mazeFunc(int sr, int sc, int er, int ec, String s, int[][] maze){
            if(sr<0 || sc<0) return;
            if(sr>er || sc>ec) return;
            if(sr==er && sc==ec){
                System.out.println(s);
                return;
            }
             if(maze[sr][sc]== 0) return;  // Blocker
            if(maze[sr][sc] == -1) return;  // true , Already Visited
            // check
            maze[sr][sc] = -1;  //true
            //Go right
            mazeFunc(sr, sc+1, er, ec, s+"R", maze);
            //Go down
            mazeFunc(sr+1, sc, er, ec, s+"D", maze);
            //Go left
            mazeFunc(sr, sc-1, er, ec, s+"L", maze);
            //Go up
            mazeFunc(sr-1, sc, er, ec, s+"U", maze);
    
            // Backtracing
            maze[sr][sc] = 1; //false
        }
        public static void main(String[] args) {
            int rows = 3;
            int cols = 4;
            int[][] maze = {{1, 0, 1, 1},
                            {1, 1, 1, 1},
                            {1, 1, 0, 1}};
            mazeFunc(0, 0, rows-1, cols-1, "", maze);
        }
    }
    

