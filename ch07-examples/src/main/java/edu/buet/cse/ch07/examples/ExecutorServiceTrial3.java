package edu.buet.cse.ch07.examples;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceTrial3 {
  public static void main(String... args) {
    ExecutorService service = Executors.newSingleThreadExecutor();

    try {
      Future<Integer> result = service.submit(() -> 42);
      Integer val = result.get();
      System.out.println(val);
    } catch (ExecutionException | InterruptedException ex) {
      System.err.println(ex);
    } finally {
      service.shutdown();
    }
  }
}
