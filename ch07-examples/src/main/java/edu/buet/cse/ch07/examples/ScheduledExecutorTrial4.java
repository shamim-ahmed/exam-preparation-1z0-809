package edu.buet.cse.ch07.examples;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class ScheduledExecutorTrial4 {
  public static void main(String... args) {
    // NOTE: there is no shutdown call in this example, as this will terminate the periodic tasks
    ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
    service.scheduleWithFixedDelay(new MyTask(), 0L, 5, TimeUnit.SECONDS);
  }

  private static class MyTask implements Runnable {
    private final AtomicInteger count = new AtomicInteger(0);

    @Override
    public void run() {
      int n = count.incrementAndGet();
      System.out.println("Hello World : " + n);

      try {
        Thread.sleep(4000L);
      } catch (InterruptedException ex) {
        System.err.println(ex);
      }

      System.out.println("Done : " + n);
    }
  }
}
