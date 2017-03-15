package com.jocher.javapattern.prototype;

/**
 * Created by wubin on 2017/3/15.
 */

public class App {

  public static void main(String[] args) {
    HeroFactory factory;
    Mage mage;
    Warlord warlord;
    Beast beast;

    factory = new HeroFactoryImpl(new ElfMage(), new ElfWarlord(), new ElfBeast());
    mage = factory.createMage();
    warlord = factory.createWarlord();
    beast = factory.createBeast();

    System.out.println(mage.toString()+":"+mage.hashCode());
    System.out.println(warlord.toString()+":"+warlord.hashCode());
    System.out.println(beast.toString()+":"+beast.hashCode());

    factory = new HeroFactoryImpl(new OrcMage(), new OrcWarlord(), new OrcBeast());
    mage = factory.createMage();
    warlord = factory.createWarlord();
    beast = factory.createBeast();

    System.out.println(mage.toString()+":"+mage.hashCode());
    System.out.println(warlord.toString()+":"+warlord.hashCode());
    System.out.println(beast.toString()+":"+beast.hashCode());

  }

}
