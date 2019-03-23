package edu.buet.cse.ch08;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyFileTrial2 {
  public static void main(String... args) {
    String source = "C:\\tmp\\hello.txt";
    String destination = "C:\\tmp\\copy.txt";
    copyFile(source, destination);

    System.out.printf("%s has been copied to %s%n", source, destination);
  }

  private static void copyFile(String source, String destination) {
    try (InputStream inStream = new BufferedInputStream(new FileInputStream(source));
        OutputStream outStream = new BufferedOutputStream(new FileOutputStream(destination))) {
      int count;
      byte[] values = new byte[1024];

      while ((count = inStream.read(values)) != -1) {
        outStream.write(values, 0, count);
      }
    } catch (IOException ex) {
      System.err.println(ex);
    }
  }
}
