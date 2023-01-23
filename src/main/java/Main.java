import figure.Circle;
import figure.Point;
import figure.Square;

import java.util.*;

public class Main {

    public static List<Double> patrialPointsCyrcle = new ArrayList<>();
    public static final Object lock = new Object();
    public static int pointsTotal;
    public static int pointsCircle;
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ilość punktów dla jednego wątku (ilość punktów x ilość wątków (8)): ");
        int numberOfPoints = scanner.nextInt();

        Random rand = new Random();
        double pi = 0;
        double randomNumber = 0.0;

        Point pointSquare1 = new Point(1,1);
        Point pointSquare2 = new Point(-1,1);
        Point pointSquare3 = new Point(-1,-1);
        Point pointSquare4 = new Point(1,-1);
        Square square = new Square(pointSquare1,pointSquare2,pointSquare3,pointSquare4);
        Circle circle = new Circle(pointSquare1);
        System.out.println(square);
        System.out.println(circle);


        long startTime = System.currentTimeMillis();
        Point[] pointsTab = new Point[numberOfPoints];
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
        }catch (InterruptedException e) {}

        System.out.println("Points total = " + pointsTotal);
        System.out.println("Points in cyrcle = " + pointsCircle);

//        Thread thread1 = new Thread(new PointThread(incrementatorObject));
//        Thread thread2 = new Thread(new PointThread(incrementatorObject));
//        Thread thread3 = new Thread(new PointThread(incrementatorObject));
//
//        thread1.start();
//        thread2.start();
//        thread3.start();
//
//        try {
//            thread2.join();
//            thread3.join();
//            thread1.join();
//        } catch (InterruptedException e){}
        long endTime = System.currentTimeMillis();
        System.out.println("czas działania programu = " + (endTime - startTime) );
    }
}
