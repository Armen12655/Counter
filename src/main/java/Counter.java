public class Counter {
    private int count;

    public Counter() {
        this.count = 0;
    }

    public int getCount() {
        return count;
    }

    int incrementCount() {
        count++;
        return count;
    }

    int decrementCount() {
        count--;
        return count;
    }

    public Counter(int starting) {
        if(starting < 0)
            throw new IllegalArgumentException("must be greater then 0");
        else
            this.count = starting;
    }
}
