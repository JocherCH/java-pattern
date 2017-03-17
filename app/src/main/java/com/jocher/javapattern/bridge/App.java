package com.jocher.javapattern.bridge;

/**
 * Created by wubin on 2017/3/17.
 */

public class App {

  public static void main(String[] args){
    FlyingMagicWeapon flyingMagicWeapon = new FlyingMagicWeapon(new Mjollnir());
    flyingMagicWeapon.wield();
    flyingMagicWeapon.fly();
    flyingMagicWeapon.swing();
    flyingMagicWeapon.unWield();

    SoulEatingMagicWeapon soulEatingMagicWeapon = new SoulEatingMagicWeapon(new Stormbringer());
    soulEatingMagicWeapon.wield();
    soulEatingMagicWeapon.eatSoul();
    soulEatingMagicWeapon.swing();
    soulEatingMagicWeapon.unWield();

    BlindingMagicWeapon blindingMagicWeapon = new BlindingMagicWeapon(new Excalibur());
    blindingMagicWeapon.wield();
    blindingMagicWeapon.blind();
    blindingMagicWeapon.swing();
    blindingMagicWeapon.unWield();
  }

}
