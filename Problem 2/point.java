public class Point {
    private float x;
    private float y;

    public point(float x, float y) {
        this.x = 0.0f;
        this.y = 0.0f;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public float[] getXY() {
        return new float[2]{x, y};
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}