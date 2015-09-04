package eulerfm;

/**
 * Created by alexandrubostan on 05.08.2014.
 */
public abstract class Problem<T> implements Runnable {
    protected T result;

    public String getResult() {
        return String.valueOf(result);
    }

    abstract public String getName();
}
