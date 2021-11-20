package com.skni.warsztatysghv2.registration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentService {

    private UUIDStudentIdGenerator studentIdGenerator;
    private StatusService statusService;
    private ApplicationService applicationService;

    @Autowired
    public void setStudentIdGenerator(UUIDStudentIdGenerator studentIdGenerator) {
        this.studentIdGenerator = studentIdGenerator;
    }

    @Autowired
    public void setStatusService(StatusService statusService) {
        this.statusService = statusService;
    }

    @Autowired
    public void setApplicationService(ApplicationService applicationService) {
        this.applicationService = applicationService;
    }

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
