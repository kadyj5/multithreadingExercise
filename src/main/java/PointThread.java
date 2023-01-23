public class PointThread implements Runnable {
    IncrementatorObject incrementatorObject;

    public PointThread(IncrementatorObject incrementatorObject){
        this.incrementatorObject = incrementatorObject;
    }

    @Override
    public void run() {
        for(int i = 0; i < 1000; i++){
            this.incrementatorObject.increment();
        }
    }
}
