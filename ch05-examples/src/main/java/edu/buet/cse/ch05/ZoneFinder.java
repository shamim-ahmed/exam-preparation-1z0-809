package edu.buet.cse.ch05;

import java.time.ZoneId;

public class ZoneFinder {
  public static void main(String... args) {
    // print all zone ids for Sydney
    ZoneId.getAvailableZoneIds().stream().filter(zoneId -> zoneId.contains("Sydney"))
        .forEach(System.out::println);

    System.out.println();

    // print all zone ids for Australia
    ZoneId.getAvailableZoneIds().stream().filter(zoneId -> zoneId.contains("Australia"))
        .forEach(System.out::println);

    System.out.println();

    // print all zone ids for US
    ZoneId.getAvailableZoneIds().stream()
        .filter(zoneId -> zoneId.contains("US") || zoneId.contains("America")).sorted()
        .forEach(System.out::println);
  }
}
