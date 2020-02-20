public class Point {

    double x;
    double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point d1) {
        return Math.sqrt((d1.x - this.x) * (d1.x - this.x) + (d1.y - this.y) * (d1.y - this.y));
    }
}
