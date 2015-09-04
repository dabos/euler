package euler;

import eulerfm.Problem;

/**
 * Created by alexandrubostan on 17.08.2014.
 */
public class P05 extends Problem<Integer> {
    @Override
    public String getName() {
        return "Problem 5";
    }

    @Override
    public void run() {
        result = findSmallestMultiple();
    }

    private int findSmallestMultiple() {
        int ans = 0;
        int nr = 2520;
        while (true) {
            if (nrIsDivisible(nr)){
                break;
            }
            nr ++ ;
        }
        return nr;
    }

    private boolean nrIsDivisible(int nr) {
        boolean ans = false;
        for (int i = 2; i <= 20; i++) {
            if (nr % i == 0) {

            } else {

                return false;
            }
        }
        return true;
    }
}
