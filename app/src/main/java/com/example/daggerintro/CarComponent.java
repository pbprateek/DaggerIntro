package com.example.daggerintro;


//Component creates the Injection graph
//The injector


import dagger.Component;

//@Component
//@Component(modules ={WheelsModule.class,PetrolEngineModule.class})

@Component(modules ={WheelsModule.class,PetrolEngineWithHpModule.class})
public interface CarComponent {

    Car getCar();


    //We can't pass superclass here
    void inject(MainActivity mainActivity);
}
