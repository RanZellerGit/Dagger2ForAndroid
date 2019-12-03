package com.example.dagger2tutorial.DI

import com.example.dagger2tutorial.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuildrModule {

    @ContributesAndroidInjector(modules = [WheelsModule::class, ElectricEngineModule::class])
    @PerActivity
    abstract fun contributedMainActivity() : MainActivity
}