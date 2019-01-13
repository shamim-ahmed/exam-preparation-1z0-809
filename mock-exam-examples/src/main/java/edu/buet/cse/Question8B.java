package edu.buet.cse;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Question8B {
  public static void main(String... args) {
    Path path = Paths.get("/home/shamim/personal/./docs/../temp/hello.txt");
    Path result = path.normalize();
    System.out.println(result);
  }
}
