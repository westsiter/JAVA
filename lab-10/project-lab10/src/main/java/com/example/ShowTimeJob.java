package com.example;

import java.time.LocalDateTime;

public class ShowTimeJob implements Job {

    private LocalDateTime jobTime;
    public void run(){}


    public ShowTimeJob (LocalDateTime jobTime){
        this.jobTime = jobTime;
    }
    public LocalDateTime getJobTime(){
        return jobTime;
    }
    public void setJobTime(LocalDateTime jobTime){
        this.jobTime = jobTime;
    }
}
