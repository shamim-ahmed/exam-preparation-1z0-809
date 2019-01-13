package edu.buet.cse;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Question1 {
  public static void main(String... args) {
    Locale locale = Locale.getDefault();
    DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.LONG, locale);

    Date date = new Date();
    System.out.println(dateFormat.format(date));
  }
}
