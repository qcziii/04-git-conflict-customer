package pl.course.customer;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CustomerMapperTest {

    private final CustomerMapper mapper = new CustomerMapper();

    @Test
    void shouldMapCustomerToDto() {
        LocalDate dateOfBirth = LocalDate.of(1998, 5, 22);
        Customer customer = new Customer(1L, "Anna", "Nowak", "anna.nowak@example.com", dateOfBirth,  "+48123456789");

        CustomerDto dto = mapper.toDto(customer);

        assertEquals(1L, dto.id());
        assertEquals("Anna", dto.firstName());
        assertEquals("Nowak", dto.lastName());
        assertEquals("anna.nowak@example.com", dto.email());
        assertEquals("+48123456789", dto.phoneNumber());
    }
}

