package com.jocher.javapattern.FactoryMethod;

/**
 * Created by wubin on 2017/3/15.
 */

public class OrcBlacksmith implements Blacksmith {

  @Override
  public Weapon manufactureWeapon(WeaponType weaponType) {
    return new OrcWeapon(weaponType);
  }
}
