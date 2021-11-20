package com.skni.warsztatysghv2.registration;

import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class UUIDStudentIdGenerator {
    public String getNext() {
        return UUID.randomUUID().toString();
    }
}
