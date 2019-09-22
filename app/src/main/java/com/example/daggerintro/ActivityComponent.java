package com.example.daggerintro;


//Component creates the Injection graph
//The injector


import javax.inject.Named;
import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.Subcomponent;

//@Component

//We also will have to annotate the Componenet with Singeleton,Even if one Class in the Component is Singeleton
//We can also put Singelton Directly above @Bind or @Provides



//Now we will convert this Component to Subcomponent,then it will be able to access all the dependency graph of
//Parent Component without Exposing them Explictly in Parent Component

@PerActivity
@Subcomponent(modules = {WheelsModule.class,DisealEngineModule.class})
public interface ActivityComponent {


    Car getCar();

    //We can't pass superclass here,So if we have something like BaseActivity ,that won't work
    void inject(MainActivity mainActivity);

}
