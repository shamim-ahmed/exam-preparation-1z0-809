package edu.buet.cse.ch08;

import java.io.File;

public class FileTrial3 {
  public static void main(String...args) {
    File file = new File("C:/tmp/hello.txt");
    System.out.println(file.isDirectory());
    System.out.println(file.isFile());
    System.out.println(file.length());
    System.out.println(file.lastModified());
  }
}
