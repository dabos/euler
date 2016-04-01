package euler;

import eulerfm.Problem;

/**
 * Created with IntelliJ IDEA.
 * @author Alex Bostan (alex.bostan@hostelworld.com)
 * @version $Id$
 * @since 1.0
 */
public class P19 extends Problem<Integer> {
    @Override
    public String getName() {
        return "Problem 19";
    }

    @Override
    public void run() {
        int sundays = 0;

        for (int y = 1901; y <= 2000; y++) {
            for (int m = 3; m <= 14; m++) {
                if (zeller(m, y) - 1 == 0)
                    sundays += 1;
            }
        }
    }

    private int zeller(int m, int y) {
        return (1 + (13 * (m + 1)) / 5 + (y % 100) + (y % 100) / 4 + (y / 100) / 4 + 5 * (y / 100)) % 7;
    }

}
