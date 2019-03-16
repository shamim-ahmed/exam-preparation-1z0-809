package edu.buet.cse.ch08;

import java.io.File;

public class FileTrial4 {
  public static void main(String... args) {
    File parent = new File("C:/tmp");

    System.out.println(parent.isDirectory());
    File[] fileArray = parent.listFiles();

    for (File file : fileArray) {
      System.out.println(file.getName() + " : " + file.getAbsolutePath());
    }
  }
}
