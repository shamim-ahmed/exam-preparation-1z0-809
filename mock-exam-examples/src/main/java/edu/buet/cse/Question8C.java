package edu.buet.cse;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Question8C {
  public static void main(String...args) {
    Path path1 = Paths.get("/home/shamim/personal/./docs/../temp/hello.txt");
    Path path2 = Paths.get("/home/shamim/personal/temp/poem.txt");
    
    Path result = path1.relativize(path2);
    System.out.println(result);
  }
}
