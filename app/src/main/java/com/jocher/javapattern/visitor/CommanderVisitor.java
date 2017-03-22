package com.jocher.javapattern.visitor;

/**
 * Created by wubin on 2017/3/22.
 */

public class CommanderVisitor implements UnitVisitor {

  @Override
  public void visitSoldier(Soldier soldier) {

  }

  @Override
  public void visitSergeant(Sergeant sergeant) {

  }

  @Override
  public void visitCommander(Commander commander) {
    System.out.println("Good to see you "+ commander);
  }
}
