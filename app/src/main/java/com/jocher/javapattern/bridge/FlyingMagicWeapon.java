package com.jocher.javapattern.bridge;

/**
 * Created by wubin on 2017/3/17.
 */

public class FlyingMagicWeapon extends MagicWeapon {

  public FlyingMagicWeapon(FlyingMagicWeaponImpl imp) {
    super(imp);
  }

  public FlyingMagicWeaponImpl getImp() {
    return (FlyingMagicWeaponImpl) imp;
  }

  @Override
  public void wield() {
    getImp().weildImp();
  }

  @Override
  public void swing() {
    getImp().swingImp();
  }

  @Override
  public void unWield() {
    getImp().unWeildImp();
  }

  public void fly() {
    getImp().flyImp();
  }
}
