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
        synchronized (App.lock){
            for (int i = 0; i < pointsTab.length; i++) {
                pointsTab[i] = new Point(randomInRange(),randomInRange());
                if(Point.getPointsDistance(pointsTab[i],Circle.getPointInCentre()) <= Circle.getR()) {
                    App.pointsCircle++;
                    if(randomInRange() < 0)
                        App.patrialPointsCyrcle.add(pointsTab[i]);
                }
                App.pointsTotal++;
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
