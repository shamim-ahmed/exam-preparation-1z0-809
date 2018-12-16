package edu.buet.cse.ch04.examples.function.custom;

@FunctionalInterface
public interface TriFunction<T, U, V, R> {
  R apply(T t, U u, V v);
}
