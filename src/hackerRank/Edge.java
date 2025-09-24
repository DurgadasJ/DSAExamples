package hackerRank;

import java.util.Objects;

// The Edge class represents a directed edge in a graph, connecting two nodes: fromNode and toNode.
// It implements the Comparable interface to allow for sorting of Edge objects based on their node connections.
// The class includes methods for creating edges, comparing edges, checking equality, generating hash codes, and providing
// string representations of edges.
// This class is useful for graph algorithms and data structures that require edge representation and manipulation.
public class Edge implements Comparable<Edge>{
    public final int fromNode;

    public final int toNode;

    // Constructor to initialize the Edge object with the specified fromNode and toNode values.
    // These values represent the starting and ending nodes of the edge, respectively.
    // The constructor is marked as public, allowing it to be accessed from outside the class.
    // The fromNode and toNode fields are declared as final, indicating that their values cannot be changed after the
    // object is created.
    // This ensures that the edge remains immutable, which is important for maintaining the integrity of the graph structure.

    public Edge(int fromNode, int toNode) {
        this.fromNode = fromNode;
        this.toNode = toNode;
    }

    //what below method does
    // It is a static factory method that creates and returns a new Edge object with the
    // specified fromNode and toNode values.
    public static Edge createEdge(int fromNode,int toNode){
        return new Edge(fromNode,toNode);
    }

    // Override the equals method to compare two Edge objects based on
    // their fromNode and toNode values.
    // This ensures that two Edge objects are considered equal if they connect the same nodes.

    @Override
    public boolean equals(Object o){
        if(this ==o ) return true;
        if(!(o instanceof Edge)) return false;

        Edge edge = (Edge) o;

        return fromNode == edge.fromNode && toNode == edge.toNode;
    }

    // Override the hashCode method to generate a hash code for the Edge object
    // based on its fromNode and toNode values.
    // This is important for using Edge objects in hash-based collections like HashSet or HashMap.
    // It ensures that equal Edge objects produce the same hash code.
    // The Objects.hash method is a convenient way to generate a hash code from multiple fields.
    // It combines the hash codes of the specified fields into a single hash code.
    // This is useful for ensuring that the hash code is consistent with the equals method.
    // By using Objects.hash, we can easily create a hash code that takes into account both the fromNode and toNode values.
    // This helps to maintain the integrity of hash-based collections when Edge objects are used as keys or stored in sets.
    // Overall, overriding the hashCode method in this way is essential for ensuring that Edge objects behave correctly in
    // hash-based collections and that their equality is properly defined.
    @Override
    public int hashCode(){
        return Objects.hash(fromNode,toNode);
    }

    // Implement the compareTo method to define the natural ordering of Edge objects.
    // This method compares two Edge objects based on their fromNode and toNode values.
    // The comparison is done first by fromNode, and if they are equal, then by toNode.
    // This allows Edge objects to be sorted in a consistent manner.
    // The compareTo method returns a negative integer, zero, or a positive integer
    // as this Edge is less than, equal to, or greater than the specified Edge.
    // This is useful for sorting Edge objects in collections like lists or arrays.
    // By implementing the Comparable interface and defining the compareTo method,
    // we enable Edge objects to be compared and ordered based on their node connections.
    // This is particularly useful in scenarios where we need to sort or prioritize edges in a graph or network.
    // Overall, the compareTo method provides a way to establish a natural ordering for Edge objects,
    @Override
    public int compareTo(Edge o) {
        if(this.fromNode != o.fromNode){
            return Integer.compare(this.fromNode,o.fromNode);
        }

        return Integer.compare(this.toNode,o.toNode);
    }

    // Override the toString method to provide a string representation of the Edge object.
    // This method returns a string that describes the edge in the format "fromNode, laterThan toNode".
    // This is useful for debugging and logging purposes, as it allows us to easily visualize the connection between nodes.
    // By overriding the toString method, we can customize how Edge objects are represented as strings,
    @Override
    public String toString(){
        return fromNode + ", laterThan "+toNode;
    }
}
