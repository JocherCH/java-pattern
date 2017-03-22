package com.jocher.javapattern.visitor;

/**
 * Created by wubin on 2017/3/22.
 */

public class SergeantVisitor implements UnitVisitor {

  @Override
  public void visitSoldier(Soldier soldier) {

  }

  @Override
  public void visitSergeant(Sergeant sergeant) {
    System.out.println("Hello " + sergeant);
  }

  @Override
  public void visitCommander(Commander commander) {

  }
}
