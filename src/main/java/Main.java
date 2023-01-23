import figure.Circle;
import figure.Point;
import figure.SideSquare;
import figure.Square;

import java.util.Objects;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    // semafor
    public static final Object lock = new Object();
//    public static volatile  int counter = 0;
    public static int counter;
    public static void main(String[] args) {


        Random rand = new Random();
        IncrementatorObject incrementatorObject = new IncrementatorObject();
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


    }
}
