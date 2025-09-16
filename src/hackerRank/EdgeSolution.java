package hackerRank;

import java.util.*;

public class EdgeSolution {
    public static void main(String[] args) {
        Edge edge1 = Edge.createEdge(1,5);
        Edge edge2 = Edge.createEdge(2,3);
        Edge edge3 = Edge.createEdge(1,5);
        Edge edge4 = Edge.createEdge(4,2);

        Set<Edge> edges =new HashSet<>();

        edges.add(edge1);
        edges.add(edge2);
        edges.add(edge3);
        edges.add(edge4);

        List<Edge> sortedEdges = new ArrayList<>(edges);
        Collections.sort(sortedEdges);

        for(Edge edge: sortedEdges){
            System.out.println(edge);
        }
    }
}
