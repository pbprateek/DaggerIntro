package com.example.daggerintro;


import javax.inject.Singleton;

import dagger.Component;


@Singleton
@Component(modules = {DriverModule.class})
public interface AppComponent {


    Driver getDriver();


}