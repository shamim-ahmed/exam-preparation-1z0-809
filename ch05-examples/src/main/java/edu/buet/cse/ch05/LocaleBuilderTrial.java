package edu.buet.cse.ch05;

import java.util.Locale;

public class LocaleBuilderTrial {
  public static void main(String... args) {
    Locale locale1 = new Locale.Builder().setLanguage("bn").setRegion("BD").build();
    System.out.println(locale1);

    Locale locale2 = new Locale.Builder().setRegion("US").setLanguage("en").build();
    System.out.println(locale2);
  }
}
