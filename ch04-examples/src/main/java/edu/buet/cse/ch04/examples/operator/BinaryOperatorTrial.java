package edu.buet.cse.ch04.examples.operator;

import java.util.function.BinaryOperator;

public class BinaryOperatorTrial {
  public static void main(String... args) {
    BinaryOperator<String> binaryOp1 = String::concat;
    BinaryOperator<String> binaryOp2 = (s1, s2) -> s1.concat(s2);

    System.out.println(binaryOp1.apply("Hello", " world"));
    System.out.println(binaryOp2.apply("Shamim", " Ahmed"));
  }
}
