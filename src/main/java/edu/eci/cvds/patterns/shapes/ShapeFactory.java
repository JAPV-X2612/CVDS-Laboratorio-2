package edu.eci.cvds.patterns.shapes;

import edu.eci.cvds.patterns.shapes.concrete.*;

public class ShapeFactory {

    /**
     * Creates a Shape object based on the provided RegularShapeType.
     *
     * @param type the RegularShapeType indicating the type of shape to create
     * @return the corresponding Shape object
     * @throws IllegalArgumentException if the provided RegularShapeType is unknown
     */
    public static Shape create(RegularShapeType type) {
        switch (type) {
            case Triangle:
                return new Triangle();
            case Quadrilateral:
                return new Quadrilateral();
            case Pentagon:
                return new Pentagon();
            case Hexagon:
                return new Hexagon();
            default:
                throw new IllegalArgumentException("Unknown shape type: " + type);
        }
    }
}