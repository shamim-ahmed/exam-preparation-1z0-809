package edu.buet.cse.ch05;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTrial {
  public static void main(String... args) {
    Locale usLocale = new Locale("en", "US");
    ResourceBundle rb = ResourceBundle.getBundle("edu.buet.cse.Message", usLocale);
    rb.keySet().stream().forEach(k -> System.out.println(k + " = " + rb.getString(k)));
  }
}
