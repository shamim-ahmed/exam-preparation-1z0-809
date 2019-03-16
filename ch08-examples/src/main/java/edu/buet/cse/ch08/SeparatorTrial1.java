package edu.buet.cse.ch08;

import java.io.File;

public class SeparatorTrial1 {
  public static void main(String... args) {
    System.out.println(System.getProperty("file.separator"));
    System.out.println(File.separator);
    System.out.println(File.pathSeparator);
    System.out.println(File.pathSeparatorChar);
  }
}
