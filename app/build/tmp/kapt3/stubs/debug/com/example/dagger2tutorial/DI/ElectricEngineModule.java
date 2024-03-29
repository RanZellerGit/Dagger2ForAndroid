package com.example.dagger2tutorial.DI;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\b\u0010\u000b\u001a\u00020\u0003H\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\f"}, d2 = {"Lcom/example/dagger2tutorial/DI/ElectricEngineModule;", "", "horsePower", "", "(I)V", "getHorsePower", "()I", "provideElectricEngine", "Lcom/example/dagger2tutorial/Models/Engine;", "engine", "Lcom/example/dagger2tutorial/Models/ElectricEngine;", "provideHorsePower", "app_debug"})
@dagger.Module()
public final class ElectricEngineModule {
    private final int horsePower = 0;
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.example.dagger2tutorial.Models.Engine provideElectricEngine(@org.jetbrains.annotations.NotNull()
    com.example.dagger2tutorial.Models.ElectricEngine engine) {
        return null;
    }
    
    @dagger.Provides()
    public final int provideHorsePower() {
        return 0;
    }
    
    public final int getHorsePower() {
        return 0;
    }
    
    public ElectricEngineModule(int horsePower) {
        super();
    }
}