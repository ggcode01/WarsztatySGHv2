package com.skni.warsztatysghv2.registration;

import org.springframework.stereotype.Component;

import java.io.FileWriter;
import java.io.IOException;

@Component
public class FileSaver {

    public void saveToFile (Student student) {
        try {
            FileWriter fileWriter = new FileWriter("file.txt");
            fileWriter.write(student.toString());
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
