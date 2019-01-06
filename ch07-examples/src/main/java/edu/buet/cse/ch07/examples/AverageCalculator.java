package edu.buet.cse.ch07.examples;

import java.util.Objects;

public class AverageCalculator implements Runnable {
  private final double[] values;

  public AverageCalculator(double[] values) {
    this.values = Objects.requireNonNull(values);
  }

  @Override
  public void run() {
    if (values.length == 0) {
      return;
    }

    double sum = 0.0;

    for (double d : values) {
      sum += d;
    }

    double avg = sum / values.length;
    System.out.println(avg);
  }
}
