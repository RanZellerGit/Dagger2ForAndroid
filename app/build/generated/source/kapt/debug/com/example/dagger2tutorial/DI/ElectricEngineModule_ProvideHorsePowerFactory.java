// Generated by Dagger (https://google.github.io/dagger).
package com.example.dagger2tutorial.DI;

import dagger.internal.Factory;

public final class ElectricEngineModule_ProvideHorsePowerFactory implements Factory<Integer> {
  private final ElectricEngineModule module;

  public ElectricEngineModule_ProvideHorsePowerFactory(ElectricEngineModule module) {
    this.module = module;
  }

  @Override
  public Integer get() {
    return provideHorsePower(module);
  }

  public static ElectricEngineModule_ProvideHorsePowerFactory create(ElectricEngineModule module) {
    return new ElectricEngineModule_ProvideHorsePowerFactory(module);
  }

  public static int provideHorsePower(ElectricEngineModule instance) {
    return instance.provideHorsePower();
  }
}
