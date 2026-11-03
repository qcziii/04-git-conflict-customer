package pl.course.customer;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

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
    void shouldAcceptWhenUserIsAdult() {
        assertDoesNotThrow(() -> validator.validateAge(LocalDateTime.of(2001, 1,1,15,0)));
    }

    @Test
    void shouldThrowWhenUserIsMinor() {
        assertThrows(IllegalArgumentException.class, () -> validator.validateAge(LocalDateTime.of(2010, 1,1,15,0)));
    }
}

