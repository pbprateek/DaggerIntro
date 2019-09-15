package com.example.daggerintro;


//Component creates the Injection graph
//The injector


import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;

//@Component

@Component(modules = {WheelsModule.class,PetrolEngineModule.class})
public interface CarComponent {

    Car getCar();


    //We can't pass superclass here
    void inject(MainActivity mainActivity);


    @Component.Builder
    interface Builder{

        @BindsInstance
        Builder horsePower(@Named("horse power") int horsePower);

        @BindsInstance
        Builder engineCapacity(@Named("engine capacity") int engineCapacity);

        CarComponent build();

    }
}
