package com.example.taskscheduler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.Timer;
import java.util.TimerTask;

@SpringBootApplication
@EnableScheduling
public class TaskSchedulerApplication {

    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(TaskSchedulerApplication.class, args);

     /*   //TimerTask is the task to perform and Timer is the scheduler.

        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                System.out.println("Neapolitan Pizza");
            }
        };

        Timer timer = new Timer();
        timer.schedule(timerTask, 1000); //prints one time only, after a second of initial delay

        //FIXED DELAY
        Timer timer1 = new Timer();
        timer1.schedule(new GreekPizzaTask(), 0, 2000);// prints every two seconds with no initial delay

        TimerTask sicilianPizza = new TimerTask() {
            @Override
            public void run() {
                System.out.println("Sicilian Pizza");
            }
        };


        //FIXED RATE
       // new Timer().scheduleAtFixedRate(sicilianPizza, 0, 3000);
        //in fixed rate, executions are not delayed by the previous ones- as they are in fixed delay

      */

    }

    //Spring Scheduler
    @Scheduled(fixedDelay = 1000, initialDelay = 1000)
    public void task(){
        System.out.println("Chicago Pizza.");
    }



}
