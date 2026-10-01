package pl.course.customer;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeParseException;

class CustomerValidator {

    void validateEmail(String email) {
        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("Email jest niepoprawny");
        }


    }

    void validateAge(Customer customer) {
        if (customer == null || customer.getDateOfBirth() == null) {
            throw new IllegalArgumentException("Customer is null!");
        }
        try {
            LocalDate dateOfBirth = LocalDate.parse(customer.getDateOfBirth());
            if (dateOfBirth.isAfter(LocalDate.now())) {

                throw new IllegalArgumentException("Date can not be in the future");
            }
            int age = Period.between(dateOfBirth, LocalDate.now()).getYears();

            if (age < 18) {
                throw new IllegalArgumentException("Client have to 18 years old");
            }

        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException("Incorrect date format", e);
        }

    }


}

