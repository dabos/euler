package ch1.exercises;

/**
 * @author alexandrubostan
 * @since 16.11.2014
 */
public class Ex7 {
    public static Runnable andThen(Runnable r1, Runnable r2) {
        return new Runnable() {
            public void run() {
                r1.run();
                r2.run();
            }
        };
    }

    public static void main(String[] args) {
        Runnable r = andThen(() -> System.out.println("First"),
                () -> System.out.println("Second")
        );
        new Thread(r).run();
    }
}
