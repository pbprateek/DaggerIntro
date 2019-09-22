package com.example.daggerintro;


import dagger.Module;
import dagger.Provides;

@Module
public class DisealEngineModule {


    private int horsePower;

    public DisealEngineModule(int horsePower) {
        this.horsePower = horsePower;
    }

    @Provides
    int provideHorsePower() {
        return horsePower;
    }

    @Provides
    Engine provideEngine(DisealEngine engine) {
        return engine;
    }
}
