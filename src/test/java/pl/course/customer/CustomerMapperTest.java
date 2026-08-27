package pl.course.customer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class CustomerMapperTest {

    private final CustomerMapper mapper = new CustomerMapper();

    @Test
    void shouldMapCustomerToDto() {
        Customer customer = new Customer(1L, "Anna", "Nowak", "anna.nowak@example.com", "123123123");

        CustomerDto dto = mapper.toDto(customer);

        assertEquals(1L, dto.id());
        assertEquals("Anna", dto.firstName());
        assertEquals("Nowak", dto.lastName());
        assertEquals("123123123", dto.phoneNumber());
        assertEquals("anna.nowak@example.com", dto.email());
    }

    @Test
    void shouldMapCustomerToDtoWithNullFilds() {
        Customer customer = new Customer(null, null, null, null, null);

        CustomerDto dto = mapper.toDto(customer);

        assertNull(dto.id());
        assertNull(dto.firstName());
        assertNull(dto.lastName());
        assertNull(dto.email());
        assertNull(dto.phoneNumber());
    }


}

