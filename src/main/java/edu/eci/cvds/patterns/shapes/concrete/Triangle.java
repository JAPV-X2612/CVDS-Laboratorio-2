package edu.eci.cvds.patterns.shapes.concrete;

import edu.eci.cvds.patterns.shapes.Shape;

public class Triangle implements Shape {
    private int edges;

    public Triangle() {
        edges = 3;
    }
    
    public int getNumberOfEdges() {
        return edges;
    }
}