package com.xyzcorp.tdd;

import java.time.LocalDate;
import java.util.function.Supplier;

import static java.time.temporal.ChronoUnit.YEARS;

public class Programmer {

    private final String firstName;
    private final String lastName;
    private final LocalDate birthDate;
    private final Supplier<LocalDate> todaysDateSupplier;

    protected Programmer(String firstName,
                      String lastName,
                      LocalDate birthDate,
                      Supplier<LocalDate> todaysDateSupplier) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.todaysDateSupplier = todaysDateSupplier;
    }

    public static Programmer of(String firstName, String lastName, LocalDate birthDate) {
        return new Programmer(firstName, lastName, birthDate, LocalDate::now);
    }

    public int getAge() {
        return (int) YEARS.between(birthDate,todaysDateSupplier.get());
    }

    public String fullName() {
        return String.format("%s %s", firstName, lastName);
    }
}
