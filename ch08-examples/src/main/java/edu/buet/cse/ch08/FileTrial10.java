package edu.buet.cse.ch08;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileTrial10 {
  public static void main(String... args) {
    try (InputStream inputStream =
        new BufferedInputStream(new FileInputStream("C:\\tmp\\hello.txt"))) {
      char c = (char) inputStream.read();
      System.out.print(c);
      
      inputStream.skip(2L);

      for (int i = 0; i < 2; i++) {
        c = (char) inputStream.read();
        System.out.print(c);
      }

      System.out.println();
    } catch (IOException ex) {
      System.err.println(ex);
    }
  }
}
