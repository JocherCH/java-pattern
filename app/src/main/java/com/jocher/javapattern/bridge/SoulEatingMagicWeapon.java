package com.jocher.javapattern.bridge;

/**
 * Created by wubin on 2017/3/17.
 */

public class SoulEatingMagicWeapon extends MagicWeapon {

  public SoulEatingMagicWeapon(MagicWeaponImpl imp) {
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
  public SoulEatingMagicWeaponImp getImp() {
    return (SoulEatingMagicWeaponImp) imp;
  }

  public void eatSoul() {
    getImp().eatSoulImp();
  }


}
