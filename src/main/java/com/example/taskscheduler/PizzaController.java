package com.example.taskscheduler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class PizzaController {

    private final PizzaService pizzaService;

    @Autowired
    public PizzaController(PizzaService pizzaService) {
        this.pizzaService = pizzaService;
    }

    @GetMapping("start-greek")
    public void startGreek(HttpSession httpSession){
        pizzaService.startGreekPizza(httpSession.getId());
    }

    @GetMapping("start-sicilian")
    public void startSicilian(HttpSession httpSession){
        pizzaService.startSicilianPizza(httpSession.getId());
    }


    @GetMapping("stop-all")
    public void stop(HttpSession httpSession){
        pizzaService.stop(httpSession.getId());
    }

}
