package pl.course.customer;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CustomerMapperTest {

    private final CustomerMapper mapper = new CustomerMapper();
    private final CustomerValidator validator = new CustomerValidator();

    @Test
    void shouldMapCustomerToDto() {

        Customer customer = new Customer(1L, "Anna", "Nowak", "anna.nowak@example.com", LocalDate.of(1990, 5, 20), "123123123");

        CustomerDto dto = mapper.toDto(customer);

        assertEquals(1L, dto.id());
        assertEquals("Anna", dto.firstName());
        assertEquals("Nowak", dto.lastName());
        assertEquals("123123123", dto.phoneNumber());
        assertEquals("anna.nowak@example.com", dto.email());
        assertEquals(LocalDate.of(1990, 5, 20), dto.dateOfBirth());
    }

    @Test
    void shouldntMapCustomerToDtoWithNullFilds() {

        assertThrows(IllegalArgumentException.class, () -> new Customer(null, null, null, null, null, null));
    }

    @Test
    void shouldMapCustomerToDtoWithNullFilds() {
        Customer customer = new Customer(null, null, null, null, LocalDate.of(1990, 5, 20), null);

        CustomerDto dto = mapper.toDto(customer);

        assertNull(dto.id());
        assertNull(dto.firstName());
        assertNull(dto.lastName());
        assertNull(dto.email());
        assertNull(dto.phoneNumber());
    }


}

