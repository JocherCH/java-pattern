package com.jocher.javapattern.iterator;

/**
 * Created by wubin on 2017/3/22.
 */

public class App {

  public static void main(String[] args) {
    TreasureChest chest = new TreasureChest();

    ItemIterator ringIterator = chest.iterator(ItemType.RING);
    while (ringIterator.hasNext()) {
      System.out.println(ringIterator.next().toString());
    }

    System.out.println("----------");

    ItemIterator potionIterator = chest.iterator(ItemType.POTION);
    while (potionIterator.hasNext()) {
      System.out.println(potionIterator.next().toString());
    }

    System.out.println("----------");

    ItemIterator weaponIterator = chest.iterator(ItemType.WEAPON);
    while (weaponIterator.hasNext()) {
      System.out.println(weaponIterator.next().toString());
    }

    System.out.println("----------");

    ItemIterator it = chest.iterator(ItemType.ANY);
    while (it.hasNext()) {
      System.out.println(it.next().toString());
    }
  }

}
