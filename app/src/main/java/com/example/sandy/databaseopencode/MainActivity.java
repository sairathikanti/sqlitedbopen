package com.example.sandy.databaseopencode;

import android.app.Application;

import android.os.Bundle;

import com.facebook.stetho.Stetho;

public class MainActivity extends Application {
    //Context context;

    @Override
    public void onCreate() {
        super.onCreate();

        // Create an InitializerBuilder
        try {

            Stetho.InitializerBuilder initializerBuilder =
                    Stetho.newInitializerBuilder(this);

// Enable Chrome DevTools
            initializerBuilder.enableWebKitInspector(
                    Stetho.defaultInspectorModulesProvider(this)
            );

// Enable command line interface

            initializerBuilder.enableDumpapp(
                    Stetho.defaultDumperPluginsProvider(this)
            );

// Use the InitializerBuilder to generate an Initializer

            Stetho.Initializer initializer = initializerBuilder.build();

// Initialize Stetho with the Initializer


            Stetho.initialize(initializer);

        } catch (Exception e) {

        }


    }
}


