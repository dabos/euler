package test;

/**
 * Created by alexandrubostan on 05.02.2015.
 */
public class Fibz {
    public static void main(String[] args) {
        int prev = 0;
        int next = 1;
        int res = 0;

        for (int i = 0; i < 20; i++) {
            res = prev + next;
            System.out.println(res);
            prev = next;
            next = res;
        }
    }
}
