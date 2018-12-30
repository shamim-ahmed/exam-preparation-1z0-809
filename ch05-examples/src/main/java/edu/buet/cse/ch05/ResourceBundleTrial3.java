package edu.buet.cse.ch05;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTrial3 {
  public static void main(String... args) {
    Locale usLocale = new Locale("en", "US");
    ResourceBundle rb = ResourceBundle.getBundle("edu.buet.cse.ch05.SecretMessage", usLocale);
    rb.keySet().stream().map(k -> k + " = " + rb.getString(k)).forEach(System.out::println);
  }
}
