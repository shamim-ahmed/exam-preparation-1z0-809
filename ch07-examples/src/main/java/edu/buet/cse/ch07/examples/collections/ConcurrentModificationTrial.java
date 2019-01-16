package edu.buet.cse.ch07.examples.collections;

import java.util.HashMap;
import java.util.Map;

public class ConcurrentModificationTrial {
  public static void main(String... args) {
    Map<String, Integer> foodData = new HashMap<>();
    foodData.put("penguin", 1);
    foodData.put("flamingo", 2);
    
    // expect a ConcurrentModificationException
    for (String key : foodData.keySet()) {
      foodData.remove(key);
    }
  }
}
