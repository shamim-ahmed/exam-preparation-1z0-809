package edu.buet.cse.ch07.examples;

public class RunnableTrial {
  public static void main(String... args) {
    Thread thread1 = new Thread(() -> System.out.println("Hello"));
    Thread thread2 = new Thread(() -> {
      int i = 30;
      i++;
      System.out.println(i);
    });

    thread1.setPriority(Thread.MIN_PRIORITY);
    thread2.setPriority(Thread.MAX_PRIORITY);

    thread1.start();
    thread2.start();
  }
}
