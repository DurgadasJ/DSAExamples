package hackerRank;

import java.util.Objects;

public class Edge implements Comparable<Edge>{
    public final int fromNode;

    public final int toNode;

    public Edge(int fromNode, int toNode) {
        this.fromNode = fromNode;
        this.toNode = toNode;
    }

    public static Edge createEdge(int fromNode,int toNode){
        return new Edge(fromNode,toNode);
    }

    @Override
    public boolean equals(Object o){
        if(this ==o ) return true;
        if(!(o instanceof Edge)) return false;

        Edge edge = (Edge) o;

        return fromNode == edge.fromNode && toNode == edge.toNode;
    }

    @Override
    public int hashCode(){
        return Objects.hash(fromNode,toNode);
    }
    @Override
    public int compareTo(Edge o) {
        if(this.fromNode != o.fromNode){
            return Integer.compare(this.fromNode,o.fromNode);
        }

        return Integer.compare(this.toNode,o.toNode);
    }

    @Override
    public String toString(){
        return fromNode + ", laterThan "+toNode;
    }
}
