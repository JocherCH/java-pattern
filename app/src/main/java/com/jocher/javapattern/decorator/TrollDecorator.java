package com.jocher.javapattern.decorator;

/**
 * Created by wubin on 2017/3/20.
 */

public class TrollDecorator implements Troll {

  private Troll decorated;

  public TrollDecorator(Troll decorated) {
    this.decorated = decorated;
  }
  @Override
  public void attack() {
    decorated.attack();
  }

  @Override
  public int getAttackPower() {
    return decorated.getAttackPower();
  }

  @Override
  public void fleeBattle() {
    decorated.fleeBattle();
  }
}
