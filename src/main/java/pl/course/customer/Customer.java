package pl.course.customer;

import java.time.LocalDate;

class Customer {

    private final Long id;
    private final String firstName;
    private final String lastName;
    private final String email;
    private final LocalDate dateOfBirth;

    Customer(Long id, String firstName, String lastName, String email, LocalDate dateOfBirth) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
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

    String getEmail() {
        return email;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
}

