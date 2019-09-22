package com.example.daggerintro;

import android.app.Application;

public class ExampleApplication extends Application {

    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        appComponent = DaggerAppComponent.factory().create(new DriverModule("Prateek"));
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }
}
