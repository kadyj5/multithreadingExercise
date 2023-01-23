public class IncrementatorObject {
    public synchronized void increment(){
        Main.counter.incrementAndGet();
        System.out.println(Main.counter);
    }
}
