package edu.buet.cse.ch04.examples.consumer;

import java.util.function.Consumer;

public class StringConsumerTrial {
  public static void main(String... args) {
    Consumer<String> consumer1 = System.out::println;
    Consumer<String> consumer2 = s -> System.out.println(s);

    consumer1.accept("Hello");
    consumer2.accept("world");
    
    System.out.println(consumer1.getClass().getCanonicalName());
    System.out.println(consumer2.getClass().getCanonicalName());
  }
}
