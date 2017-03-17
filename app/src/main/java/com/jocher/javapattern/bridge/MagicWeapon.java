package com.jocher.javapattern.bridge;

/**
 * Created by wubin on 2017/3/17.
 */

public abstract class MagicWeapon {
  protected MagicWeaponImpl imp;

  public MagicWeapon(MagicWeaponImpl imp){
    this.imp = imp;
  }

  public abstract void wield();

  public abstract void swing();

  public abstract void unWield();

  public MagicWeaponImpl getImp(){
    return imp;
  }

}
