package com.jocher.javapattern.visitor;

/**
 * Created by wubin on 2017/3/22.
 */

public interface UnitVisitor {

  void visitSoldier(Soldier soldier);

  void visitSergeant(Sergeant sergeant);

  void visitCommander(Commander commander);

}
