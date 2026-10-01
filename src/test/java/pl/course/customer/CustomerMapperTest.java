package pl.course.customer;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CustomerMapperTest {

    private final CustomerMapper mapper = new CustomerMapper();

    @Test
    void shouldMapCustomerToDto() {
        Customer customer = new Customer(1L, "Anna", "Nowak", "anna.nowak@example.com","789789567",LocalDate.of(1994, 11, 25));

        CustomerDto dto = mapper.toDto(customer);

        assertEquals(1L, dto.id());
        assertEquals("Anna", dto.firstName());
        assertEquals("Nowak", dto.lastName());
        assertEquals("anna.nowak@example.com", dto.email());
        assertEquals("789789567",dto.phoneNumber());


    }
}

