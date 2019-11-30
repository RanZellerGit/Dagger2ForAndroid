package com.example.dagger2tutorial.Models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0006\u0010\u0014\u001a\u00020\u0015R\u0019\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006\u0016"}, d2 = {"Lcom/example/dagger2tutorial/Models/Car;", "", "driver", "Lcom/example/dagger2tutorial/Models/Driver;", "engine", "Lcom/example/dagger2tutorial/Models/Engine;", "wheels", "Lcom/example/dagger2tutorial/Models/Wheels;", "(Lcom/example/dagger2tutorial/Models/Driver;Lcom/example/dagger2tutorial/Models/Engine;Lcom/example/dagger2tutorial/Models/Wheels;)V", "TAG", "", "kotlin.jvm.PlatformType", "getTAG", "()Ljava/lang/String;", "getDriver", "()Lcom/example/dagger2tutorial/Models/Driver;", "getEngine", "()Lcom/example/dagger2tutorial/Models/Engine;", "getWheels", "()Lcom/example/dagger2tutorial/Models/Wheels;", "drive", "", "app_debug"})
@com.example.dagger2tutorial.DI.PerActivity()
public final class Car {
    private final java.lang.String TAG = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.dagger2tutorial.Models.Driver driver = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.dagger2tutorial.Models.Engine engine = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.dagger2tutorial.Models.Wheels wheels = null;
    
    public final java.lang.String getTAG() {
        return null;
    }
    
    public final void drive() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.dagger2tutorial.Models.Driver getDriver() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.dagger2tutorial.Models.Engine getEngine() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.dagger2tutorial.Models.Wheels getWheels() {
        return null;
    }
    
    @javax.inject.Inject()
    public Car(@org.jetbrains.annotations.NotNull()
    com.example.dagger2tutorial.Models.Driver driver, @org.jetbrains.annotations.NotNull()
    com.example.dagger2tutorial.Models.Engine engine, @org.jetbrains.annotations.NotNull()
    com.example.dagger2tutorial.Models.Wheels wheels) {
        super();
    }
}