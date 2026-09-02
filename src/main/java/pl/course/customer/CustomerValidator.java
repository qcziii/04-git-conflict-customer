package pl.course.customer;

import java.time.LocalDate;

class CustomerValidator {

    void validateEmail(String email) {
        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("Email jest niepoprawny");
        }
    }

    void validateAge(LocalDate date) {
        if (date == null) {
            throw new IllegalArgumentException("Data urodzenia nie może być nullem.");
        }

        LocalDate now = LocalDate.now();

        if (date.isAfter(now)) {
            throw new IllegalArgumentException("Data urodzenia nie może być z przyszłości.");
        }
    }
}

