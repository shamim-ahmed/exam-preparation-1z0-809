package edu.buet.cse.ch04.examples.operator;

import java.util.function.UnaryOperator;

public class UnaryOperatorTrial {
  public static void main(String... args) {
    UnaryOperator<String> unaryOp1 = String::toUpperCase;
    UnaryOperator<String> unaryOp2 = s -> s.toUpperCase();

    System.out.println(unaryOp1.apply("hello"));
    System.out.println(unaryOp2.apply("world"));
  }
}
