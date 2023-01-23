package figure;

import static figure.Point.getPointsDistance;

public class Circle {
    private final Point point;
    private static final Point pointInCentre = new Point(0,0);;
    private static double r;

    public Circle(Point point) {
        this.point = new Point(0,point.getY());
        this.r = getPointsDistance(pointInCentre,this.point);
    }

    public static Point getPointInCentre() {
        return pointInCentre;
    }

    public static double getR() {
        return r;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Circle:\n");
        sb.append(point)
                .append(pointInCentre)
                .append("\nr = ")
                .append(r)
                .append("\n");
        return sb.toString();
    }

}
