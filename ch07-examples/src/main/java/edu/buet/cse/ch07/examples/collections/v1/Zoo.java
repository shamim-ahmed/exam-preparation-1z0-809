package edu.buet.cse.ch07.examples.collections.v1;

public class Zoo {
  public static void main(String... args) {
    ZooManager manager = new ZooManager();
    Thread keeper1 = new Thread(new ZooKeeper(manager));
    Thread keeper2 = new Thread(new ZooKeeper(manager));
    Thread keeper3 = new Thread(new ZooKeeper(manager));

    keeper1.start();
    keeper2.start();
    keeper3.start();
  }
}
