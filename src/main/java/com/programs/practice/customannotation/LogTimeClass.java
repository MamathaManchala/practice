package com.programs.practice.customannotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Around;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class LogTimeClass {

    private static final Logger log = LoggerFactory.getLogger(LogTimeClass.class);

    @Around("@annotation(com.programs.practice.LogExecutionTime)")
    public Object logDetails(ProceedingJoinPoint joinPoint) throws Throwable {

        long start = System.currentTimeMillis();

        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();

        log.info("Method: {}", methodName);
        log.info("Arguments: {}", Arrays.toString(args));

        Object result = joinPoint.proceed();

        long end = System.currentTimeMillis();

        log.info("Execution time: {} ms", (end - start));
        log.info("Response: {}", result);

        return result;
    }
}