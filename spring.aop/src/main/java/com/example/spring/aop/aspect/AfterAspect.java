package com.example.spring.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AfterAspect {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@AfterReturning(value="execution(* com.example.spring.aop.business.*.*(..))",
			returning = "result")
	public void afterReturn(JoinPoint joinPoint, Object result)
	{
		logger.info("{} returned with value {}", joinPoint, result);
	}
	
	@AfterThrowing(value="execution(* com.example.spring.aop.business.*.*(..))",
			throwing = "exception")
	public void afterThrow(JoinPoint joinPoint, Object exception)
	{
		logger.info("{} returned with value {}", joinPoint, exception);
	}
	
	@After("execution(* com.example.spring.aop.business.*.*(..))")
	public void after(JoinPoint joinPoint)
	{
		logger.info("Completed {}", joinPoint);
	}
}
