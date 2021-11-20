package com.skni.warsztatysghv2;

import com.skni.warsztatysghv2.registration.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class WarsztatySgHv2Application {

    @Autowired
    private StudentService studentService;

    public static void main(String[] args) {
        SpringApplication.run(WarsztatySgHv2Application.class, args);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void doAfterStartup() {
        studentService.printStudent();
    }
}
