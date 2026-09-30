package pl.course.customer;

import java.time.LocalDate;

class CustomerValidator {



    void validateBirthdate(LocalDate date){
     if(date == null){
         throw new IllegalArgumentException("Cannot be null");
     }
        LocalDate today = LocalDate.now();
     if(date.isAfter(today)){
         throw new IllegalArgumentException("Cannot be in future");
     }
    }

    void validateEmail(String email) {
        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("Email jest niepoprawny");
        }
    }
}

