package edu.buet.cse.ch08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CopyFileTrial3 {
  public static void main(String... args) {
    String source = "C:\\tmp\\hello.txt";
    String destination = "C:\\tmp\\copy.txt";

    List<String> lines = readFile(source);
    writeFile(destination, lines);

    System.out.printf("%s has been copied to %s%n", source, destination);
  }

  private static List<String> readFile(String source) {
    List<String> resultList = new ArrayList<>();

    try (BufferedReader reader = new BufferedReader(new FileReader(source))) {
      String line;

      while ((line = reader.readLine()) != null) {
        resultList.add(line);
      }
    } catch (IOException ex) {
      System.err.println(ex);
    }

    return resultList;
  }

  private static void writeFile(String destination, List<String> lines) {
    try (BufferedWriter writer = new BufferedWriter(new FileWriter(destination))) {
      for (String s : lines) {
        writer.write(s);
        writer.newLine();
      }
    } catch (IOException ex) {
      System.err.println(ex);
    }
  }
}
