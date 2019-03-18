package edu.buet.cse.ch08;

import java.io.File;

public class FileTrial5 {
  public static void main(String... args) {
    File parent = new File("C:/tmp");
    String[] fileNames = parent.list();

    for (String name : fileNames) {
      System.out.println(name);
    }
  }
}
