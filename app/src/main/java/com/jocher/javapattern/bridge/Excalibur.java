package com.jocher.javapattern.bridge;

/**
 * Created by wubin on 2017/3/17.
 */

public class Excalibur extends  BlindingMagicWeaponImp{

  @Override
  public void weildImp() {
    System.out.println("wielding Excalibur");
  }

  @Override
  public void blindImp() {
    System.out.println("bright light streams from Excalibur blinding the enemy");
  }

  @Override
  public void swingImp() {
    System.out.println("swinging Excalibur");
  }

  @Override
  public void unWeildImp() {
    System.out.println("unwielding Excalibur");
  }
}
