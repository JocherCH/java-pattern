package com.jocher.javapattern.observer;

/**
 * Created by wubin on 2017/3/22.
 */

public interface WeatherObserver {

  void update(WeatherType currentWeather);

}
