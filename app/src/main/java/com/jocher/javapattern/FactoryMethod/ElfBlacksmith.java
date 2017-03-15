package com.jocher.javapattern.FactoryMethod;

/**
 * Created by wubin on 2017/3/15.
 */

public class ElfBlacksmith implements Blacksmith {



  public Weapon manufactureWeapon(WeaponType weaponType) {
    return new ElfWeapon(weaponType);
  }

}
