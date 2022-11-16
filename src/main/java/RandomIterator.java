import java.util.Iterator;
import java.util.Random;

public class RandomIterator implements Iterator<Integer> {
    private Random rnd;
    private int min, max;

    public RandomIterator(Random rnd, int min, int max) {
        if (max <= min) {
            throw new IllegalArgumentException("max <= min");
        }
        this.rnd = rnd;
        this.min = min;
        this.max = max;
    }

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Integer next() {
        return rnd.nextInt(max - min + 1) + min;
    }
}
