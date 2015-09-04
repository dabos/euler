package ch1.exercises;

import java.util.*;
import java.util.function.*;

/**
 * @author alexandrubostan
 * @since 16.11.2014
 */
public interface Collection2<T> extends Collection<T> {

      default void forEachIf(Consumer<T> action, Predicate<T> predicate){
         forEach(
                 a -> {
                       if(predicate.test(a)){
                             action.accept(a);
                       }
                 }
         );
      }

}
