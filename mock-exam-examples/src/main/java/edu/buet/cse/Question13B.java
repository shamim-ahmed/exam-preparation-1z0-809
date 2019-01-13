package edu.buet.cse;

import java.io.File;

public class Question13B {
  public static void main(String... args) {
    File[] rootDirectories = File.listRoots();

    for (File root : rootDirectories) {
      System.out.println(root.getPath());
    }
  }
}
