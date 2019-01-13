package edu.buet.cse.ch07.examples.collections.v1;

import java.util.HashMap;
import java.util.Map;

// for this implementation, the output will be printed almost simultaneously for all threads. Can
// you see why ?
public class ZooManager {
  private static final long PUT_WAITING_PERIOD = 500L;
  private static final long GET_WAITING_PERIOD = 1000L;

  private Map<String, Object> foodMap = new HashMap<>();

  public synchronized void put(String key, Object value) {
    try {
      Thread.sleep(PUT_WAITING_PERIOD);
    } catch (InterruptedException ex) {
      System.err.println(ex);
    }

    foodMap.put(key, value);
  }

  public synchronized Object get(String key) {
    try {
      Thread.sleep(GET_WAITING_PERIOD);
    } catch (InterruptedException ex) {
      System.err.println(ex);
    }

    return foodMap.get(key);
  }
}
