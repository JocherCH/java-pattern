package com.jocher.javapattern.AbstractFactory;

/**
 * Created by wubin on 2017/3/15.
 */

public class App {

  private King king;
  private Castle castle;
  private Army army;

  public void createKingdom(final KingdomFactory factory) {
    setKing(factory.createKing());
    setCastle(factory.createCastle());
    setArmy(factory.createArmy());
  }

  King getKing(final KingdomFactory factory) {
    return factory.createKing();
  }

  public King getKing() {
    return king;
  }

  private void setKing(final King king) {
    this.king = king;
  }

  Castle getCastle(final KingdomFactory factory) {
    return factory.createCastle();
  }

  public Castle getCastle() {
    return castle;
  }

  private void setCastle(final Castle castle) {
    this.castle = castle;
  }

  Army getArmy(final KingdomFactory factory) {
    return factory.createArmy();
  }

  public Army getArmy() {
    return army;
  }

  private void setArmy(final Army army) {
    this.army = army;
  }

  public static void main(String[] args) {

    App app = new App();

    System.out.println("Elf Kingdom");
    app.createKingdom(new ElfKingdomFactory());
    System.out.println(app.getArmy().getDescription());
    System.out.println(app.getCastle().getDescription());
    System.out.println(app.getKing().getDescription());

    System.out.println("Orc Kingdom");
    app.createKingdom(new OrcKingdomFactory());
    System.out.println(app.getArmy().getDescription());
    System.out.println(app.getCastle().getDescription());
    System.out.println(app.getKing().getDescription());

  }


}
