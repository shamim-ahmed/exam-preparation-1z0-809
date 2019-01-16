package edu.buet.cse.ch07.examples.collections;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class LinkedBlockingQueueTrial {
  public static void main(String... args) {
    BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();

    try {
      queue.offer(5);
      queue.offer(25, 60, TimeUnit.SECONDS);

      System.out.println(queue.poll());
      System.out.println(queue.poll(60, TimeUnit.SECONDS));
    } catch (InterruptedException ex) {
      System.err.println(ex);
    }

    try {
      System.out.println(queue.poll(5, TimeUnit.SECONDS));
    } catch (InterruptedException ex) {
      System.err.println(ex);
    }
  }
}
