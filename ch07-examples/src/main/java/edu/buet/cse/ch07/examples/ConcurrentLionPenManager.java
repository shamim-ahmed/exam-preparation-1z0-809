package edu.buet.cse.ch07.examples;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConcurrentLionPenManager {
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

  public void performTask(CyclicBarrier c1, CyclicBarrier c2) {
    try {
      removeAnimals();
      c1.await();
      cleanPen();
      c2.await();
      addAnimals();
    } catch (InterruptedException | BrokenBarrierException ex) {
      System.err.println(ex);
    }
  }

  public static void main(String... args) {
    ExecutorService service = Executors.newFixedThreadPool(THREAD_POOL_SIZE);
    ConcurrentLionPenManager manager = new ConcurrentLionPenManager();
    CyclicBarrier c1 = new CyclicBarrier(THREAD_POOL_SIZE);
    CyclicBarrier c2 = new CyclicBarrier(THREAD_POOL_SIZE, () -> System.out.println("Pens cleaned !!!"));

    try {
      for (int i = 0; i < THREAD_POOL_SIZE; i++) {
        service.submit(() -> manager.performTask(c1, c2));
      }
    } finally {
      service.shutdown();
    }
  }
}
