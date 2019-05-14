package com.cbd.movies.models;

import io.realm.RealmObject;

public class CrewMember extends RealmObject {

    private Person person;
    private String department;
    private String job;

    public Person getPerson() {
        return person;
    }

    public String getDepartment() {
        return department;
    }

    public String getJob() {
        return job;
    }
}
