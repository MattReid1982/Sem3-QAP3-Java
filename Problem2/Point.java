package Problem2;

public class Point {
    private float x;
    private float y;
    
    // Default constructor
    public Point() {
        x = 0.0f;
        y = 0.0f;
    }

    // Constructor with parameters
    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // Getters 
    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    // Setters
    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    // Set both coordinates
    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // Return both coordinates
    public float[] getXY() {
        return new float[]{x, y};
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
