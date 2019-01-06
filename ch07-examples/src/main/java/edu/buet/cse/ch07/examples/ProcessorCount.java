package edu.buet.cse.ch07.examples;

public class ProcessorCount {
  public static void main(String... args) {
    int n = Runtime.getRuntime().availableProcessors();
    System.out.printf("Number of available processors = %d", n);
  }
}
