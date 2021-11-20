package com.skni.warsztatysghv2.registration;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@Component
public class StatusService {

    public Status randomStatus() {
        List<Status> statuses = new ArrayList<>(Arrays.asList(Status.values())); // new allowed here
        int randomIndex = ThreadLocalRandom.current().nextInt(0, statuses.size());
        return statuses.get(randomIndex);
    }

}
