package euler;

/**
 * Created by alexandrubostan on 17.08.2014.
 */
public class EulerUtils {
    public static boolean isPrime(int n) {
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (int i = 3, end = n / 2; i < end; i+=2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(4));
    }
}
