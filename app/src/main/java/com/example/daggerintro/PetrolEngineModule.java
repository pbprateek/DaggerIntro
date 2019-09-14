package com.example.daggerintro;


import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class PetrolEngineModule {





    //Binds methods concise declared as abstract methods without a body,
    //and they are more efficient because Dagger doesn’t have to invoke them or even instantiate their containing module.

    @Binds
    abstract Engine bindEngine(PetrolEngine engine);


    /*
    @Provides
    Engine providesEngine(){
        return new PetrolEngine();
    }

    //OR


    @Provides
    Engine providesEngine(PetrolEngine petrolEngine){
        return petrolEngine;
    }
    */



}
