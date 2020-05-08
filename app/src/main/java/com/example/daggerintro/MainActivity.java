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




        //Also if we create one more component then it will have different instance of Driver,So singeleton is only in one
        //Component,For Global Singeleton we will see

        //This won't work now bcz ActivityComponent is a Subcomponent,so we will have to access it using it's parent Component
        /*ActivityComponent component = DaggerActivityComponent.builder().horsePower(1500).engineCapacity(1500)
                .appComponent(((ExampleApplication) getApplication()).getAppComponent()).build();

         */


        /*
        ActivityComponent component = ((ExampleApplication)getApplication()).getAppComponent().getActivityComponentBuilder()
                .engineCapacity(170).horsePower(190).build();

         */

        ActivityComponent component = ((ExampleApplication)getApplication()).getAppComponent().getActivityComponentFactory().create(170,150);



        component.inject(MainActivity.this);
        //We can't do constructor injection here bcz we don't create MainInjection
        //So we use Field Injection ,basically for android and all

        car = component.getCar();

        car.drive();

        car1.drive();



        //Now we can see in log that instance of car and Driver are same for both car and car1,but if we rotate the device instance
        //of Car will be changed but for driver it will be same bcz that's app level
    }
}
