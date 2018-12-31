package edu.buet.cse.ch04.examples.supplier;

import java.util.function.Supplier;

public class StringBuilderSupplierTrial {
  public static void main(String... args) {
    // note the constructor reference in lambda
    Supplier<StringBuilder> supplier1 = StringBuilder::new;
    Supplier<StringBuilder> supplier2 = () -> new StringBuilder();

    StringBuilder sb1 = supplier1.get();
    StringBuilder sb2 = supplier2.get();

    sb1.append("hello");
    sb2.append("world");

    System.out.println(sb1);
    System.out.println(sb2);
  }
}
