package pl.course.customer;

import java.time.LocalDate;

class CustomerValidator {

    void validateEmail(String email) {
        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("Email jest niepoprawny");
        }
    }

    void validateDateOfBirth(LocalDate dateOfBirth) {
        if (dateOfBirth == null || dateOfBirth.getYear() > LocalDate.now().getYear()) {
            throw new IllegalArgumentException("urodzony w przyszlosci");
        }
    }
}

