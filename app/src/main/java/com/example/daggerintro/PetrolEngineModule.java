package com.example.daggerintro;


import dagger.Module;
import dagger.Provides;

@Module
public class PetrolEngineModule {


    @Provides
    Engine provideEngine(PetrolEngine petrolEngine){
        return petrolEngine;
    }


}
