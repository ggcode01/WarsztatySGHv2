package com.skni.warsztatysghv2.registration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentService {

    @Autowired
    private UUIDStudentIdGenerator studentIdGenerator;
    @Autowired
    private StatusService statusService;
    @Autowired
    private ApplicationService applicationService;

    public void printStudent() {
        Student student = create(applicationService.createMock());
        System.out.println(student);
    }

    public Student create(Application application) {
        String id = studentIdGenerator.getNext();
        String firstName = application.getFirstName();
        String lastName = application.getLastName();
        String email = application.getEmail();
        Status status = statusService.randomStatus();
        return new Student(id, firstName, lastName, email, status); // new allowed here
    }

}
