package com.example;

import java.time.LocalDateTime;

public class DescribedJob implements Job {

    private String description;
    private LocalDateTime jobTime;

    public DescribedJob(String description) {
        this.description = description;
    }
    public void run(){}
    public void setJobTime(LocalDateTime jobTime){
        this.jobTime = jobTime;
    }
    public LocalDateTime getJobTime(){
        return jobTime;
    }
}
