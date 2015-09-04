package euler;

import eulerfm.Problem;

import static euler.EulerUtils.isPrime;

/**
 * Created by alexandrubostan on 17.08.2014.
 */
public class P07 extends Problem<Integer> {
    @Override
    public String getName() {
        return "Problem 7";
    }

    @Override
    public void run() {
        for (int i = 2, c = 0; ; i++) {
            if (isPrime(i)) {
                c++;
                if (c == 10001) {
                    result = i;
                    break;
                }
            }
        }

    }
}
