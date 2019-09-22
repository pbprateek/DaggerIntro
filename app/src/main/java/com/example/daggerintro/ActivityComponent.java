package com.example.daggerintro;


//Component creates the Injection graph
//The injector


import javax.inject.Named;
import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;

//@Component

//We also will have to annotate the Componenet with Singeleton,Even if one Class in the Component is Singeleton
//We can also put Singelton Directly above @Bind or @Provides



@PerActivity
@Component(dependencies = {AppComponent.class},modules = {WheelsModule.class,PetrolEngineModule.class})
public interface ActivityComponent {


    Car getCar();

    //We can't pass superclass here,So if we have something like BaseActivity ,that won't work
    void inject(MainActivity mainActivity);


    @Component.Builder
    interface Builder{

        @BindsInstance
        Builder horsePower(@Named("horse power") int horsePower);

        @BindsInstance
        Builder engineCapacity(@Named("engine capacity") int engineCapacity);

        Builder appComponent(AppComponent appComponent);

        ActivityComponent build();

    }
}
