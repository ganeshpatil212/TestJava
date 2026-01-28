package com.myproj.sheduler;

import java.time.LocalDateTime;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class MyScheduler {

    // Runs every 10 seconds
  //  @Scheduled(fixedRate = 10000)
    public void runEvery10Seconds() {
        System.out.println("Scheduler running every 10 seconds: " + LocalDateTime.now());
    }

}
