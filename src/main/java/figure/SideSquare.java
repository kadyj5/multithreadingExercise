package figure;

public class SideSquare{
    private final Point point1;
    private final Point point2;

    public SideSquare(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Side:\n")
                .append("A: ").append(point1)
                .append("B: ").append(point2)
                .append("\n");
        return sb.toString();
    }
}
