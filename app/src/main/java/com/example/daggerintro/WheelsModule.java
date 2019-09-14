package com.example.daggerintro;


import dagger.Module;
import dagger.Provides;

@Module
public class WheelsModule {


    //You can also make these methods static as it adds lil bit performance

    @Provides
    Rims provideRims(){
        return new Rims();
    }


    @Provides
    Tires provideTires(){
       Tires tires = new Tires();
       tires.inflate();
       return tires;
    }

    @Provides
    Wheels provideWheels(Rims rims,Tires tires){
        return new Wheels(rims,tires);
    }

}
