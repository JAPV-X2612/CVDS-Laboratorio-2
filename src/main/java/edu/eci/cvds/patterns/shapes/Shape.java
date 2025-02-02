package edu.eci.cvds.patterns.shapes;

/**
 * Interface representing a geometric shape.
 * The implementing classes should provide a concrete definition 
 * for the method that returns the number of edges of the shape.
 */
public interface Shape {

    /**
     * Returns the number of edges of the shape.
     * @return the number of edges
     */
    public int getNumberOfEdges();
}
