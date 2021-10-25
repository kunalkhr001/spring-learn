package com.example.spring.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class BeforeAspect {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Before("com.example.spring.aop.aspect.CommonJoinPointConfig.businessLayer()")
	public void before(JoinPoint joinPoint)
	{
		logger.info("Intercepted method calls - {}", joinPoint);
	}
}
