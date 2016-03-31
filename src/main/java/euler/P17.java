package euler;

/**
 * @author alexandrubostan
 * @since 02.07.2015
 */
public class P17 {
    public static String[] ones = new String[]{"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    public static String[] teens = new String[]{"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    public static String[] tens = new String[]{"twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
    public static String hundred = "hundred";
    public static String thousand = "thousand";

    public static void main(String[] args) {
        int r = 0;
        for (int i = 1; i <= 1000; i++) {
            int j = calculate(i);
            r += j;
            System.out.println(j);
        }
        System.out.println(r);
    }

    static int calculate(int i) {
        String r = "";

        if (i == 1000) {
            r += "onethousand";
            System.out.println(r);
            return r.length();
        }


        if (i < 1000 && i > 100)
        {
            if (i % 100 == 0) {
                r += ones[i / 100] + hundred;
                System.out.println(r);
                return r.length();
            }
            r += ones[i /100] + hundred;
            i = i % 100;
            r += "and";
        }

        if (i == 100) {
            r += "onehundred";
            System.out.println(r);
            return r.length();
        }

        if (i < 100 && i >= 20) {
            if (i % 10 == 0){
                r += tens[i / 10 -2];
                System.out.println(r);
                return r.length();
            }
            r += tens[i / 10 -2];
            r += ones[i % 10];
        }

        if (i < 20 && i >=10)
        {
            r += teens[i % 10];
        }

        if (i < 10)
            r += ones[i];
        System.out.println(r);
        return r.length();
    }
}
