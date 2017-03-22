package com.jocher.javapattern.visitor;

/**
 * Created by wubin on 2017/3/22.
 */

public class App {

  public static void main(String[] args) {

    Commander commander =
        new Commander(new Sergeant(new Soldier(), new Soldier(), new Soldier()), new Sergeant(
            new Soldier(), new Soldier(), new Soldier()));
    commander.accept(new SoldierVisitor());
    commander.accept(new SergeantVisitor());
    commander.accept(new CommanderVisitor());

  }

}
