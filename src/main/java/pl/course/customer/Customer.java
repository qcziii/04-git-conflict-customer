package pl.course.customer;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

class Customer {

    private final Long id;
    private final String firstName;
    private final String lastName;
    private final String email;
    private final String dateOfBirth;

    public Customer(Long id, String firstName, String lastName, String email, String dateOfBirth) {
        validateAge(dateOfBirth);
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
    }

    private void validateAge(String dateOfBirth) {
        LocalDate birthDate = LocalDate.parse(dateOfBirth);
        long age = ChronoUnit.YEARS.between(birthDate, LocalDate.now());
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

    String getDateOfBirth() {
        return dateOfBirth;
    }
}

