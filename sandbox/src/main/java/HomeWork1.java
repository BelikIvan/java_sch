public class HomeWork1 {

    public static void main(String[] args) {
        Point dot1 = new Point(2,4);
        Point dot2 = new Point(3,7);

        System.out.println("Расстояние между двумя точками = " + distance(dot1, dot2));
        System.out.println("Расстояние между двумя точками = " + dot1.distance(dot2));

    }

    public static double distance(Point p1, Point p2) {
        return Math.sqrt((p2.x - p1.x) * (p2.x - p1.x) + (p2.y - p1.y) * (p2.y - p1.y));
    }
}
