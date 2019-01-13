package edu.buet.cse;

import java.util.HashSet;
import java.util.Set;

public class Question20 {
  public static void main(String... args) {
    Set<String> fruitSet = new HashSet<>();
    fruitSet.add("apple");
    fruitSet.add("orange");
    fruitSet.add("banana");
    // we can store null in HashSet
    fruitSet.add(null);

    fruitSet.stream().forEach(System.out::println);
  }
}
