// Generated by Dagger (https://google.github.io/dagger).
package com.example.dagger2tutorial.DI;

import com.example.dagger2tutorial.Models.Rims;
import com.example.dagger2tutorial.Models.Tires;
import com.example.dagger2tutorial.Models.Wheels;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

public final class WheelsModule_ProvideWheelsFactory implements Factory<Wheels> {
  private final WheelsModule module;

  private final Provider<Rims> rimsProvider;

  private final Provider<Tires> tiresProvider;

  public WheelsModule_ProvideWheelsFactory(
      WheelsModule module, Provider<Rims> rimsProvider, Provider<Tires> tiresProvider) {
    this.module = module;
    this.rimsProvider = rimsProvider;
    this.tiresProvider = tiresProvider;
  }

  @Override
  public Wheels get() {
    return provideWheels(module, rimsProvider.get(), tiresProvider.get());
  }

  public static WheelsModule_ProvideWheelsFactory create(
      WheelsModule module, Provider<Rims> rimsProvider, Provider<Tires> tiresProvider) {
    return new WheelsModule_ProvideWheelsFactory(module, rimsProvider, tiresProvider);
  }

  public static Wheels provideWheels(WheelsModule instance, Rims rims, Tires tires) {
    return Preconditions.checkNotNull(
        instance.provideWheels(rims, tires),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
