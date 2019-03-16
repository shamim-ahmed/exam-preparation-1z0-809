package edu.buet.cse.ch08;

import java.io.File;

public class FileTrial2 {
  public static void main(String... args) {
    File parent = new File("C:/tmp");
    File file = new File(parent, "hello.txt");

    System.out.println(file.exists());
  }
}
