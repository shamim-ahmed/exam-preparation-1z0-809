package edu.buet.cse.ch08;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileTrial11 {
  public static void main(String... args) {
    try (Reader reader = new BufferedReader(new FileReader("C:\\tmp\\hello.txt"))) {
      char c = (char) reader.read();
      System.out.print(c);

      reader.skip(2L);

      for (int i = 0; i < 2; i++) {
        c = (char) reader.read();
        System.out.print(c);
      }

      System.out.println();
    } catch (IOException ex) {
      System.err.println(ex);
    }
  }
}
