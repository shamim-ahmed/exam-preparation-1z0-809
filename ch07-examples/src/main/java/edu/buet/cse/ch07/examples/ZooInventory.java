package edu.buet.cse.ch07.examples;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ZooInventory {
  public static void main(String... args) {
    ExecutorService service = null;

    try {
      service = Executors.newSingleThreadExecutor();
      service.execute(() -> System.out.println("Printing zoo inventory"));
      service.execute(() -> {
        for (int i = 0; i < 3; i++) {
          System.out.println("Printing record " + i);
        }
      });

      service.execute(() -> System.out.println("Printing zoo inventory"));
      System.out.println("End");
    } finally {
      if (service != null) {
        service.shutdown();
      }
    }
  }
}
