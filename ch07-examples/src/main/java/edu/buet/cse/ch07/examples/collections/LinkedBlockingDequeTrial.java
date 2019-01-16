package edu.buet.cse.ch07.examples.collections;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

public class LinkedBlockingDequeTrial {
  public static void main(String... args) {
    BlockingDeque<Integer> deque = new LinkedBlockingDeque<>();

    try {
      deque.offer(5);
      deque.offer(6, 10, TimeUnit.SECONDS);
      deque.offerLast(7);
      deque.offerLast(8, 10, TimeUnit.SECONDS);
      deque.offerFirst(9);
      deque.offerFirst(10, 10, TimeUnit.SECONDS);

      // guess the output
      System.out.println(deque.poll());
      System.out.println(deque.poll(10, TimeUnit.SECONDS));
      System.out.println(deque.pollFirst());
      System.out.println(deque.pollFirst(10, TimeUnit.SECONDS));
      System.out.println(deque.pollLast());
      System.out.println(deque.pollLast(10, TimeUnit.SECONDS));
    } catch (InterruptedException ex) {
      System.err.println(ex);
    }
  }
}
