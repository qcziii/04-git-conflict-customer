package pl.course.customer;

class CustomerMapper {

    CustomerDto toDto(Customer customer) {
        return new CustomerDto(
                customer.getId(),
                customer.getFirstName(),
                customer.getLastName(),
                customer.getDateOfBirth(),
                customer.getEmail(),
                customer.getPhoneNumber()
        );
    }
}

