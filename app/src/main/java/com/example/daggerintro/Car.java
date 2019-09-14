package com.example.daggerintro;

import android.util.Log;

import javax.inject.Inject;

public class Car {

    public static final String TAG = "Car";


    private Wheels wheels;

    //Engine is an interface so it will automatically provide the implementation if exists in the CarComponent if we have added
    //the module
    @Inject
    Engine engine; //Field injection but no need of any component


    //Now dagger knows how to Construct a car but for this to work it should also know the same abt Engine and Wheels

    @Inject
    public Car(Wheels wheels) {
        this.wheels = wheels;
    }


    //This is method injection less commonly used,so here dagger will create Remote for us and inject in into this method
    //It will automatically get triggered..
    //It happens in Following order: Constructor -> Field -> Method

    @Inject
    public void enableRemote(Remote remote) {
        remote.setListener(this);
    }

    //Can't think of proper usecase for Method Injection


    public void drive() {
        engine.start();
        Log.d(TAG, "driving...");
    }
}
