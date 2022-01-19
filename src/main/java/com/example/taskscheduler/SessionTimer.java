package com.example.taskscheduler;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Timer;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SessionTimer {
    private Timer timer;
    private String sessionId;
}
