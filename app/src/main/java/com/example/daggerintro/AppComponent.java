package com.example.daggerintro;


import javax.inject.Singleton;

import dagger.Component;


@Singleton
@Component(modules = {DriverModule.class})
public interface AppComponent {

    // If we have other Classes in this Component and if we have not Exposed them explicetely then
    //Depedency will not be able to access it

    Driver getDriver();


}
