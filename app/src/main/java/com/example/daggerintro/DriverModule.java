package com.example.daggerintro;


import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public abstract class DriverModule {

    @Singleton
    @Provides
    static Driver providesDriver() {
        return new Driver();
    }
}
