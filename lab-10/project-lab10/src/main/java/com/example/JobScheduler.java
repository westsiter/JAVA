package com.example;

import java.time.LocalDateTime;

public interface JobScheduler {
    JobScheduler forJob(Job job);
    JobScheduler everySeconds(int seconds);
    JobScheduler repeatTimes(int count);
    JobScheduler startsAt(LocalDateTime startTime);
    void listenTo(TimeEvent event);
}
