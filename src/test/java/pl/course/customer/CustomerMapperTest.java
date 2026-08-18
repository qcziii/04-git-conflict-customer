package pl.course.customer;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CustomerMapperTest {

    private final CustomerMapper mapper = new CustomerMapper();

    @Test
    void shouldMapCustomerToDto() {
        Customer customer = new Customer(1L, "Anna", "Nowak", "anna.nowak@example.com", LocalDate.parse("2026-08-18"), "123456789");


        CustomerDto dto = mapper.toDto(customer);

        assertEquals(1L, dto.id());
        assertEquals("Anna", dto.firstName());
        assertEquals("Nowak", dto.lastName());
        assertEquals("anna.nowak@example.com", dto.email());
        assertEquals(LocalDate.parse("2026-08-18"), dto.dateOfBirth());
        assertEquals("123456789", dto.phoneNumber());
    }
}

