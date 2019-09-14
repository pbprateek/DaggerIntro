package com.example.daggerintro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {


    private Car car;

    //For this to work ,variable has to be public or dagger can't change it
    //@Inject
    //Car car1;

    //This will also fail now bcz one of the Module is expexting a parameter in CarComponent so Dagger can't automatically
    //build Car object,So we will have to use below method and pass value to that Module and use builder() insted of create().

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        CarComponent component = DaggerCarComponent.create();
        component.inject(MainActivity.this);
        //We can't do constructor injection here bcz we don't create MainInjection
        //So we use Field Injection ,basically for android and all
         */


        //NOW CREAte won't work bcz one of the module in CarComponent is expecting a parameter,so we will have to use builder

        CarComponent component = DaggerCarComponent.builder().petrolEngineWithHpModule(new PetrolEngineWithHpModule(100)).build();

        car = component.getCar();

        car.drive();

        //car1.drive();
    }
}




//Basically