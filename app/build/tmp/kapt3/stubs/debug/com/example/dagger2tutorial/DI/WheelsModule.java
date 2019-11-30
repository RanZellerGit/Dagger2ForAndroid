package com.example.dagger2tutorial.DI;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\b\u0010\u0005\u001a\u00020\u0006H\u0007J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0006H\u0007\u00a8\u0006\u000b"}, d2 = {"Lcom/example/dagger2tutorial/DI/WheelsModule;", "", "()V", "provideRims", "Lcom/example/dagger2tutorial/Models/Rims;", "provideTires", "Lcom/example/dagger2tutorial/Models/Tires;", "provideWheels", "Lcom/example/dagger2tutorial/Models/Wheels;", "rims", "tires", "app_debug"})
@dagger.Module()
public final class WheelsModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.example.dagger2tutorial.Models.Rims provideRims() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.example.dagger2tutorial.Models.Tires provideTires() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.example.dagger2tutorial.Models.Wheels provideWheels(@org.jetbrains.annotations.NotNull()
    com.example.dagger2tutorial.Models.Rims rims, @org.jetbrains.annotations.NotNull()
    com.example.dagger2tutorial.Models.Tires tires) {
        return null;
    }
    
    public WheelsModule() {
        super();
    }
}