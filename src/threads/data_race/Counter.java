package threads.data_race;

public class Counter {
    private int count;

    public Counter(int initialCount) {
        count = initialCount;
    }

    public void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}
