package problem6;

public class Circle extends Forme {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override 
    public double erea() {
        return Math.PI * radius * radius;
    }

    @Override 
    public String toString() {
        return "Circle (radius " + radius + " cm)";
    }
}
