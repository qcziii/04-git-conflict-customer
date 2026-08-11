package pl.course.customer;

import org.junit.jupiter.api.Test;

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
}

