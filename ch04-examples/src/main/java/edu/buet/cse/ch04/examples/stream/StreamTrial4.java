package edu.buet.cse.ch04.examples.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class StreamTrial4 {
  public static void main(String... args) {
    IntStream stream1 = IntStream.of(1, 2, 3, 4, 5);
    IntStream stream2 = IntStream.of(6, 7, 8, 9, 10);
    IntStream stream3 = IntStream.of(11, 12, 13, 14, 15);

    List<IntStream> streamList = Arrays.asList(stream1, stream2, stream3);
    int sum = streamList.stream().mapToInt(is -> is.sum()).sum();
    System.out.println(sum);
  }
}
