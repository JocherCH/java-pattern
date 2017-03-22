package com.jocher.javapattern.observer;

/**
 * Created by wubin on 2017/3/22.
 */

public enum WeatherType {

  SUNNY, RAINY, WINDY, COLD;

  @Override
  public String toString() {
    return this.name().toLowerCase();
  }

}
