package edu.buet.cse.ch07.examples.collections;

import java.util.SortedSet;
import java.util.concurrent.ConcurrentSkipListSet;

public class ConcurrentSkipListSetTrial {
  public static void main(String... args) {
    SortedSet<String> set = new ConcurrentSkipListSet<>();
    set.add("orange");
    set.add("banana");
    set.add("apple");

    for (String s : set) {
      System.out.println(s);
    }
  }
}
