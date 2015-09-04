package ch1.exercises;

/**
 * @author alexandrubostan
 * @since 16.11.2014
 */
public class Ex6 {
    public static void main(String[] args) {
        new Thread(uncheck(
                () -> {
                    System.out.println("Zzz");
                    Thread.sleep(1000);
                }
        )).start();
    }

    private static Runnable uncheck(RunnableEx runner) {
        return () -> {
            try {
                runner.run();
            } catch (Exception ex) {
                throw new RuntimeException(ex);
            }
        };
    }
}
