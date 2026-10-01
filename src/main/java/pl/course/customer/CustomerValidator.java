package pl.course.customer;

import java.time.LocalDate;
import java.time.Period;

class CustomerValidator {

    private static final int MIN_AGE = 18;

    void validateEmail(String email) {
        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("Email jest niepoprawny");
        }
    }

    void validateAge(LocalDate date) {
        if (date == null) {
            throw new IllegalArgumentException("can't be null");
        }
        if (date.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("error");
        }
        if (Period.between(date, LocalDate.now()).getYears() < MIN_AGE) {
            throw new IllegalArgumentException("Must be 18");
        }
    }

}

