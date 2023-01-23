package figure;

import java.util.Arrays;
import java.util.Map;

import static figure.Point.getPointsDistance;

public class Square{
    private final SideSquare[] sides = new SideSquare[4];
    private final double sideSize;
    public Square(Point point1, Point point2, Point point3, Point point4) {
            this.sides[0] = new SideSquare(point1,point2);
            this.sides[1] = new SideSquare(point2,point3);
            this.sides[2] = new SideSquare(point3,point4);
            this.sides[3] = new SideSquare(point4,point1);
            this.sideSize = getPointsDistance(point1,point2);

    }
    public double squareArea(){
        return Math.pow(this.sideSize,2);
    }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Square sides:\n");
        for (SideSquare s: sides) {
            sb.append(s);
        }
        sb.append("Side size = ")
                .append(this.sideSize)
                .append("\n");
        return sb.toString();
    }
}
