package pl.course.customer;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class Customer {

    private final Long id;
    private final String firstName;
    private final String lastName;
    private final String email;
    private final String phoneNumber;
    private final LocalDate dateOfBirth;

    public Customer(Long id, String firstName, String lastName, String email, String phoneNumber, LocalDate dateOfBirth) {
        validateAge(dateOfBirth);
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
    }

    private void validateAge(LocalDate dateOfBirth) {
        long age = ChronoUnit.YEARS.between(dateOfBirth, LocalDate.now());
        if (age < 18) {
            throw new IllegalArgumentException("Age must be over 18");
        }
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

    LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    String getPhoneNumber() {
        return phoneNumber;
    }

}


