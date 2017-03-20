package com.jocher.javapattern.adapter;

/**
 * Created by wubin on 2017/3/20.
 */

public class Captain implements BattleShip {

  private BattleShip battleship;

  public Captain() {

  }

  public Captain(BattleShip battleship) {
    this.battleship = battleship;
  }

  public void setBattleship(BattleShip battleship) {
    this.battleship = battleship;
  }

  @Override
  public void fire() {
    battleship.fire();
  }

  @Override
  public void move() {
    battleship.move();
  }
}
