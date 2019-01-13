package edu.buet.cse;

import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class Question13A {
  public static void main(String... args) {
    FileSystem fileSystem = FileSystems.getDefault();
    Iterable<Path> rootDirectories = fileSystem.getRootDirectories();

    for (Path root : rootDirectories) {
      System.out.println(root);
    }
  }
}
