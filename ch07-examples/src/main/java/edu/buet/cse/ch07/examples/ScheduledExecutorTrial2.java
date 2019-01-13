package edu.buet.cse.ch07.examples;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorTrial2 {
  public static void main(String... args) {
    ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();

    try {
      service.schedule(() -> System.out.println("Done"), 5, TimeUnit.SECONDS);
    } finally {
      // calling shutdown is necessary here
      service.shutdown();
    }
  }
}
