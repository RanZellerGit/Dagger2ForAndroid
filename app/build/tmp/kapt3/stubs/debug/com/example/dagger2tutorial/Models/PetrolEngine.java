package com.example.dagger2tutorial.Models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\b\u0010\t\u001a\u00020\nH\u0016R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u000b"}, d2 = {"Lcom/example/dagger2tutorial/Models/PetrolEngine;", "Lcom/example/dagger2tutorial/Models/Engine;", "horsePower", "", "engineCapacity", "(II)V", "getEngineCapacity", "()I", "getHorsePower", "startEngine", "", "app_debug"})
public final class PetrolEngine implements com.example.dagger2tutorial.Models.Engine {
    private final int horsePower = 0;
    private final int engineCapacity = 0;
    
    @java.lang.Override()
    public void startEngine() {
    }
    
    public final int getHorsePower() {
        return 0;
    }
    
    public final int getEngineCapacity() {
        return 0;
    }
    
    @javax.inject.Inject()
    public PetrolEngine(@javax.inject.Named(value = "horsePower")
    int horsePower, @javax.inject.Named(value = "engineCapacity")
    int engineCapacity) {
        super();
    }
}