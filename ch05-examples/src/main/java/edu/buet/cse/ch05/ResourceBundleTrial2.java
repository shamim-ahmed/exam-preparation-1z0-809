package edu.buet.cse.ch05;

import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;

public class ResourceBundleTrial2 {
  public static void main(String... args) {
    Locale frLocale = new Locale("fr", "FR");
    Properties props = new Properties();

    ResourceBundle rb = ResourceBundle.getBundle("edu.buet.cse.Message", frLocale);
    rb.keySet().stream().forEach(k -> props.put(k, rb.getString(k)));

    System.out.println(props.getProperty("greetings"));
    System.out.println(props.getProperty("username"));
  }
}
