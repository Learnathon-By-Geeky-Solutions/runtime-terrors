import java.util.ArrayList;

public class Graph {
    static class edge {
        int src;
        int destination;

        public edge(int src, int destination) {
            this.src = src;
            this.destination = destination;
        }
    }

    public static void createGraph(ArrayList<edge> graph[])
    {
        for(int i=0;i< graph.length;i++)
        {
            graph[i]=new ArrayList<edge>();
        }
        graph[0].add(new edge(0,2));
        graph[1].add(new edge(1,2));
        graph[1].add(new edge(1,3));
        graph[2].add(new edge(2,0));
        graph[2].add(new edge(2,1));
        graph[2].add(new edge(2,3));
        graph[3].add(new edge(3,2));
        graph[3].add(new edge(3,1));
    }
    public static void main(String[] args) {
        int v=4;
        ArrayList<edge>graph[]=new ArrayList[v];

    }
}
