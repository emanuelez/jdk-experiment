package com.example.emanuelez.jdkexperiment.models;

import io.realm.RealmObject;

public class Dog extends RealmObject {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
