package euler;

import eulerfm.Problem;

import java.util.stream.IntStream;

/**
 * Created by alexandrubostan on 04.08.2014.
 */
public class P01 extends Problem<Integer>{

    @Override
    public String getName() {
        return "Problem 1";
    }

    @Override
    public void run() {

        result = p01_functional();
    }

    private static int p01_functional() {
        return IntStream
                .range(1, 1000)
                .filter((i) -> i % 3 == 0 || i % 5 == 0)
                .sum();
    }

    private static int p01() {
        int sum = 0;
        for (int i = 0; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
