package edu.buet.cse;

import java.nio.file.FileVisitResult;

public class Question16A {
  public static void main(String... args) {
    for (FileVisitResult result : FileVisitResult.values()) {
      System.out.println(result);
    }
  }
}
