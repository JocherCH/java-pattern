package com.jocher.javapattern.flyweight;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by wubin on 2017/3/20.
 */

public class AlchemistShop {

  private List<Potion> topShelf;
  private List<Potion> bottomShelf;

  public AlchemistShop() {
    topShelf = new ArrayList<>();
    bottomShelf = new ArrayList<>();
    fillShelves();
  }

  private void fillShelves() {

    PotionFactory factory = new PotionFactory();

    topShelf.add(factory.createPotion(PotionType.INVISIBILITY));
    topShelf.add(factory.createPotion(PotionType.INVISIBILITY));
    topShelf.add(factory.createPotion(PotionType.STRENGTH));
    topShelf.add(factory.createPotion(PotionType.HEALING));
    topShelf.add(factory.createPotion(PotionType.INVISIBILITY));
    topShelf.add(factory.createPotion(PotionType.STRENGTH));
    topShelf.add(factory.createPotion(PotionType.HEALING));
    topShelf.add(factory.createPotion(PotionType.HEALING));

    bottomShelf.add(factory.createPotion(PotionType.POISON));
    bottomShelf.add(factory.createPotion(PotionType.POISON));
    bottomShelf.add(factory.createPotion(PotionType.POISON));
    bottomShelf.add(factory.createPotion(PotionType.HOLY_WATER));
    bottomShelf.add(factory.createPotion(PotionType.HOLY_WATER));
  }

  public final List<Potion> getTopShelf() {
    return Collections.unmodifiableList(this.topShelf);
  }

  public final List<Potion> getBottomShelf() {
    return Collections.unmodifiableList(this.bottomShelf);
  }

  public void enumerate(){
    System.out.println("Enumerating top shelf potions\n");

    for (Potion p : topShelf) {
      p.drink();
    }

    System.out.println("Enumerating bottom shelf potions\n");

    for (Potion p : bottomShelf) {
      p.drink();
    }
  }


}
