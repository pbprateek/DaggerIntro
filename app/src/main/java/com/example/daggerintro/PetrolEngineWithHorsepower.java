package com.example.daggerintro;

import android.util.Log;


public class PetrolEngineWithHorsepower implements Engine {
    private static final String TAG = "Car";

    private int horsePower;

    public PetrolEngineWithHorsepower(int horsepower) {
        this.horsePower = horsepower;
    }

    @Override
    public void start() {
        Log.d(TAG, "Petrol engine started. Horsepower: " + horsePower);
    }
}
