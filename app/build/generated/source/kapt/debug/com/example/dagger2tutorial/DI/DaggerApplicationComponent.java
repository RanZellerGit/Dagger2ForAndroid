// Generated by Dagger (https://google.github.io/dagger).
package com.example.dagger2tutorial.DI;

import com.example.dagger2tutorial.MainActivity;
import com.example.dagger2tutorial.MainActivity_MembersInjector;
import com.example.dagger2tutorial.Models.Car;
import com.example.dagger2tutorial.Models.Car_Factory;
import com.example.dagger2tutorial.Models.Driver;
import com.example.dagger2tutorial.Models.Driver_Factory;
import com.example.dagger2tutorial.Models.ElectricEngine;
import com.example.dagger2tutorial.Models.ElectricEngine_Factory;
import com.example.dagger2tutorial.Models.Engine;
import com.example.dagger2tutorial.Models.Rims;
import com.example.dagger2tutorial.Models.Tires;
import com.example.dagger2tutorial.Models.Wheels;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import javax.inject.Provider;

public final class DaggerApplicationComponent implements ApplicationComponent {
  private Provider<Driver> driverProvider;

  private DaggerApplicationComponent() {

    initialize();
  }

  public static Builder builder() {
    return new Builder();
  }

  public static ApplicationComponent create() {
    return new Builder().build();
  }

  @SuppressWarnings("unchecked")
  private void initialize() {
    this.driverProvider = DoubleCheck.provider(Driver_Factory.create());
  }

  @Override
  public ActivityComponent getActivityComponent(ElectricEngineModule electricEngineModule) {
    Preconditions.checkNotNull(electricEngineModule);
    return new ActivityComponentImpl(electricEngineModule);
  }

  public static final class Builder {
    private Builder() {}

    public ApplicationComponent build() {
      return new DaggerApplicationComponent();
    }
  }

  private final class ActivityComponentImpl implements ActivityComponent {
    private final WheelsModule wheelsModule;

    private Provider<Integer> provideHorsePowerProvider;

    private Provider<ElectricEngine> electricEngineProvider;

    private Provider<Engine> provideElectricEngineProvider;

    private Provider<Rims> provideRimsProvider;

    private Provider<Tires> provideTiresProvider;

    private Provider<Wheels> provideWheelsProvider;

    private Provider<Car> carProvider;

    private ActivityComponentImpl(ElectricEngineModule electricEngineModuleParam) {
      this.wheelsModule = new WheelsModule();
      initialize(electricEngineModuleParam);
    }

    @SuppressWarnings("unchecked")
    private void initialize(final ElectricEngineModule electricEngineModuleParam) {
      this.provideHorsePowerProvider =
          ElectricEngineModule_ProvideHorsePowerFactory.create(electricEngineModuleParam);
      this.electricEngineProvider = ElectricEngine_Factory.create(provideHorsePowerProvider);
      this.provideElectricEngineProvider =
          ElectricEngineModule_ProvideElectricEngineFactory.create(
              electricEngineModuleParam, electricEngineProvider);
      this.provideRimsProvider = WheelsModule_ProvideRimsFactory.create(wheelsModule);
      this.provideTiresProvider = WheelsModule_ProvideTiresFactory.create(wheelsModule);
      this.provideWheelsProvider =
          WheelsModule_ProvideWheelsFactory.create(
              wheelsModule, provideRimsProvider, provideTiresProvider);
      this.carProvider =
          DoubleCheck.provider(
              Car_Factory.create(
                  DaggerApplicationComponent.this.driverProvider,
                  provideElectricEngineProvider,
                  provideWheelsProvider));
    }

    @Override
    public void inject(MainActivity mainActivity) {
      injectMainActivity(mainActivity);
    }

    private MainActivity injectMainActivity(MainActivity instance) {
      MainActivity_MembersInjector.injectCar1(instance, carProvider.get());
      MainActivity_MembersInjector.injectCar2(instance, carProvider.get());
      return instance;
    }
  }
}
