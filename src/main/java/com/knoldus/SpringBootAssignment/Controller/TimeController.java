package com.knoldus.SpringBootAssignment.Controller;

import com.knoldus.SpringBootAssignment.Service.TimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TimeController {
    @Autowired
    TimeService timeService;


    @GetMapping("/status")
    public String getTime(){
        return "Time is : " + timeService.getTime();
    }
}
