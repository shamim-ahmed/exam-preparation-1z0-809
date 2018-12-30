package edu.buet.cse.ch05;

import java.util.ListResourceBundle;

public class SecretMessage_en_US extends ListResourceBundle {

  @Override
  protected Object[][] getContents() {
    return new Object[][] {
      {"cipher", "abracadabra"},
      {"sender", "Alice"},
      {"receiver", "Bob"}
    };
  }
}
