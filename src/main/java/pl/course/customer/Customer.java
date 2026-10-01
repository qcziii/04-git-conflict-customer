package pl.course.customer;

import java.time.LocalDate;

class Customer {

    private final Long id;
    private final String firstName;
    private final String lastName;
    private final LocalDate dateOfBirth;
    private final String email;

    Customer(Long id, String firstName, String lastName, LocalDate dateOfBirth, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
    }

    Long getId() {
        return id;
    }

    String getFirstName() {
        return firstName;
    }

    String getLastName() {
        return lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    String getEmail() {
        return email;
    }
}

