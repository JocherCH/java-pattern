package com.jocher.javapattern.adapter;

/**
 * Created by wubin on 2017/3/20.
 */

public class App {

  public static void main(String[] args) {
    Captain captain = new Captain(new BattleFishingBoat());
    captain.move();
    captain.fire();
  }

}
