package edu.buet.cse.ch04.examples.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOperationTrial4 {
  public static void main(String... args) {
    // example 1
    Stream<Integer> stream1 = Stream.of(1, 3, 5, 7, 9);
    List<Integer> resultList1 = stream1.map(n -> n * n).collect(Collectors.toList());
    resultList1.stream().forEach(System.out::println);

    System.out.println();

    // example 2
    Stream<Integer> stream2 = Stream.iterate(1, n -> n + 2).limit(5);
    List<Integer> resultList2 = stream2.map(n -> n * n).collect(Collectors.toList());
    resultList2.stream().forEach(System.out::println);
  }
}
