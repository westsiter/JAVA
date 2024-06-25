package com.example;

import java.time.LocalDateTime;

public class SimpleJobScheduler implements JobScheduler {

    private Job job;
    private int everySeconds;
    private int maxNumberOfExecution;
    private int counter;
    private LocalDateTime startTime;



    public JobScheduler forJob(Job job){
       this.job = job;
       return this;
    }

    @Override
    public JobScheduler everySeconds(int seconds) {
        this.everySeconds = seconds;
        return this;
    }

    @Override
    public JobScheduler repeatTimes(int count) {
        this.maxNumberOfExecution = count;
        return this;
    }

    @Override
    public JobScheduler startsAt(LocalDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    @Override
    public void listenTo(TimeEvent event) {

    }
}
