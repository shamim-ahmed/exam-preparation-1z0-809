package edu.buet.cse.ch05;

import java.util.Locale;

public class LocaleTrial2 {
  public static void main(String... args) {
    System.out.println("default locale = " + Locale.getDefault());

    Locale frenchLocale = new Locale("fr", "FR");
    Locale.setDefault(frenchLocale);

    System.out.println("default locale = " + Locale.getDefault());
  }
}
