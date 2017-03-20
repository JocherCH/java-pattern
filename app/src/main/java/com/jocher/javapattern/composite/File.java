package com.jocher.javapattern.composite;

import java.util.List;

/**
 * Created by wubin on 2017/3/20.
 */

public class File extends Dir {

  public File(String name) {
    super(name);
  }

  @Override
  public void addDir(Dir dir) {
    throw new UnsupportedOperationException("文件对象不支持该操作");
  }

  @Override
  public void removeDir(Dir dir) {
    throw new UnsupportedOperationException("文件对象不支持该操作");
  }

  @Override
  public void clean() {
    throw new UnsupportedOperationException("文件对象不支持该操作");
  }

  @Override
  public void print() {
    System.out.println(getName());
  }

  @Override
  public List<Dir> getDir() {
    throw new UnsupportedOperationException("文件对象不支持该操作");
  }

}
