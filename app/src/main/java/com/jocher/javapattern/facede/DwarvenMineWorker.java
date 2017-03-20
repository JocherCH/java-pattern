package com.jocher.javapattern.facede;

/**
 * Created by wubin on 2017/3/20.
 */

public abstract class DwarvenMineWorker {


  static enum Action {
    GO_TO_SLEEP, WAKE_UP, GO_HOME, GO_TO_MINE, WORK
  }

  public void goToSleep(){
    System.out.println("gose to sleep" + name());
  }

  public void wakeUp() {
    System.out.println("wakes up" + name());
  }

  public void goHome() {
    System.out.println("gose to home" + name());
  }

  public void goToMine() {
    System.out.println("gose to mine" + name());
  }

  private void action(Action action) {
    switch (action) {
      case GO_TO_SLEEP:
        goToSleep();
        break;
      case WAKE_UP:
        wakeUp();
        break;
      case GO_HOME:
        goHome();
        break;
      case GO_TO_MINE:
        goToMine();
        break;
      case WORK:
        work();
        break;
      default:
        break;
    }
  }

  /**
   * Perform actions
   */
  public void action(Action... actions) {
    for (Action action : actions) {
      action(action);
    }
  }

  public abstract String name();
  public abstract void work();

}
