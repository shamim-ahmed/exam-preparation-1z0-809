package edu.buet.cse.ch07.examples;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceTrial4 {
  public static void main(String... args) throws InterruptedException {
    ExecutorService service = Executors.newSingleThreadExecutor();

    try {
      service.submit(new MyTask());
    } finally {
      service.shutdown();
    }

    service.awaitTermination(1000, TimeUnit.MILLISECONDS);

    if (service.isTerminated()) {
      System.out.println("All tasks are finished");
    } else {
      System.out.println("At least one task is still running");
    }
  }

  private static class MyTask implements Callable<Integer> {

    @Override
    public Integer call() {
      try {
        Thread.sleep(5000L);
      } catch (InterruptedException ex) {
        System.err.println(ex);
      }

      return Integer.valueOf(42);
    }
  }
}
