package threads.data_race;

public class Main {

    public static void main(String[] args) {
        Counter counter = new Counter(0);

        Incrementor incrementor = new Incrementor(counter);

        Thread t1 = new Thread(incrementor);
        Thread t2 = new Thread(incrementor);
        Thread t3 = new Thread(incrementor);

        t1.start();
        t2.start();
        t3.start();
    }
}
