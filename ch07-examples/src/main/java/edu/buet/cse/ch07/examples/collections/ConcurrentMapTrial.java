package edu.buet.cse.ch07.examples.collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ConcurrentMapTrial {
  public static void main(String... args) {
    Map<String, Integer> foodMap = new HashMap<>();
    foodMap.put("penguin", 1);
    foodMap.put("flamingo", 2);

    Map<String, Integer> synchronizedFoodMap = Collections.synchronizedMap(foodMap);

    for (String key : synchronizedFoodMap.keySet()) {
      System.out.printf("%s = %s%n", key, synchronizedFoodMap.get(key));
    }
  }
}
