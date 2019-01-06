package edu.buet.cse.ch07.examples;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class ExecutorServiceTrial2 {
  public static void main(String... args) {
    ExecutorService service = null;

    try {
      service = Executors.newSingleThreadExecutor();
      Future<Integer> result = service.submit(new UltimateAnswer());
      Integer val = result.get(3000, TimeUnit.MILLISECONDS);
      System.out.println(val);
    } catch (ExecutionException | InterruptedException | TimeoutException ex) {
      System.err.println(ex);
    } finally {
      if (service != null) {
        service.shutdown();
      }
    }
  }

  private static class UltimateAnswer implements Callable<Integer> {

    @Override
    public Integer call() {
      try {
        Thread.sleep(5000L);
      } catch (InterruptedException ex) {
        System.err.println(ex);
      }

      // the answer to life, universe and everything
      return Integer.valueOf(42);
    }
  }
}
