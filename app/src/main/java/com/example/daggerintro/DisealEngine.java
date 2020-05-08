package com.example.daggerintro;

import android.util.Log;

import javax.inject.Inject;

public class DisealEngine  implements Engine{

    private static final String TAG = "Car";

    private int horsePower;

    @Inject
    public DisealEngine(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public void start() {
        Log.d(TAG, "Diesel engine started. Horsepower: " + horsePower);
    }
}
