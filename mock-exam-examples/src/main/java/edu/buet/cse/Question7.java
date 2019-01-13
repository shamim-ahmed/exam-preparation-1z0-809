package edu.buet.cse;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Question7 {
  public static void main(String... args) {
    Path path = Paths.get("/home/shamim/codes/github-projects/exam-preparation-1z0-809");
    System.out.println(path.subpath(0, 2));
  }
}
