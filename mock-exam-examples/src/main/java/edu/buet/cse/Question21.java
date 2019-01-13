package edu.buet.cse;

interface SeasonInterface {
  void printValue();
}


// an enum cannot extend a class
// but it can implement an interface
enum Season implements SeasonInterface {
  SUMMER, AUTUMN, WINTER, SPRING;

  @Override
  public void printValue() {
    System.out.println(toString());
  }
}

public class Question21 {
  public static void main(String... args) {
    // all enums implicitly extend java.lang.Enum
    System.out.println(Season.SUMMER instanceof Enum);

    // all enums have a default valueOf() method
    System.out.println(Season.valueOf("WINTER"));
  }
}
