package com.fathi.Aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

import java.util.Date;

@Aspect
@EnableAspectJAutoProxy
public class MyAspect {

    @Pointcut("execution(* com.fathi.model.Sumsung.*(..))")
    private void logCallTimePointCut() {
    }

    @Before("logCallTimePointCut()")
    private void logAdvice(JoinPoint jp) {
        System.out.println("someone called method in " + new Date());
    }


}
