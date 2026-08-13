package pl.course.customer;

class CustomerValidator {

    void validateEmail(String email) {
        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("Email jest niepoprawny");
        }
    }

    void validateAge(String dateOfBirth) {
        if (dateOfBirth == null || dateOfBirth.endsWith("2020")){
            throw new IllegalArgumentException("Za młody");
        }
    }
}

