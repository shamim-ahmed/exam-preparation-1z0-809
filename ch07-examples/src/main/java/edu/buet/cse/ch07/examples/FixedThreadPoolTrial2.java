package edu.buet.cse.ch07.examples;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class FixedThreadPoolTrial2 {
  private static final int FIXED_POOL_SIZE = 10;

  public static void main(String... args) {
    SheepManager manager = new SheepManager();
    ExecutorService service = Executors.newFixedThreadPool(FIXED_POOL_SIZE);

    try {
      for (int i = 0, n = 2 * FIXED_POOL_SIZE; i < n; i++) {
        service.submit(() -> manager.incrementAndReport());
      }
    } finally {
      service.shutdown();
    }
  }

  private static class SheepManager {
    // use a different initial value for sheepCount
    private final AtomicInteger sheepCount = new AtomicInteger(1);

    public void incrementAndReport() {
      try {
        Thread.sleep(2500L);
      } catch (InterruptedException ex) {
        System.err.println(ex);
      }

      // use a different method to update sheepCount
      int n = sheepCount.getAndIncrement();
      System.out.printf("Thread '%s' counts sheep %d%n", Thread.currentThread().getName(), n);
    }
  }
}
