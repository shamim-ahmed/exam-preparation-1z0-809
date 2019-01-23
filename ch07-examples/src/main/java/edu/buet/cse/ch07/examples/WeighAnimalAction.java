package edu.buet.cse.ch07.examples;

import java.util.Random;
import java.util.concurrent.RecursiveAction;

public class WeighAnimalAction extends RecursiveAction {
  private static final long serialVersionUID = 1L;

  private final int start;
  private final int end;
  private final Double[] weights;

  public WeighAnimalAction(int start, int end, Double[] weights) {
    this.start = start;
    this.end = end;
    this.weights = weights;
  }

  @Override
  protected void compute() {
    if (end - start <= 3) {
      Random randomGenerator = new Random();

      for (int i = start; i < end; i++) {
        weights[i] = Double.valueOf(randomGenerator.nextInt());
        System.out.println("Animal weighed : " + i);
      }
    } else {
      int middle = start + (end - start) / 2;
      System.out.printf("start = %d, middle = %d, end = %d%n", start, middle, end);
      RecursiveAction action1 = new WeighAnimalAction(start, middle, weights);
      RecursiveAction action2 = new WeighAnimalAction(middle, end, weights);
      invokeAll(action1, action2);
    }
  }
}
