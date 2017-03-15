package com.jocher.javapattern.FactoryMethod;

/**
 * Created by wubin on 2017/3/15.
 */

public class App {

  private Blacksmith blacksmith;

  public App(Blacksmith blacksmith) {
    this.blacksmith = blacksmith;
  }

  public static void main(String[] args){
    App app = new App(new OrcBlacksmith());
    app.manufactureWeapons();

    app = new App(new ElfBlacksmith());
    app.manufactureWeapons();
  }

  private void manufactureWeapons(){
    Weapon weapon;
    weapon = blacksmith.manufactureWeapon(WeaponType.SPEAR);
    System.out.println(weapon.toString());
    weapon = blacksmith.manufactureWeapon(WeaponType.AXE);
    System.out.println(weapon.toString());

  }

}
