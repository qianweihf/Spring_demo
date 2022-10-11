package com.atguigu.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @author qianwei
 * @version V1.0
 * @create 2022-10-09
 */
/*
切面类
1. 额外功能
    public class MyArround implements MethodInterceptor{
        public object invoke(MethodInvocation invocation){
            Object ret = invocation.proceed();
            return ret;
        }
    }
2. 切入点
    <aop:config>
        <aop:pointcut id="pc" expression="execution(* login(..))" />
        <aop:advisor advice-ref="before" pointcut-ref="pc" />
    </aop:config>
 */

@Aspect
public class MyAspect {

    @Pointcut("execution(* *..UserServiceImpl.*(..))")
    public void myPointcut(){}

    @Around(value="myPointcut()")
    public Object arround(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("---aspect log---");
        Object ret = joinPoint.proceed();
        return ret;
    }

    @Around(value="myPointcut()")
    public Object arround1(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("---aspect tx---");
        Object ret = joinPoint.proceed();
        return ret;
    }
}
