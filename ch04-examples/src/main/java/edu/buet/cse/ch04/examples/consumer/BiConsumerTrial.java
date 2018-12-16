package edu.buet.cse.ch04.examples.consumer;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerTrial {
  public static void main(String... args) {
    Map<String, Integer> myMap = new HashMap<>();

    BiConsumer<String, Integer> consumer1 = myMap::put;
    BiConsumer<String, Integer> consumer2 = (str, val) -> myMap.put(str, val);

    consumer1.accept("countryCode", 88);
    consumer2.accept("version", 2);

    System.out.println(myMap);

    // note that we can use the variable name str, which was used in an earlier lambda
    BiConsumer<String, String> consumer3 = (str, str2) -> {
      System.out.println(str);
      System.out.println(str2);
    };

    consumer3.accept("Hello", "world");
  }
}
