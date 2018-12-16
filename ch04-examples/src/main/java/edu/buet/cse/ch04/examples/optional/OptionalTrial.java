package edu.buet.cse.ch04.examples.optional;

import java.util.Optional;

public class OptionalTrial {
  public static void main(String... args) {
    // example 1
    Optional<String> opt1 = Optional.empty();
    System.out.println(opt1.isPresent());
    System.out.println(opt1.isEmpty());

    String result1 = opt1.orElse("None");
    System.out.println(result1);

    System.out.println();

    // example 2
    Optional<Integer> opt2 = Optional.of(Integer.valueOf(4));
    System.out.println(opt2.isPresent());
    System.out.println(opt2.isEmpty());
    Integer result2 = opt2.orElse(Integer.MAX_VALUE);
    System.out.println(result2);
    
    System.out.println();

    // example 3
    Optional<Long> opt3 = Optional.of(314159L);
    opt3.ifPresent(System.out::println);
    
    System.out.println();

    // example 4
    Optional<Character> opt4 = Optional.empty();
    Character ch = opt4.orElseGet(() -> 'Z');
    System.out.println(ch);
  }
}
