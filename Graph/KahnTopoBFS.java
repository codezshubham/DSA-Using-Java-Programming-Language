import java.util.*;

public class KahnTopoBFS {
    public static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 1));
        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));
        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));
    }

    public static void kahnAlgo(ArrayList<Edge> graph[], int V) {
        int[] indegree = new int[V];
        for (int i = 0; i < V; i++) {
            for (Edge edge : graph[i]) {
                indegree[edge.dest]++;
            }
        }

        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < V; i++) {
            if (indegree[i] == 0) {
                q.add(i);
            }
        }

        int[] topo = new int[V];
        int i = 0;
        while (!q.isEmpty()) {
            int node = q.remove();
            topo[i++] = node;

            for (Edge edge : graph[node]) {
                indegree[edge.dest]--;
                if (indegree[edge.dest] == 0) {
                    q.add(edge.dest);
                }
            }
        }

        for (int z = 0; z < V; z++) {
            System.out.print(topo[z] + " ");
        }
    }

    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        kahnAlgo(graph, V);
    }
}
