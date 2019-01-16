package edu.buet.cse.ch07.examples.collections;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentModificationTrial2 {
  public static void main(String... args) {
    Map<String, Integer> foodMap = new ConcurrentHashMap<>();
    foodMap.put("penguin", 1);
    foodMap.put("flamingo", 2);

    // there will be no ConcurrentModificationException.
    // think why
    for (String key : foodMap.keySet()) {
      foodMap.remove(key);
    }
  }
}
