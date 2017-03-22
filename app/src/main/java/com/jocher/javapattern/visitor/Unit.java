package com.jocher.javapattern.visitor;

/**
 * Created by wubin on 2017/3/22.
 */

public abstract class Unit {

  private Unit[] children;

  public Unit(Unit... children) {
    this.children = children;
  }

  /**
   * Accept visitor
   */
  public void accept(UnitVisitor visitor) {
    for (Unit child : children) {
      child.accept(visitor);
    }
  }

}
