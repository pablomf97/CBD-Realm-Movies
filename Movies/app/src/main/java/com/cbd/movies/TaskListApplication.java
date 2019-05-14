package com.cbd.movies;

import android.app.Application;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;

import io.realm.Realm;
import io.realm.RealmConfiguration;

public class TaskListApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Realm.init(this);
        RealmConfiguration realmConfig = new RealmConfiguration.Builder()
                .name("tasky.realm")
                .schemaVersion(0)
                .build();
        Realm.setDefaultConfiguration(realmConfig);
    }
}
