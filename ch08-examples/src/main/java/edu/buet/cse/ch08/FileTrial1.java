package edu.buet.cse.ch08;

import java.io.File;

public class FileTrial1 {
  public static void main(String... args) {
    File file = new File("C:/tmp/hello.txt");
    System.out.println(file.exists());
  }
}
