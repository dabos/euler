package eulerfm;

import euler.*;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by alexandrubostan on 05.08.2014.
 */
public class ProjectEuler {
    private final List<Problem<?>> problems = new ArrayList<>();

    private void init() {
        problems.add(new P01());
        problems.add(new P02());
        problems.add(new P03());
        problems.add(new P04());
        problems.add(new P05());
        problems.add(new P06());
        problems.add(new P07());
        problems.add(new P08());
        problems.add(new P09());
        problems.add(new P10());
        problems.add(new P11());

        process();
    }

    private void process() {
        problems.stream().forEachOrdered(new ProblemConsumer());
    }

    public static void main(String[] args) {
        new ProjectEuler().init();
    }

    private class ProblemConsumer implements Consumer<Problem<?>> {

        @Override
        public void accept(Problem<?> problem) {
            long start = System.nanoTime();

            problem.run();

            String result = problem.getResult();
            long end = System.nanoTime();
            long elapsed = end - start;
            System.out.println(problem.getName() + ": " + result + " ("
                    + String.format("%d", (elapsed / 1_000_000)) + " ms" + ")");
        }
    }
}
