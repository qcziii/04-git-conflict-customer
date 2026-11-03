package pl.course.customer;

import java.time.LocalDateTime;

record CustomerDto(
        Long id,
        String firstName,
        String lastName,
        String email,
        LocalDateTime dateOfBirth
) {
}

