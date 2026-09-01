package pl.course.customer;

import java.time.LocalDate;

class CustomerValidator {

    void validateEmail(String email) {
        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("Email jest niepoprawny");
        }
    }

    void validateAge(LocalDate dateOfBirth) {
        if (dateOfBirth == null) {
            throw new IllegalArgumentException("Data urodzenia jest wymagana");
        }
        if (dateOfBirth.isAfter(LocalDate.now().minusYears(18))) {
            throw new IllegalArgumentException("Klient musi miec 18 lat");
        }
    }
}

