package com.example.daggerintro;


import dagger.Module;
import dagger.Provides;

@Module
public class PetrolEngineWithHpModule {

    private int horsePower;

    public PetrolEngineWithHpModule(int horsePower) {
        this.horsePower = horsePower;
    }




    //Also we can't use bind here bcz then we can't pass parameter to constructor
    @Provides
    Engine providesEngine() {
        return new PetrolEngineWithHorsepower(horsePower);
    }

}
