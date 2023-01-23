package figure;

public class Point{
    private final double x;
    private final double y;

    public Point(double x,double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public static double getPointsDistance(Point point1, Point point2){
        return Math.sqrt( Math.pow(point1.getX() - point2.getX(),2) + (Math.pow(point1.getY() - point2.getY(),2)));
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Point = ");
        sb.append("(").append(getX());
        sb.append(",").append(getY());
        sb.append(")\n");
        return sb.toString();
    }
}
