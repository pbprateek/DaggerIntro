package com.example.daggerintro;


import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class DriverModule {


    private String name;

    public DriverModule(String name){
        this.name = name;
    }




    @Singleton
    @Provides
     Driver providesDriver() {
        return new Driver(name);
    }



}
