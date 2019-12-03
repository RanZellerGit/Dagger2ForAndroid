package com.example.dagger2tutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dagger2tutorial.DI.ApplicationComponent
import com.example.dagger2tutorial.DI.ElectricEngineModule
import com.example.dagger2tutorial.Models.Car
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity() {
    @Inject
    lateinit var car1 : Car

    @Inject
    lateinit var car2 : Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        car1.engine.startEngine()
        car1.drive()

        car2.engine.startEngine()
        car2.drive()
    }
}
