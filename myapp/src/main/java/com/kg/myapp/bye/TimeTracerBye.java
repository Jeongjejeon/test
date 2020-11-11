package com.kg.myapp.bye;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TimeTracerBye {
	
	@Around(value="within(com.kg.myapp.bye.ByeService)")
	public Object trace(ProceedingJoinPoint joinPoint) throws Throwable {
		Signature s = joinPoint.getSignature();
		System.out.println("클래스 : "+s.getDeclaringTypeName()+", 메서드 : "+s.getName());
		System.out.println("시작 시간 : "+new java.util.Date());
		long startTime = System.currentTimeMillis();
		Object result = joinPoint.proceed();
		long endTime = System.currentTimeMillis();
		System.out.println("종료 시간 : "+new java.util.Date());
		System.out.println("클래스 : "+s.getDeclaringTypeName()+", 메서드 : "+s.getName()+" 종료");
		System.out.printf("실행 시간 : %.4f",(endTime-startTime)/1000.0);
		return result;
	}

}
