package edu.buet.cse.ch08;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileTrial9 {
  public static void main(String... args) {
    final int limit = 4;

    try (InputStream inputStream =
        new BufferedInputStream(new FileInputStream("C:\\tmp\\hello.txt"))) {
      char c = (char) inputStream.read();
      System.out.println(c);

      if (inputStream.markSupported()) {
        inputStream.mark(limit);

        for (int i = 0; i < limit; i++) {
          c = (char) inputStream.read();
          System.out.print(c);
        }

        inputStream.reset();
        System.out.println();
      }

      for (int i = 0; i < limit; i++) {
        c = (char) inputStream.read();
        System.out.println(c);
      }
    } catch (IOException ex) {
      System.err.println(ex);
    }
  }
}
