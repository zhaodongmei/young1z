package com.demo.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class ScheduleTask {

    @Scheduled(cron = "*/6 * * * * ?")
    private void process() {
        System.out.println("schedule task run " + new Date());
    }
    @Scheduled(fixedRate = 6000)
    private void process1(){
        System.out.println("schedule1 task run " + new Date());
    }
}
