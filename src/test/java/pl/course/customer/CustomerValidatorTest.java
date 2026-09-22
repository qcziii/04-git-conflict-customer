package pl.course.customer;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CustomerValidatorTest {

    private final CustomerValidator validator = new CustomerValidator();

    @Test
    void shouldAcceptValidEmail() {
        assertDoesNotThrow(() -> validator.validateEmail("anna.nowak@example.com"));
    }

    @Test
    void shouldRejectInvalidEmail() {
        assertThrows(IllegalArgumentException.class, () -> validator.validateEmail("wrong-email"));
    }

    @Test
    void shouldAcceptDateOfBirth() {
        assertDoesNotThrow(() -> validator.validateDateOfBirth(LocalDate.of(2020, 1, 1)));
    }

    @Test
    void shouldRejectInvalidDateOfBirth() {
        assertThrows(IllegalArgumentException.class, () -> validator.validateDateOfBirth(LocalDate.now().plusDays(1)));
    }
}

