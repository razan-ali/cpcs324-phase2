/**
 * cpcs324 project
 */
package cpcs324_project2_phase2;

/**
 * represent the edge of graph
 * 
 * implemented the Comparable interface to compare the weights of edges 
 * @author razan, tahani, asma 
 */
public class Edge{
    /**
     * source vertex of edge 
     */
    Vertex source; 
    /**
     * target vertex of edge 
     */
    Vertex target; 
    /**
     * edge weight 
     */
    int weight;    
    /**
     * empty constructor of class
     */
    public Edge() {
        
    }
    /**
     *  constructor
     * @param weight  weight of edge
     */
    public Edge(int weight) {
        this.weight = weight;
    }
    
    /**
     * constructor with parameters
     * 
     * @param source source vertex of edge 
     * @param target target vertex of edge 
     * @param weight edge weight 
     */
    public Edge(Vertex source, Vertex target, int weight) {
        this.source = source;
        this.target = target;
        this.weight = weight;
        
    }   
   
    /**
     * 
     * @return string that print edge 
     */
    @Override
    public String toString() {
        return "source "+source.label + "-" +"destenation "+ target.label + ": " + weight;
    }
}
