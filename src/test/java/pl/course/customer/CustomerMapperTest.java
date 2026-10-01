package pl.course.customer;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CustomerMapperTest {

    private final CustomerMapper mapper = new CustomerMapper();

    @Test
    void shouldMapCustomerToDto() {
        Customer customer = new Customer(1L, "Anna", "Nowak", LocalDate.of(1994, 11, 25), "anna.nowak@example.com");

        CustomerDto dto = mapper.toDto(customer);

        assertEquals(1L, dto.id());
        assertEquals("Anna", dto.firstName());
        assertEquals("Nowak", dto.lastName());
        assertEquals("anna.nowak@example.com", dto.email());
    }
}

