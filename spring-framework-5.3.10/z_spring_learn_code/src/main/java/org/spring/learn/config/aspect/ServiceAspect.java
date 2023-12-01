package org.spring.learn.config.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * UserServiceProxy -> 代理对象 -> 代理对象.Target = 普通对象
 */

@Aspect
@Component
public class ServiceAspect {

	@Before("execution(public void org.spring.learn.service.UserService.*())")
	public void beforeServiceMethodCall(JoinPoint joinPoint) {
		System.out.println("-------------------------- before userService call ----------------------------");
		System.out.println("target: " + joinPoint.getTarget());
		System.out.println("Signature: " + joinPoint.getSignature());
		System.out.println("--------------------------------------------------------");
	}


	@After("execution(public void org.spring.learn.service.UserService.*())")
	public void afterServiceMethodCall(JoinPoint joinPoint) {
		System.out.println("----------------------------- after userService call  ---------------------------");
		System.out.println("target: " + joinPoint.getTarget());
		System.out.println("Signature: " + joinPoint.getSignature());
		System.out.println("--------------------------------------------------------");
	}
}
