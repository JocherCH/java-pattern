package com.jocher.javapattern.visitor;

/**
 * Created by wubin on 2017/3/22.
 */

public class Sergeant extends Unit{

  public Sergeant(Unit... children) {
    super(children);
  }

  @Override
  public void accept(UnitVisitor visitor) {
    visitor.visitSergeant(this);
    super.accept(visitor);
  }

  @Override
  public String toString() {
    return "sergeant";
  }

}
