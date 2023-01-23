package figure;

import java.util.Arrays;

public class Square{
    private final SideSquare[] sides = new SideSquare[4];
    private final double sideSize;
    public Square(Point point1, Point point2, Point point3, Point point4) {
            this.sides[0] = new SideSquare(point1,point2);
            this.sides[1] = new SideSquare(point2,point3);
            this.sides[2] = new SideSquare(point3,point4);
            this.sides[3] = new SideSquare(point4,point1);
            this.sideSize = getSideSize(point1,point2);

    }

    private static double getSideSize(Point point1, Point point2){
        return Math.sqrt( Math.pow(point1.getX() - point2.getX(),2) + (Math.pow(point1.getY() - point2.getY(),2)));
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
