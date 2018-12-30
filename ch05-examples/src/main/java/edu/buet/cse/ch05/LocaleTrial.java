package edu.buet.cse.ch05;

import java.util.Arrays;
import java.util.Locale;

public class LocaleTrial {
  public static void main(String... args) {
    // print default locale
    Locale defaultLocale = Locale.getDefault();
    System.out.println(defaultLocale);

    // German vs Germany
    System.out.println(Locale.GERMAN);
    System.out.println(Locale.GERMANY);
    System.out.println();

    // print all available locale in system
    Arrays.asList(Locale.getAvailableLocales()).stream()
        .sorted((loc1, loc2) -> loc1.toString().compareTo(loc2.toString()))
        .forEach(System.out::println);
  }
}
