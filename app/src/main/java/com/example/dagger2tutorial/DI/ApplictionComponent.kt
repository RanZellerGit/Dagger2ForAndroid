package com.example.dagger2tutorial.DI

import android.app.Application
import com.example.dagger2tutorial.Dagger2Tutorial
import com.example.dagger2tutorial.Models.Driver
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule

@ApplicationScope
@Component(modules = [AndroidSupportInjectionModule::class, ActivityBuildrModule::class])
    interface ApplicationComponent : AndroidInjector<Dagger2Tutorial>{

    @Component.Builder
    interface Builder{

        @BindsInstance
        fun application(application : Application) : Builder

        fun build() : ApplicationComponent
    }
}