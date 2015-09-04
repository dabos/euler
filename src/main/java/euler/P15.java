package euler;

/**
 * @author alexandrubostan
 * @since 28.06.2015
 */
public class P15 {
    public static void main(String[] args) {
        System.out.println(Library.binomial(40, 20));
    }

    private static int paths(int n, int m) {
        if (n == 1 || m == 1)
            return 1;
        return paths(n-1, m) + paths(n, m-1);
    }
}
