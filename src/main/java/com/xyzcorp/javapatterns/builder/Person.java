package com.xyzcorp.javapatterns.builder;

public class Person {
    private String firstName;
    private String middleName;
    private String lastName;

    protected Person(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }
}
