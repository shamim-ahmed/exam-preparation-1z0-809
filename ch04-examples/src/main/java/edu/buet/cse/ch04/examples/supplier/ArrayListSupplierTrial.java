package edu.buet.cse.ch04.examples.supplier;

import java.util.ArrayList;
import java.util.function.Supplier;

public class ArrayListSupplierTrial {
  public static void main(String... args) {
    // note the lambda syntax with generics
    Supplier<ArrayList<String>> supplier = ArrayList<String>::new;
    ArrayList<String> myList = supplier.get();
    myList.add("Hello");
    myList.add("world");

    System.out.println(myList);
  }
}
