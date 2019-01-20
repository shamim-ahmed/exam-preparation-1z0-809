package edu.buet.cse.ch07.examples.collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ConcurrentMapTrial2 {
  public static void main(String... args) {
    Map<String, Integer> foodMap = new HashMap<>();
    foodMap.put("penguin", 1);
    foodMap.put("flamingo", 2);

    Map<String, Integer> synchronizedFoodMap = Collections.synchronizedMap(foodMap);

    // the following block will throw a ConcurrentModificationException
    for (String key : synchronizedFoodMap.keySet()) {
      synchronizedFoodMap.remove(key);
    }
  }
}
