package com.example.spring.aop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinPointConfig {
	@Pointcut("execution(* com.example.spring.aop.business.*.*(..))")
	public void businessLayer() {}
	
	@Pointcut("@annotation(com.example.spring.aop.aspect.TrackTime)")
	public void trackTimeAnnotation() {}
}
