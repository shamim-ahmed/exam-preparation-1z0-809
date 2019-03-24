package edu.buet.cse;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Question08 {
  public static void main(String... args) {
    Path p = Paths.get("/home/shamim/personal/tmp/hello.txt");
    System.out.println(p.subpath(0, 2));
  }
}
