package Pack.FieldPoint;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import java.util.Vector;

/**
 * Represents a FieldPoint in the simulation.
 * A FieldPoint has a position, a field strength, and can affect particles nearby.
 */
public class FieldPoint {
    // Attributes
    private Vector<Float> position; // Position vector, assumed to be 2D or 3D
    private float fieldStrength; // Strength of the field (could be positive or negative for attraction/repulsion)
    private String type; // Type of field, e.g., "attraction" or "repulsion"

    private Circle visualRepresentation; // JavaFX graphical representation

    // Constructor
    // Constructor
    public FieldPoint(Vector<Float> position, float fieldStrength, String type) {
        this.position = position;
        this.fieldStrength = fieldStrength;
        this.type = type;

        // Initialize the graphical representation
        this.visualRepresentation = new Circle(position.get(0), position.get(1), 10);

        // Set the color of the Circle based on the type of field
        if (type.equalsIgnoreCase("attraction")) {
            visualRepresentation.setFill(Color.BLUE); // Blue for attraction
        } else if (type.equalsIgnoreCase("repulsion")) {
            visualRepresentation.setFill(Color.RED);  // Red for repulsion
        } else {
            visualRepresentation.setFill(Color.GRAY); // Default for unknown types
        }
    }

    // Getter and Setter methods
    public Vector<Float> getPosition() {
        return position;
    }

    public void setPosition(Vector<Float> position) {
        this.position = position;

        // Update the graphical representation's position in JavaFX
        visualRepresentation.setCenterX(position.get(0));
        visualRepresentation.setCenterY(position.get(1));
    }

    public float getFieldStrength() {
        return fieldStrength;
    }

    public void setFieldStrength(float fieldStrength) {
        this.fieldStrength = fieldStrength;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;

        // Update the color of the graphical representation based on the new type
        if (type.equalsIgnoreCase("attraction")) {
            visualRepresentation.setFill(Color.BLUE);
        } else if (type.equalsIgnoreCase("repulsion")) {
            visualRepresentation.setFill(Color.RED);
        } else {
            visualRepresentation.setFill(Color.GRAY);
        }
    }

    /**
     * Calculates the force exerted by this FieldPoint on a particle based on distance.
     * @param particlePosition Position vector of the particle
     * @return Force vector applied to the particle
     */

//     @Override
// public String toString() {
//     return String.format("%s,%f,%s", position, fieldStrength, type);
// }

// public static FieldPoint parse(String line) {
//     try {
//         String[] parts = line.split(",");
//         Vector<Float> position = parseVector(parts[0]);
//         float strength = Float.parseFloat(parts[1]);
//         String type = parts[2];
//         return new FieldPoint(position, strength, type);
//     } catch (Exception e) {
//         System.err.println("Error parsing FieldPoint: " + line);
//         return null;
//     }
// }

// private static Vector<Float> parseVector(String vectorString) {
//     vectorString = vectorString.replace("[", "").replace("]", "");
//     Vector<Float> vector = new Vector<>();
//     for (String value : vectorString.split(", ")) {
//         vector.add(Float.parseFloat(value));
//     }
//     return vector;
// }

}
