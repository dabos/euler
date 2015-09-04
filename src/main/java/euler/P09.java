package euler;

import eulerfm.Problem;

/**
 * Created by alexandrubostan on 23.08.2014.
 */
public class P09 extends Problem<Long> {
    @Override
    public String getName() {
        return "Problem 9";
    }

    @Override
    public void run() {
      result = (long) triplet();
    }

    private static double triplet() {
        for (double i = 1; i < 1000 - 1; i++) {
            for (double j = i + 1; j < 1000 - 2; j++) {
                double r = Math.sqrt(i * i + j * j);
                if (i + j + r == 1000) {
                    return i * j * r;
                }
            }
        }
        return 0;
    }
}
