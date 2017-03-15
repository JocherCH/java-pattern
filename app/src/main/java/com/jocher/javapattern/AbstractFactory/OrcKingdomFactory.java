package com.jocher.javapattern.AbstractFactory;

/**
 * Created by wubin on 2017/3/15.
 */

public class OrcKingdomFactory implements KingdomFactory {

  public Castle createCastle() {
    return new OrcCastle();
  }

  public King createKing() {
    return new OrcKing();
  }

  public Army createArmy() {
    return new OrcArmy();
  }
}
