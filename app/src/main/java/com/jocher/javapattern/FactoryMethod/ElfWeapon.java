package com.jocher.javapattern.FactoryMethod;

/**
 * Created by wubin on 2017/3/15.
 */

public class ElfWeapon implements Weapon {

  private WeaponType weaponType;

  public ElfWeapon(WeaponType weaponType) {
    this.weaponType = weaponType;
  }

  @Override
  public String toString() {
    return "Elven " + weaponType;
  }

  @Override
  public WeaponType getWeaponType() {
    return weaponType;
  }
}
