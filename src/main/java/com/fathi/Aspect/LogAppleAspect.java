package com.fathi.Aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;


@Aspect
@EnableAspectJAutoProxy
@Component

public class LogAppleAspect {
    //point cut is a expersion language
    @Pointcut("execution(* com.fathi.model.Apple.*(..))")
    private void applePointCut() {
    }

    @Before("applePointCut()")
    private void amirBeforeAdvice(JoinPoint jp) {
        System.out.println("Im in before ...");
        final Signature signature = jp.getSignature();
        System.out.println(signature);
        final Object target = jp.getTarget();
        System.out.println(target);
        System.out.println("******************************");
    }

//    @After("applePointCut()")
//    private void amirAfterAdvice(JoinPoint jp) {
//        System.out.println("Im in after ...");
//        final Signature signature = jp.getSignature();
//        System.out.println(signature);
//        final Object target = jp.getTarget();
//        System.out.println(target);
//        System.out.println("******************************");
//    }
//
//    @AfterReturning(value = "applePointCut()" , returning = "res")
//    private void amirAfterRetAdvice(JoinPoint jp , Object res){
//        System.out.println("Im in AfterReturn");
//        System.out.println(jp.getSignature());
//        System.out.println(res.toString());
//        System.out.println(jp.getTarget());
//
//        System.out.println("******************************");
//    }
//
//    @AfterThrowing(value = "applePointCut()" , throwing = "error")
//    private void amirAfterThrow(JoinPoint jp, Throwable error){
//        System.out.println("Im in AfterReturn");
//        System.out.println(jp.getSignature());
//        System.out.println(error.toString());
//        System.out.println(jp.getTarget());
//
//        System.out.println("******************************");
//    }
//
//    @Around( "applePointCut()")
//    public Object amirAround(ProceedingJoinPoint pjp) throws Throwable {
//        System.out.println("before");
//        final Object obj = pjp.proceed();
//        System.out.println("after");
//        return obj;
//
//    }

}
