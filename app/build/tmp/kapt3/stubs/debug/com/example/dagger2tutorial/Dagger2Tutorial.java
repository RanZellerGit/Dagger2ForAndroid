package com.example.dagger2tutorial;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u000b"}, d2 = {"Lcom/example/dagger2tutorial/Dagger2Tutorial;", "Landroid/app/Application;", "()V", "appComponent", "Lcom/example/dagger2tutorial/DI/ApplicationComponent;", "getAppComponent", "()Lcom/example/dagger2tutorial/DI/ApplicationComponent;", "setAppComponent", "(Lcom/example/dagger2tutorial/DI/ApplicationComponent;)V", "onCreate", "", "app_debug"})
public final class Dagger2Tutorial extends android.app.Application {
    @org.jetbrains.annotations.NotNull()
    public com.example.dagger2tutorial.DI.ApplicationComponent appComponent;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.dagger2tutorial.DI.ApplicationComponent getAppComponent() {
        return null;
    }
    
    public final void setAppComponent(@org.jetbrains.annotations.NotNull()
    com.example.dagger2tutorial.DI.ApplicationComponent p0) {
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    public Dagger2Tutorial() {
        super();
    }
}