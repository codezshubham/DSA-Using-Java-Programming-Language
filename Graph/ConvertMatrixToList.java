import java.util.ArrayList;

public class ConvertMatrixToList {
    public void findCircleNum(int[][] isConnected) {
        int V =isConnected.length;
        ArrayList<Integer> graph[] = new ArrayList[V];
        for(int i=0;i<V;i++)
        {
            graph[i] = new ArrayList<>();
        }
        for(int i=0; i<V; i++)
        {
            for(int j=0; j<V; j++)
            {
                if(isConnected[i][j]==1 && i!=j)
                {
                    graph[i].add(j);
                }

            }
        }
    }
}
