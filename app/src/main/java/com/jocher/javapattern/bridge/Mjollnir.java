package com.jocher.javapattern.bridge;

/**
 * Created by wubin on 2017/3/17.
 */

public class Mjollnir extends FlyingMagicWeaponImpl {

  @Override
  public void weildImp() {
    System.out.println("wielding Mjollnir");
  }

  @Override
  public void flyImp() {
    System.out.println("Mjollnir hits the enemy in the air and returns back to the owner's hand");
  }

  @Override
  public void swingImp() {
    System.out.println("swinging Mjollnir");
  }

  @Override
  public void unWeildImp() {
    System.out.println("unwielding Mjollnir");
  }
}
