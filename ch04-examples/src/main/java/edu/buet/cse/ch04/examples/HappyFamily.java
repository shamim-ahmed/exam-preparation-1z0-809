package edu.buet.cse.ch04.examples;

import java.util.function.Supplier;

public class HappyFamily {
  String walk = "walk";

  void everyonePlay(boolean baby) {
    String approach = "amble";
    // approach = "gallop";

    play(() -> walk);
    play(() -> baby ? "hitch a ride" : "run");
    play(() -> approach);
  }

  void play(Supplier<String> supplier) {
    System.out.println(supplier.get());
  }

  public static void main(String... args) {
    new HappyFamily().everyonePlay(true);
  }
}
