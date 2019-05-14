package com.cbd.movies.models;

import io.realm.RealmObject;

public class CastMember extends RealmObject {

    private Person person;
    private String character;

    public Person getPerson() {
        return person;
    }

    public String getCharacter() {
        return character;
    }
}
