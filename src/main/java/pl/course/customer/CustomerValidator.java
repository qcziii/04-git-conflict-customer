package pl.course.customer;

import java.time.LocalDateTime;

class CustomerValidator {

    void validateEmail(String email) {
        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("Email jest niepoprawny");
        }
    }

    void validateAge(LocalDateTime dateOfBirth) {
        if (dateOfBirth == null) {
            throw new IllegalArgumentException("Data urodzenia jest wymagana");
        }
        if (dateOfBirth.isAfter(LocalDateTime.now().minusYears(18L))) {
            throw new IllegalArgumentException("Użytkownik jest niepełnoletni");
        }
    }
}

