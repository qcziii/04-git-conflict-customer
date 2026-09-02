package pl.course.customer;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class CustomerValidator {

    void validateEmail(String email) {
        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("Email jest niepoprawny");
        }
    }
     void validateAge(LocalDate dateOfBirth) {
        if (ChronoUnit.YEARS.between(dateOfBirth, LocalDate.now()) < 18) {
            throw new IllegalArgumentException("Age must be over 18");
        }
    }
}

