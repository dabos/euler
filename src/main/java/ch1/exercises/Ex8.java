package ch1.exercises;

import java.util.*;

/**
 * @author alexandrubostan
 * @since 16.11.2014
 */
public class Ex8 {
    public static void main(String[] args) {
        String[] names = {"Peter", "Paul", "Mary"};
        List<Runnable> runners = new ArrayList<>();
        for (String name : names) {
            runners.add(() -> System.out.println(name));
        }
        runners.forEach((runnable) -> runnable.run());
    }
}
