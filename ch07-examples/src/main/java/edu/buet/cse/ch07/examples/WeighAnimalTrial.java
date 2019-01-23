package edu.buet.cse.ch07.examples;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

public class WeighAnimalTrial {
  public static void main(String... args) {
    Double[] weights = new Double[10];
    ForkJoinTask<?> task = new WeighAnimalAction(0, weights.length, weights);
    ForkJoinPool pool = new ForkJoinPool();
    pool.invoke(task);
  }
}
