import java.util.*;
public class TarjanArticulationPoint {
    public static class Edge{
        int src;
        int dest;

        public Edge(int s , int d){
            this.src = s;
            this.dest = d;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0; i<graph.length; i++){       
            graph[i] = new ArrayList<Edge>();    
        }
                                            
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));
        graph[0].add(new Edge(0,3));

        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,2));

        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,1));

        graph[3].add(new Edge(3,0));
        graph[3].add(new Edge(3,4));

        graph[4].add(new Edge(4,3));
        
    }
    public static void dfs(ArrayList<Edge> graph[], int curr, boolean[] vis,
             int[] dt, int[] low, int time, int par, boolean[] ap){
                vis[curr] = true;
                dt[curr]=low[curr]=++time;
                int children = 0;

                for(int i=0; i<graph[curr].size(); i++){
                    Edge e = graph[curr].get(i);
                    int neigh = e.dest;

                    if(neigh==par) continue;
                    else if(!vis[neigh]){
                        dfs(graph, neigh, vis, dt, low, time, curr, ap);
                        low[curr] = Math.min(low[curr], low[neigh]);
                        if(dt[curr] <= low[neigh] && par!=-1){
                            ap[curr] = true;
                        }
                    }
                    else{
                        low[curr] = Math.min(low[curr], dt[neigh]);
                    }
                    children++;
                }

                if(par == -1 && children>1){
                    ap[curr] = true;
                }
             }
    public static void tarjanAlgo(ArrayList<Edge> graph[], int V){
        int[] dt = new int[V];
        int[] low = new int[V];
        boolean[] vis = new boolean[V];
        boolean[] ap = new boolean[V];
        int time = 0;

        for(int i=0; i<V; i++){
            if(!vis[i]){
                dfs(graph, i, vis, dt, low, time, -1, ap);
            }
        }

        for(int i=0; i<V; i++){
            if(ap[i]){
                System.out.println("Ap is :"+ i);
            }
        }
    }
    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        tarjanAlgo(graph, V);
    }
}