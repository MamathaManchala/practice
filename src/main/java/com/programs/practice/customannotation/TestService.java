package com.programs.practice;

import com.programs.practice.customannotation.LogExecutionTime;
import org.springframework.stereotype.Service;

@Service
public class TestService {

        @LogExecutionTime
        public void testMethod() {
            System.out.println("Running method...");
    }
}
