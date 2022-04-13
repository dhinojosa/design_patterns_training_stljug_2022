package com.xyzcorp.tdd;

import java.time.LocalDate;
import java.util.function.Supplier;

import static java.time.temporal.ChronoUnit.YEARS;

public class Programmer {

    private final String firstName;
    private final String lastName;
    private final LocalDate birthDate;
    private final Supplier<LocalDate> todaysDateSupplier;

    public Programmer(String firstName,
                      String lastName,
                      LocalDate birthDate,
                      Supplier<LocalDate> todaysDateSupplier) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.todaysDateSupplier = todaysDateSupplier;
    }

    public int getAge() {
        return (int) YEARS.between(birthDate,todaysDateSupplier.get());
    }

    public String fullName() {
        return String.format("%s %s", firstName, lastName);
    }
}
