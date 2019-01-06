package edu.buet.cse.ch07.examples;

import java.util.concurrent.Callable;
import java.util.function.Supplier;

public class AmbiguousLambda {
  public static void main(String... args) {
    useCallable(() -> Integer.valueOf(42));
    useSupplier(() -> Integer.valueOf(42));

    // the following line will not compile
    // use(() -> Integer.valueOf(42));

    // the following lines compile !
    use((Callable<Integer>) () -> Integer.valueOf(42));
    use((Supplier<Integer>) () -> Integer.valueOf(42));
  }

  public static void useCallable(Callable<Integer> callable) {
    System.out.println("useCallable() invoked");
  }

  public static void useSupplier(Supplier<Integer> supplier) {
    System.out.println("useSupplier() invoked");
  }

  public static void use(Callable<Integer> callable) {
    System.out.println("use() invoked with callable argument");
  }

  public static void use(Supplier<Integer> supplier) {
    System.out.println("use() invoked with supplier argument");
  }
}
