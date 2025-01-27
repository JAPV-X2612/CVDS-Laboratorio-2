package edu.eci.cvds.patterns.shapes.concrete;

import edu.eci.cvds.patterns.shapes.Shape;

public class Hexagon implements Shape {
    private int edges;

    public Hexagon() {
        edges = 6;
    }
    
    public int getNumberOfEdges() {
        return edges;
    }
}