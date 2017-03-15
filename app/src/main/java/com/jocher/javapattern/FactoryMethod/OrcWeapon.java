package com.jocher.javapattern.FactoryMethod;

/**
 * Created by wubin on 2017/3/15.
 */

public class OrcWeapon implements Weapon {

  private WeaponType weaponType;

  public OrcWeapon(WeaponType weaponType) {
    this.weaponType = weaponType;
  }

  @Override
  public String toString() {
    return "Orcish " + weaponType;
  }

  @Override
  public WeaponType getWeaponType() {
    return weaponType;
  }
}
