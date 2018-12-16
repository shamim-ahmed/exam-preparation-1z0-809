package edu.buet.cse.ch04.examples.supplier;

import java.time.LocalDate;
import java.util.function.Supplier;

public class LocalDateSupplierTrial {
  public static void main(String... args) {
    // note the static method reference in lambda
    Supplier<LocalDate> supplier1 = LocalDate::now;
    Supplier<LocalDate> supplier2 = () -> LocalDate.now();

    LocalDate d1 = supplier1.get();
    LocalDate d2 = supplier2.get();

    System.out.println(d1);
    System.out.println(d2);
  }
}
