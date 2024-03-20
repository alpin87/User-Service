package com.example.demo;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.sql.SQLOutput;

@Aspect
@Component
public class TimeTraceAop {

    @Around("execution(* com.example..*(..))")  // 절대경로로 설정
    public Object execute(ProceedingJoinPoint joinPoint) throws Throwable{
        long start = System.currentTimeMillis();
        System.out.println("START: " + joinPoint.toString());
        try {
            return joinPoint.proceed();
        }finally {
            long finish = System.currentTimeMillis();
            long timeMS = finish - start;
            System.out.println("END : " + joinPoint.toString() + " " + timeMS + "ms");
        }
    }
}
