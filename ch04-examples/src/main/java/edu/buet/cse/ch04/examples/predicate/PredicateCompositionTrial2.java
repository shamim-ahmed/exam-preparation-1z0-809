package edu.buet.cse.ch04.examples.predicate;

import java.util.function.Predicate;

public class PredicateCompositionTrial2 {
  public static void main(String... args) {
    Predicate<String> egg = s -> s.contains("egg");
    Predicate<String> brown = s -> s.contains("brown");

    Predicate<String> brownEgg = egg.and(brown);
    Predicate<String> otherEgg = egg.and(brown.negate());
    Predicate<String> otherEgg2 = brown.negate().and(egg);

    String input1 = "brown egg";
    String input2 = "yellow egg";

    System.out.println(brownEgg.test(input1));
    System.out.println(otherEgg.test(input1));
    System.out.println(otherEgg2.test(input1));
    System.out.println();

    System.out.println(brownEgg.test(input2));
    System.out.println(otherEgg.test(input2));
    System.out.println(otherEgg2.test(input2));
  }
}
