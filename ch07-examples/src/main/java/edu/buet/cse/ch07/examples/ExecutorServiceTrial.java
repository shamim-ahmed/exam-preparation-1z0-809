package edu.buet.cse.ch07.examples;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceTrial {
  public static void main(String... args) {
    ExecutorService service = null;

    try {
      service = Executors.newSingleThreadExecutor();
      Future<Integer> result = service.submit(new UltimateAnswer());
      Integer val = result.get();
      System.out.println(val);
    } catch (ExecutionException | InterruptedException ex) {
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
