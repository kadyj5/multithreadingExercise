package figure;

import static figure.Point.getPointsDistance;

public class Circle {
    private final Point point;
    private final Point middlePoint;
    private final double r;

    public Circle(Point point) {
        this.middlePoint = new Point(0,0);
        this.point = new Point(0,point.getY());
        this.r = getPointsDistance(middlePoint,this.point);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Circle:\n");
        sb.append(point)
                .append(middlePoint)
                .append("\nr = ")
                .append(r)
                .append("\n");
        return sb.toString();
    }
}
