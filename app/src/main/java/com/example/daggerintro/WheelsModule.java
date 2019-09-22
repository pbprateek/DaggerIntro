package com.example.daggerintro;


import dagger.Module;
import dagger.Provides;

@Module
public abstract class WheelsModule {


    //You can also make these methods static as it adds lil bit performance

    @Provides
    static Rims provideRims(){
        return new Rims();
    }


    @Provides
    static Tires provideTires(){
       Tires tires = new Tires();
       tires.inflate();
       return tires;
    }

    @Provides
    static Wheels provideWheels(Rims rims,Tires tires){
        return new Wheels(rims,tires);
    }

}
