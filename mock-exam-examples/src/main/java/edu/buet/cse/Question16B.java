package edu.buet.cse;

import java.nio.file.LinkOption;

public class Question16B {
  public static void main(String... args) {
    for (LinkOption option : LinkOption.values()) {
      System.out.println(option);
    }
  }
}
