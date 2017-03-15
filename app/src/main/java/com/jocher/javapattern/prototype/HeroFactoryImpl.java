package com.jocher.javapattern.prototype;

/**
 * Created by wubin on 2017/3/15.
 */

public class HeroFactoryImpl implements HeroFactory {

  private Mage mage;
  private Warlord warlord;
  private Beast beast;

  public HeroFactoryImpl(Mage mage, Warlord warlord, Beast beast) {
    this.mage = mage;
    this.warlord = warlord;
    this.beast = beast;
  }

  public Mage createMage() {
    try {
      return mage.clone();
    } catch (CloneNotSupportedException e) {
      return null;
    }
  }

  /**
   * Create warlord
   */
  public Warlord createWarlord() {
    try {
      return warlord.clone();
    } catch (CloneNotSupportedException e) {
      return null;
    }
  }

  /**
   * Create beast
   */
  public Beast createBeast() {
    try {
      return beast.clone();
    } catch (CloneNotSupportedException e) {
      return null;
    }
  }

}
