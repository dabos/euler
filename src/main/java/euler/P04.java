package euler;

import eulerfm.Problem;


/**
 * Created by alexandrubostan on 16.08.2014.
 */
public class P04 extends Problem<Integer> {

    @Override
    public String getName() {
        return "Problem 04";
    }

    @Override
    public void run() {
        int max = 0;
        for (int i = 100; i <= 999; i++) {
            for (int j = 100; j <= 999; j++) {
                int p = i * j;
                if (isPalindrome(String.valueOf(p)) && p > max) {
                    max = p;
                }
            }
        }
        result = max;
    }

    public static boolean isPalindrome(String nr) {
        return nr.equals(new StringBuilder(nr).reverse().toString());
    }

}
