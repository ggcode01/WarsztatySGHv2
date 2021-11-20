package com.skni.warsztatysghv2.registration;

import org.springframework.stereotype.Component;

@Component
public class ApplicationFormService {
    public ApplicationForm createMock() {
        return new ApplicationForm("Mikolaj", "Zimkowski", "email@gmail.com"); // new allowed here
    }
}
