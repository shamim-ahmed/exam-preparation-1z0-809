package edu.buet.cse.ch07.examples.collections.v2;

import java.util.Objects;

public class ZooKeeper implements Runnable {
  private final ZooManager manager;

  public ZooKeeper(ZooManager manager) {
    this.manager = Objects.requireNonNull(manager);
  }

  @Override
  public void run() {
    String key = Thread.currentThread().getName();
    String value = String.valueOf(Math.random());

    manager.put(key, value);
    String retrievedValue = (String) manager.get(key);

    System.out.printf("Original value = %s, Retrieved value = %s%n", value, retrievedValue);
  }
}
