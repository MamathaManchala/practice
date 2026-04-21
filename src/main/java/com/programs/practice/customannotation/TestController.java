package com.programs.practice.customannotation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/add")
    @LogExecutionTime
    public int add() {
        return 10 + 20;
    }
}
