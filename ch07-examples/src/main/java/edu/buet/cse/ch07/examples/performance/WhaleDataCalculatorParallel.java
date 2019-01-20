package edu.buet.cse.ch07.examples.performance;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class WhaleDataCalculatorParallel {
  AtomicInteger counter = new AtomicInteger(0);

  public void processAllData(List<Integer> valueList) {
    valueList.parallelStream().map(n -> processRecord(n)).forEach(n -> counter.addAndGet(n));
  }

  public int getCounterValue() {
    return counter.get();
  }

  private Integer processRecord(Integer val) {
    try {
      Thread.sleep(10L);
    } catch (InterruptedException ex) {
      System.err.println(ex);
    }

    return val + 1;
  }

  public static void main(String... args) {
    WhaleDataCalculatorParallel calculator = new WhaleDataCalculatorParallel();
    List<Integer> valueList = new ArrayList<>();

    for (int i = 0; i < 4000; i++) {
      valueList.add(i);
    }

    long start = System.currentTimeMillis();
    calculator.processAllData(valueList);
    long end = System.currentTimeMillis();

    System.out.printf("Processing time = %.3f s%n", (end - start) / 1000.0);
    System.out.printf("counter value = %d%n", calculator.getCounterValue());
  }
}
