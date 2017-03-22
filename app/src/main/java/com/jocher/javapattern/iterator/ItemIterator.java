package com.jocher.javapattern.iterator;

/**
 * Created by wubin on 2017/3/22.
 */

public interface ItemIterator<T> {

  boolean hasNext();

  T next();

}
