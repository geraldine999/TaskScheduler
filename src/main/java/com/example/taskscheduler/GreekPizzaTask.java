package com.example.taskscheduler;

import java.util.TimerTask;

public class GreekPizzaTask extends TimerTask {
    @Override
    public void run() {
        System.out.println("Greek Pizza");
    }
}
