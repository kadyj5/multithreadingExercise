public class IncrementatorObject {
    public synchronized void increment(){
        Main.counter++;
        System.out.println(Main.counter);
    }
}
