package edu.buet.cse.ch07.examples;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class CachedThreadPoolTrial {
  public static void main(String... args) {
    SheepManager manager = new SheepManager();
    ExecutorService service = Executors.newCachedThreadPool();

    try {
      for (int i = 0; i < 20; i++) {
        service.submit(() -> manager.incrementAndReport());
      }
    } finally {
      service.shutdown();
    }
  }

  private static class SheepManager {
    private final AtomicInteger counter = new AtomicInteger(0);

    public void incrementAndReport() {
      try {
        Thread.sleep(2500L);
      } catch (InterruptedException ex) {
        System.err.println(ex);
      }

      int n = counter.incrementAndGet();
      System.out.printf("Thread '%s' counts sheep %d%n", Thread.currentThread().getName(), n);
    }
  }
}
