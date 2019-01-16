package edu.buet.cse.ch07.examples.collections;

import java.util.SortedMap;
import java.util.concurrent.ConcurrentSkipListMap;

public class ConcurrentSkipListMapTrial {
  public static void main(String... args) {
    String[] fruits = {"orange", "banana", "apple"};
    SortedMap<String, Integer> map = new ConcurrentSkipListMap<>();

    for (int i = 0; i < fruits.length; i++) {
      map.put(fruits[i], fruits[i].length());
    }

    for (String key : map.keySet()) {
      System.out.printf("%s = %s%n", key, map.get(key));
    }
  }
}
