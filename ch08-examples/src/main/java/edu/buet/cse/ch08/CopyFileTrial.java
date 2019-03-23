package edu.buet.cse.ch08;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyFileTrial {
  public static void main(String... args) {
    String source = "C:\\tmp\\hello.txt";
    String destination = "C:\\tmp\\copy.txt";

    copyFile(source, destination);
    System.out.printf("%s was copied to %s%n", source, destination);
  }

  private static void copyFile(String source, String destination) {
    try (InputStream inStream = new FileInputStream(source);
        OutputStream outStream = new FileOutputStream(destination)) {
      int val;

      while ((val = inStream.read()) != -1) {
        outStream.write(val);
      }
    } catch (IOException ex) {
      System.err.println(ex);
    }
  }
}
