package com.jocher.javapattern.bridge;

/**
 * Created by wubin on 2017/3/17.
 */

public class BlindingMagicWeapon extends MagicWeapon {

  public BlindingMagicWeapon(MagicWeaponImpl imp) {
    super(imp);
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

  @Override
  public BlindingMagicWeaponImp getImp() {
    return (BlindingMagicWeaponImp)imp;
  }

  public void blind() {
    getImp().blindImp();
  }

}
