import com.sun.tools.javac.Main;
import figure.Circle;
import figure.Point;

import java.util.Random;

public class PointThread implements Runnable {
    private Point[] pointsTab;
    private static Random random = new Random();

    public PointThread(Point[] pointsTab) {
        this.pointsTab = pointsTab;
    }


    @Override
    public void run() {
        synchronized (Main.lock){
            for (int i = 0; i < pointsTab.length; i++) {
                pointsTab[i] = new Point(randomInRange(),randomInRange());
//                System.out.println("-----" + Point.getPointsDistance(pointsTab[i],Circle.getPointInCentre()));
//                System.out.println(pointsTab[i]);
                if(Point.getPointsDistance(pointsTab[i],Circle.getPointInCentre()) <= Circle.getR()) {
                    Main.pointsCircle++;
                }
                Main.pointsTotal++;
            }
        }

    }

    private static double randomInRange(){
        double x = random.nextDouble() * 2;
        if(x < 0){
            return x + 1;
        } else {
            return x - 1;
        }
    }
}
