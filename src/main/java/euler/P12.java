package euler;

import java.util.ArrayList;

/**
 * @author alexandrubostan
 * @since 12.02.2015
 */
public class P12 {
    public static void main(String[] args) {
        triangleNumbers();
    }


    private static void triangleNumbers() {
        ArrayList<Integer> list = new ArrayList();
        int i = 1;
        while(true){
            list.add(i);
            int triangleNr = list
                    .stream()
                    .mapToInt(x -> x)
                    .sum();

            if (calculateDivisors(triangleNr) >= 500) {
                System.out.println(triangleNr);
                break;
            }
            i++;
        }
    }

    private static int calculateDivisors(int triangleNr) {
        int count = 0;
        for (int i = 1; i < Math.sqrt(triangleNr); i++) {
            if (triangleNr % i == 0) {
                count+=2;
            }
        }
        if (Math.sqrt(triangleNr) * Math.sqrt(triangleNr) == triangleNr) {
            count++;
        }
        return count;
    }
}
