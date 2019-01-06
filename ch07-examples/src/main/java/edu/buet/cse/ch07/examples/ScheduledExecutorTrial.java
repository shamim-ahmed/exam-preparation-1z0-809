package edu.buet.cse.ch07.examples;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorTrial {
  public static void main(String... args) {
    ScheduledExecutorService service = null;

    try {
      service = Executors.newSingleThreadScheduledExecutor();
      Future<Integer> result = service.schedule(() -> Integer.valueOf(42), 5, TimeUnit.SECONDS);
      Integer val = result.get();
      System.out.println(val);
    } catch (ExecutionException | InterruptedException ex) {
      System.err.println(ex);
    } finally {
      if (service != null) {
        service.isShutdown();
      }
    }
  }
}
