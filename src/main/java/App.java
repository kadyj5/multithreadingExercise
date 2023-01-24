import figure.Circle;
import figure.Point;
import figure.Square;

import java.util.*;

public class App {
    public static List<Point> patrialPointsCyrcle = new ArrayList<>();
    public static final Object lock = new Object();
    public static int pointsTotal = 0;
    public static int pointsCircle = 0;

    public static void main(String[] args) {
        Point pointSquare1 = new Point(1,1);
        Point pointSquare2 = new Point(-1,1);
        Point pointSquare3 = new Point(-1,-1);
        Point pointSquare4 = new Point(1,-1);
        Square square = new Square(pointSquare1,pointSquare2,pointSquare3,pointSquare4);
        Circle circle = new Circle(pointSquare1);

        System.out.println(square);
        System.out.println(circle);

        Point[] pointsTab = new Point[1000000];
        Thread thread1 = new Thread(new PointThread(pointsTab));
        Thread thread2 = new Thread(new PointThread(pointsTab));
        Thread thread3 = new Thread(new PointThread(pointsTab));
        Thread thread4 = new Thread(new PointThread(pointsTab));
        Thread thread5 = new Thread(new PointThread(pointsTab));
        Thread thread6 = new Thread(new PointThread(pointsTab));
        Thread thread7 = new Thread(new PointThread(pointsTab));
        Thread thread8 = new Thread(new PointThread(pointsTab));

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();
        thread7.start();
        thread8.start();

        try{
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
            thread5.join();
            thread6.join();
            thread7.join();
            thread8.join();
        }catch (InterruptedException ignored) {}

        System.out.println("Points total = " + pointsTotal);
        System.out.println("Points in cyrcle = " + pointsCircle);
        System.out.println("Partial points in cyrcle = " + patrialPointsCyrcle.size());
        System.out.println("PPIT / PIC = " + ( (double)pointsCircle / (double) patrialPointsCyrcle.size()));
        System.out.println("PI = " + piCount(square));
    }

    static double piCount(Square square){
        return square.squareArea() / ((double) pointsTotal / (double) pointsCircle) / Math.pow(Circle.getR(),2);

    }
}
