package com.jocher.javapattern.momonto;

import java.util.Stack;

/**
 * Created by wubin on 2017/3/22.
 */

public class App {

  public static void main(String[] args) {
    Stack<StarMemento> states = new Stack<>();

    Star star = new Star(StarType.SUN, 10000000, 500000);
    System.out.println(star.toString());
    states.add(star.getMemento());
    star.timePasses();
    System.out.println(star.toString());
    states.add(star.getMemento());
    star.timePasses();
    System.out.println(star.toString());
    states.add(star.getMemento());
    star.timePasses();
    System.out.println(star.toString());
    states.add(star.getMemento());
    star.timePasses();
    System.out.println(star.toString());
    while (states.size() > 0) {
      star.setMemento(states.pop());
      System.out.println(star.toString());
    }
  }

}
