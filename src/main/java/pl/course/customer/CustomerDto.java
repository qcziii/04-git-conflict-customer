package pl.course.customer;

import java.time.LocalDate;

record CustomerDto(
        Long id,
        String firstName,
        String lastName,
        String email,
        LocalDate dateOfBirth
) {
}

