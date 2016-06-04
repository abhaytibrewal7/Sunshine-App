package com.example.savita.sunshine;

import android.app.Application;
import android.content.Context;

import com.facebook.stetho.DumperPluginsProvider;
import com.facebook.stetho.Stetho;
import com.facebook.stetho.dumpapp.DumperPlugin;

import java.util.ArrayList;

/**
 * Created by Savita on 30-05-2016.
 */
public class StethoApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        final Context context = this;
        Stetho.InitializerBuilder initializerBuilder = Stetho.newInitializerBuilder(context);
        initializerBuilder.enableWebKitInspector(
                Stetho.defaultInspectorModulesProvider(context)
        );
        initializerBuilder.enableDumpapp(
                Stetho.defaultDumperPluginsProvider(context)
        );

        Stetho.Initializer initializer = initializerBuilder.build();
        Stetho.initialize(initializer);
    }
}
