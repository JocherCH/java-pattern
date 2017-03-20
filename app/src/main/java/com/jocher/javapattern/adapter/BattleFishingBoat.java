package com.jocher.javapattern.adapter;

/**
 * Created by wubin on 2017/3/20.
 */

public class BattleFishingBoat implements BattleShip {

  private FishingBoat boat;

  public BattleFishingBoat() {
    boat = new FishingBoat();
  }

  @Override
  public void fire() {
    System.out.println("fire!");
  }

  @Override
  public void move() {
    boat.sail();
  }
}
