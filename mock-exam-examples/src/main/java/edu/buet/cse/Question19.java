package edu.buet.cse;

public class Question19 {
  static int i1, i2, i3;

  public static void main(String... args) {
    try {
      int result = add(i1 = 1, oops(i2 = 2), i3 = 3);
      System.out.println(result);
    } catch (Exception ex) {
      System.out.printf("i1 = %d, i2 = %d, i3 = %d%n", i1, i2, i3);
    }
  }

  private static int oops(int x) throws Exception {
    throw new Exception("oops I did it again !");
  }

  private static int add(int x, int y, int z) {
    return x + y + z;
  }
}
