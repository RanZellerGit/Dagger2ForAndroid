package com.example.dagger2tutorial.DI;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\u0007"}, d2 = {"Lcom/example/dagger2tutorial/DI/PetrolEngineModule;", "", "()V", "bindPetrolEngine", "Lcom/example/dagger2tutorial/Models/Engine;", "engine", "Lcom/example/dagger2tutorial/Models/PetrolEngine;", "app_debug"})
@dagger.Module()
public abstract class PetrolEngineModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract com.example.dagger2tutorial.Models.Engine bindPetrolEngine(@org.jetbrains.annotations.NotNull()
    com.example.dagger2tutorial.Models.PetrolEngine engine);
    
    public PetrolEngineModule() {
        super();
    }
}