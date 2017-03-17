package com.jocher.javapattern.bridge;

/**
 * Created by wubin on 2017/3/17.
 */

public class Stormbringer extends SoulEatingMagicWeaponImp {

  @Override
  public void weildImp() {
    System.out.println("wielding Stormbringer");
  }

  @Override
  public void eatSoulImp() {
    System.out.println("Stormbringer devours the enemy's soul");
  }

  @Override
  public void swingImp() {
    System.out.println("swinging Stormbringer");
  }

  @Override
  public void unWeildImp() {
    System.out.println("unwielding Stormbringer");
  }
}
