package edu.buet.cse.ch07.examples.collections.v2;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

// for this implementation, the output will be printed with a time delay for each thread. Can you
// see why ?
public class ZooManager {
  private static final long PUT_WAITING_PERIOD = 500L;
  private static final long GET_WAITING_PERIOD = 1000L;

  private Map<String, Object> foodMap = new ConcurrentHashMap<>();

  public void put(String key, Object value) {
    try {
      Thread.sleep(PUT_WAITING_PERIOD);
    } catch (InterruptedException ex) {
      System.err.println(ex);
    }

    foodMap.put(key, value);
  }

  public Object get(String key) {
    try {
      Thread.sleep(GET_WAITING_PERIOD);
    } catch (InterruptedException ex) {
      System.err.println(ex);
    }

    return foodMap.get(key);
  }
}
