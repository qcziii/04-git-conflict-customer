package pl.course.customer;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

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
    void shouldAcceptValidAge() {
        assertDoesNotThrow(() -> validator.validateAge(LocalDate.of(2001, 10, 13)));
    }

    @Test
    void shouldRejectNullAge() {
        assertThrows(IllegalArgumentException.class, () -> validator.validateAge(null));
    }

    @Test
    void shouldRejectDateFromFuture() {
        assertThrows(IllegalArgumentException.class, () -> validator.validateAge(LocalDate.of(2026, 9, 15)));
    }
}

