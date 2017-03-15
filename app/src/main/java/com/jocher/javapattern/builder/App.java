package com.jocher.javapattern.builder;

/**
 * Created by wubin on 2017/3/15.
 */

public class App {

  public static void main(String[] args) {

    Hero mage =
        new Hero.Builder(Profession.MAGE, "Riobard").hairColor(HairColor.BLACK)
            .weapon(Weapon.DAGGER).build();
    System.out.println(mage.toString());

    Hero warrior =
        new Hero.Builder(Profession.WARRIOR, "Amberjill").hairColor(HairColor.BLOND)
            .hairType(HairType.LONG_CURLY).armor(Armor.CHAIN_MAIL).weapon(Weapon.SWORD)
            .build();
    System.out.println(warrior.toString());

    Hero thief =
        new Hero.Builder(Profession.THIEF, "Desmond").hairType(HairType.BALD)
            .weapon(Weapon.BOW).build();
    System.out.println(thief.toString());

  }

}
