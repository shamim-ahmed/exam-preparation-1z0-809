package edu.buet.cse.ch07.examples;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class FixedThreadPoolTrial3 {
  private static final int FIXED_POOL_SIZE = 10;

  public static void main(String... args) {
    SheepManager manager = new SheepManager();
    ExecutorService service = null;

    try {
      service = Executors.newFixedThreadPool(FIXED_POOL_SIZE);

      for (int i = 0, n = 2 * FIXED_POOL_SIZE; i < n; i++) {
        service.submit(() -> manager.incrementAndReport());
      }
    } finally {
      if (service != null) {
        service.shutdown();
      }
    }
  }

  private static class SheepManager {
    private int sheepCount = 0;

    // Why does this implementation take more time to execute ?
    // Think about the effect of the synchronized keyword on Thread.sleep() call
    public synchronized void incrementAndReport() {
      try {
        Thread.sleep(2500L);
      } catch (InterruptedException ex) {
        System.err.println(ex);
      }

      sheepCount++;
      System.out.printf("Thread '%s' counts sheep %d%n", Thread.currentThread().getName(),
          sheepCount);
    }
  }
}
