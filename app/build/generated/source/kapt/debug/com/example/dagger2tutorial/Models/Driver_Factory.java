// Generated by Dagger (https://google.github.io/dagger).
package com.example.dagger2tutorial.Models;

import dagger.internal.Factory;

public final class Driver_Factory implements Factory<Driver> {
  private static final Driver_Factory INSTANCE = new Driver_Factory();

  @Override
  public Driver get() {
    return new Driver();
  }

  public static Driver_Factory create() {
    return INSTANCE;
  }

  public static Driver newInstance() {
    return new Driver();
  }
}