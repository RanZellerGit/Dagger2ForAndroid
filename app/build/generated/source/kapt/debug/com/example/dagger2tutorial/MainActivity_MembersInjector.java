// Generated by Dagger (https://google.github.io/dagger).
package com.example.dagger2tutorial;

import com.example.dagger2tutorial.Models.Car;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class MainActivity_MembersInjector implements MembersInjector<MainActivity> {
  private final Provider<Car> car1AndCar2Provider;

  public MainActivity_MembersInjector(Provider<Car> car1AndCar2Provider) {
    this.car1AndCar2Provider = car1AndCar2Provider;
  }

  public static MembersInjector<MainActivity> create(Provider<Car> car1AndCar2Provider) {
    return new MainActivity_MembersInjector(car1AndCar2Provider);
  }

  @Override
  public void injectMembers(MainActivity instance) {
    injectCar1(instance, car1AndCar2Provider.get());
    injectCar2(instance, car1AndCar2Provider.get());
  }

  public static void injectCar1(MainActivity instance, Car car1) {
    instance.car1 = car1;
  }

  public static void injectCar2(MainActivity instance, Car car2) {
    instance.car2 = car2;
  }
}
