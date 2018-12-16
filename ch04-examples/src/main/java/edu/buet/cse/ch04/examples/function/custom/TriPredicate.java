package edu.buet.cse.ch04.examples.function.custom;

@FunctionalInterface
public interface TriPredicate<T, U, V> {
  boolean test(T t, U u, V v);
}
