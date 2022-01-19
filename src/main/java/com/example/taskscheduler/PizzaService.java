package com.example.taskscheduler;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;


@Service
public class PizzaService {

    private List<SessionTimer> sessionTimerList = new ArrayList<>();

    public PizzaService() {
    }

    public void startGreekPizza(String sessionId) {
        SessionTimer sessionTimer = new SessionTimer(new Timer(), sessionId);
        sessionTimerList.add(sessionTimer);
        sessionTimer.getTimer().scheduleAtFixedRate(new GreekPizzaTask(), 0, 1000L);
    }

    public void startSicilianPizza(String sessionId) {
        SessionTimer sessionTimer = new SessionTimer(new Timer(), sessionId);
        sessionTimerList.add(sessionTimer);
        sessionTimer.getTimer().scheduleAtFixedRate(new SicilianPizzaTask(), 0, 1000L);
    }

    public void stop(String sessionId) {
        for (SessionTimer s: sessionTimerList) {
            if(s.getSessionId().equals(sessionId)){
                s.getTimer().cancel();
            }
        }
    }


}
