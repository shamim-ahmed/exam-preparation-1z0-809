package edu.buet.cse.ch07.examples.collections;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListTrial {
  public static void main(String... args) {
    List<Integer> valueList = new CopyOnWriteArrayList<>(Arrays.asList(2, 3, 5, 7));

    for (Integer n : valueList) {
      System.out.println(n);
      valueList.add(Integer.valueOf(36));
    }

    // can you guess the output here ?
    System.out.printf("size = %d%n", valueList.size());
  }
}
