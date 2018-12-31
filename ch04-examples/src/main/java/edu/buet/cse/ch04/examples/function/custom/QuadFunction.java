package edu.buet.cse.ch04.examples.function.custom;

@FunctionalInterface
public interface QuadFunction<T, U, V, W, R> {
  R apply(T t, U u, V v, W w);
}
