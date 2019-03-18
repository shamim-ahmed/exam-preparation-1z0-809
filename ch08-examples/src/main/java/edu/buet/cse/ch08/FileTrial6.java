package edu.buet.cse.ch08;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileTrial6 {
  public static void main(String... args) {
    final int limit = 4;

    try (Reader reader = new BufferedReader(new FileReader("C:\\tmp\\hello.txt"))) {
      char c = (char) reader.read();
      System.out.println(c);

      if (reader.markSupported()) {
        reader.mark(limit);

        for (int i = 0; i < limit; i++) {
          c = (char) reader.read();
          System.out.print(c);
        }

        reader.reset();
        System.out.println();
      }

      for (int i = 0; i < limit; i++) {
        c = (char) reader.read();
        System.out.println(c);
      }
    } catch (IOException ex) {
      System.err.println(ex);
    }
  }
}
