package com.jocher.javapattern.observer;

/**
 * Created by wubin on 2017/3/22.
 */

public class App {

  public static void main(String[] args){
    Weather weather = new Weather();
    weather.addObserver(new Orcs());
    weather.addObserver(new Hobbits());

    weather.timePasses();
    weather.timePasses();
    weather.timePasses();
    weather.timePasses();
  }

}
