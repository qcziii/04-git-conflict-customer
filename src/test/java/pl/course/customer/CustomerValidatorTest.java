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
    void shouldRejectCustomerUnder18() {
        Customer customer = new Customer(
                1L,
                "Jakub",
                "Jakub",
                "Gatek@gmail.com",
                LocalDate.now().minusYears(17).toString(),
                "8089088080"
        );

        assertThrows(
                IllegalArgumentException.class,
                () -> validator.validateAge(customer)
        );
    }
}

