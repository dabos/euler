package euler;

import java.math.BigInteger;

/**
 * Created with IntelliJ IDEA.
 * @author Alex Bostan (alex.bostan@hostelworld.com)
 * @version $Id$
 * @since 1.0
 */
public class P25 {
    public static void main(String[] args) {
        BigInteger a = BigInteger.ONE; BigInteger b = BigInteger.valueOf(2);
        Integer index = 3;
        BigInteger res = BigInteger.ZERO;
        BigInteger c = BigInteger.TEN.pow(1000-1);

        while (res.compareTo(c) != 1){
            res = a.add(b);
            a = b;
            b = res;
            index++;

            System.out.println(res +"  F" + index);
        }

    }
}
