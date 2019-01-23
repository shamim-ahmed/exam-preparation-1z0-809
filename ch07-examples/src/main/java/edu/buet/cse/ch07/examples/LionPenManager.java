package edu.buet.cse.ch07.examples;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LionPenManager {
  private static final int THREAD_POOL_SIZE = 4;

  public void removeAnimals() {
    System.out.println("Animals are being removed by " + Thread.currentThread().getName());
  }

  public void cleanPen() {
    System.out.println("Pen is being cleaned by " + Thread.currentThread().getName());
  }

  public void addAnimals() {
    System.out.println("Animals are being added by " + Thread.currentThread().getName());
  }

  public void performTask() {
    removeAnimals();
    cleanPen();
    addAnimals();
  }

  public static void main(String... args) {
    ExecutorService service = Executors.newFixedThreadPool(THREAD_POOL_SIZE);
    LionPenManager manager = new LionPenManager();

    try {
      for (int i = 0; i < THREAD_POOL_SIZE; i++) {
        service.submit(() -> manager.performTask());
      }
    } finally {
      service.shutdown();
    }
  }
}
