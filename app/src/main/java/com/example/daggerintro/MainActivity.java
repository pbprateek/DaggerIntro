package com.example.daggerintro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {


    private Car car;

    //For this to work ,variable has to be public or dagger can't change it
    @Inject
    Car car1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarComponent component = DaggerCarComponent.create();

        component.inject(MainActivity.this);
        //We can't do constructor injection here bcz we don't create MainInjection
        //So we use Field Injection ,basically for android and all

        car = component.getCar();

        car.drive();

        car1.drive();
    }
}