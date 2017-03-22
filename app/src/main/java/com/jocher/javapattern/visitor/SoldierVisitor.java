package com.jocher.javapattern.visitor;

/**
 * Created by wubin on 2017/3/22.
 */

public class SoldierVisitor implements UnitVisitor {

  @Override
  public void visitSoldier(Soldier soldier) {
    System.out.println("Greetings " + soldier);
  }

  @Override
  public void visitSergeant(Sergeant sergeant) {

  }

  @Override
  public void visitCommander(Commander commander) {

  }
}
